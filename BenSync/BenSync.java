import java.net.*;
import java.io.*;
import java.util.*;

public class BenSync{

    private ObjectOutputStream output;
    private ObjectInputStream input;
    private HashMap<String, BenCommand> commands = new HashMap<String, BenCommand>(); 
    private HashMap<String, BenCommandFree> freeCommands = new HashMap<String, BenCommandFree>();
    private ArrayList<Request> requestQueue = new ArrayList<Request>();
    private boolean connected = true;
    public final static int RESPONSE_SUCCESS = 1, RESPONSE_FAILURE = -1;

    public BenSync(Socket s){
        try{
            output = new ObjectOutputStream(s.getOutputStream());
            output.flush();
            input = new ObjectInputStream(s.getInputStream());

        }
        catch(IOException e){
            System.out.println("Error creating BenSync streams.");
        }
    }

    public void startStreaming(){
        new BenInputStreamThread().start();
    }

    public void stop(){
        connected = false;
        try{
            output.close();
            input.close();
        }
        catch(IOException e){
            System.out.println("Error shutting down.");
        }
    }

    public void on(String d, BenCommand c){
        commands.put(d, c);
    }

    public void respond(Request r, Object data){
        Response res = new Response();

        res.setID(r.getID());
        res.setStatus(BenSync.RESPONSE_SUCCESS);
        res.setData(data);

        try{
            output.writeObject(res);
            output.flush();
        }
        catch(IOException e){
            System.out.println("Error sending response");
        }
    }

    public void respondWithFailure(Request x, String mess){
        Response r = new Response();

        r.setID(x.getID());
        r.setErrMessage(mess);
        r.setStatus(BenSync.RESPONSE_FAILURE);

        try{
            output.writeObject(r);
            output.flush();
        }
        catch(IOException e){
            System.out.println("Error sending response failure");
        }   
    }

    public Request request(String dtype, Object d){
        Request r = new Request(dtype);
        r.setData(d);

        try{
            requestQueue.add(r);
            output.writeObject(r);
            output.flush();
        }
        catch(IOException e){
            System.out.println("Error sending request");
            requestQueue.remove(requestQueue.size() - 1);
        }
        return r;
    }

    private class BenInputStreamThread extends Thread{
        public void run(){
            do{
                try{
                    Object incoming = input.readObject();
                    new PacketHandler(incoming).start();
                }
                catch(SocketException s){
                    
                }
                catch(EOFException e){
                
                }
                catch(IOException e){
                    System.out.println("Error receiving incoming packet");
                    e.printStackTrace();
                    break;
                }
                catch(ClassNotFoundException c){
                    System.out.println("Error receiving incoming packet due to odd data");
                }

            }while(connected);
        }
    }

    private class PacketHandler extends Thread{

        private Object incoming;

        public PacketHandler(Object incoming){
            this.incoming = incoming;
        }

        public void run(){
            if(incoming instanceof Request){

                Request incomingRequest = (Request)incoming;
                if(commands.containsKey(incomingRequest.getDataType())){
                    commands.get(incomingRequest.getDataType()).run(incomingRequest);
                } else {
                    respondWithFailure(incomingRequest, "Client cannot respond to request for \"" + incomingRequest.getDataType() + "\"");
                }

            } else if(incoming instanceof Response){

                Response incomingResponse = (Response)incoming;

                for(int i = 0; i < requestQueue.size(); i++){
                    if(requestQueue.get(i).getID() == incomingResponse.getID()){
                        //Paired live request with response
                        requestQueue.get(i).setResponse(incomingResponse);
                        requestQueue.remove(i);
                    }
                }
            } 
        }
    }

}

class Request implements Serializable{
    private final static String type = "req";
    private String dataType;
    private final int id = (int)(Math.random() * 100000);
    private Object data;
    private Response satisfiedResponse = null;
    private boolean satisfied = false;

    public Request(String dtp){
        dataType = dtp;
    }

    public String getDataType(){
        return dataType;
    }

    public Response getResponse(){
        do{
            try{
                Thread.sleep(10);//System.out.println(satisfied);
            }
            catch(InterruptedException e){

            }
        }while(!satisfied);

        return satisfiedResponse;
    }

    public int getID(){
        return id;
    }

    public void setResponse(Response r){
        satisfiedResponse = r;
        satisfied = true;
    }

    public void setData(Object d){
        this.data = d;
    }

    public Object getData(){
        return data;
    }

}

class Response implements Serializable{
    private final static String type = "res";
    private int id;
    private Object data;
    private int status;
    private String errMessage = "No Error Message Has Been Set";

    public int getStatus(){
        return status;
    }

    public void setStatus(int s){
        status = s;
    }

    public Object value(){
        return data;
    }

    public String getErrMessage(){
        return errMessage;
    }

    public void setErrMessage(String m){
        errMessage = m;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setData(Object d){
        data = d;
    }

    public Object getData(){
        return data;
    }

}

interface BenCommand{
    public void run(Request r);
}

