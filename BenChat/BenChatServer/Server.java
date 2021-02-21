import java.io.*;
import java.net.*;
import java.util.*;

public class Server{

    private ServerSocket serverSocket;
    private int port;
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<BenSync> outputs = new ArrayList<BenSync>();
    private ArrayList<Message> messages = new ArrayList<Message>();

    public Server(int port){
        this.port = port;
        users.add(new User(-1000, "Server"));
    }

    public void start(){
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server running on port " + port);

            do{
                new ClientThread(serverSocket.accept()).start();
            }while(true);

        }
        catch(IOException e){
            System.out.println("ERROR CREATING SERVER ON PORT " + port);
        }
    }

    public static void main(String[] args){
        Server server = new Server(1738);
        server.start();
    }

    public class ClientThread extends Thread{

        private Socket connection;
        private boolean connected = true;
        private BenSync mainBenSync;
        private User currUser;

        public ClientThread(Socket s){
            connection = s;       
        }

        public void run(){
            mainBenSync = new BenSync(connection);
            outputs.add(mainBenSync);
            mainBenSync.on("username-valid", new UsernameValidHandler());
            mainBenSync.on("leaving", new UserExitHandler());
            mainBenSync.on("broadcast", new IncomingMessageHandler());
            mainBenSync.startStreaming();
            System.out.println("Successfully Connected To New Client.");

            String username = getUsername();
            int userid = getClientID();

            currUser = new User(userid, username);
            users.add(currUser);

            Request r = mainBenSync.request("show-screen", "");
            Response res = r.getResponse();
            if(res.getStatus() == BenSync.RESPONSE_FAILURE){
                System.out.println(res.getErrMessage());
            }

            sendToAll(currUser.getUsername() + " has joined the chat");

            for(int i = 0; i < outputs.size(); i++){
                Request numReq = outputs.get(i).request("updateNumOfUsers", users.size());
                Response numRes = numReq.getResponse();
            }

        }    

        public String getUsername(){
            Request usernameReq = mainBenSync.request("username", "");
            Response usernameRes = usernameReq.getResponse();
            if(usernameRes.getStatus() == BenSync.RESPONSE_SUCCESS){
                return (String)usernameRes.getData();
            } else {
                return getUsername();
            }

        }

        public int getClientID(){
            Request idReq = mainBenSync.request("clientid", "");
            Response idRes = idReq.getResponse();
            if(idRes.getStatus() == BenSync.RESPONSE_SUCCESS){
                return (int)idRes.getData();
            } else {
                return getClientID();
            }

        }

        public void sendToAll(String s){
            for(int i = 0; i < outputs.size(); i++){
                outputs.get(i).request("addMessage", s);
            }
        }

        private class UsernameValidHandler implements BenCommand{
            public void run(Request req){
                String u = (String)req.getData();
                boolean valid = true;

                for(int i = 0; i < users.size(); i++){
                    if(users.get(i).getUsername().equalsIgnoreCase(u)){
                        valid = false;
                    }
                }

                if(valid){
                    mainBenSync.respond(req, "");
                } else {
                    mainBenSync.respondWithFailure(req, "That username is already taken");	
                }

            }
        }

        private class UserExitHandler implements BenCommand{
            public void run(Request req){

                for(int i = 0; i < users.size(); i++){
                    if(users.get(i).getID() == currUser.getID()){
                        users.remove(i);
                    }
                }


                sendToAll(currUser.getUsername() + " has left the chat");
                for(int i = 0; i < outputs.size(); i++){
                    Request numReq = outputs.get(i).request("updateNumOfUsers", users.size());
                    Response numRes = numReq.getResponse();
                }
                mainBenSync.respond(req, "");
                for(int i = 0; i < outputs.size(); i++){
                    if(outputs.get(i) == mainBenSync){
                        outputs.remove(i);
                    }
                }
                mainBenSync.stop();

            }
        }

        private class IncomingMessageHandler implements BenCommand{
            public void run(Request req){
                Message mes = (Message)req.getData();
                String username = "";
                for(int i = 0; i < users.size(); i++){
                    if(users.get(i).getID() == mes.getSenderID()){
                        username = users.get(i).getUsername();
                    }
                }

                sendToAll(username + ": " + mes.getMessageContent());

                mainBenSync.respond(req, "");
            }
        }
    }
}

class Message implements Serializable{

    private String messageContent;
    private int senderID;

    public Message(String m, int c){
        messageContent = m;
        senderID = c;
    }

    public String getMessageContent(){
        return messageContent;
    }

    public int getSenderID(){
        return senderID;
    }
}

class User{

    private int id;
    private String username;

    public User(int i, String u){
        id = i;
        username = u;
    }

    public int getID(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String s){
        this.username = s;
    }

    public String toString(){
        return this.id + ": " + this.username;
    }

}

