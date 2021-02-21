import java.net.*;
import java.io.*;
import java.util.*;

public class Server{

    private ServerSocket server;
    private List<ObjectOutputStream> outputs = new ArrayList<ObjectOutputStream>();

    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            while(true){
                Handler h = new Handler(server.accept());
                h.start();
            }

        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

    class Handler extends Thread{
        private Socket connection;
        private ObjectOutputStream output;
        private ObjectInputStream input;

        public Handler(Socket s){
            connection = s;
        }

        public void run(){
            try{
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                outputs.add(output);
                System.out.println("Communication channels successfully initialized.");
                output.flush();

                String comingIn = "";
                do{
                    try{
                        comingIn = (String)input.readObject();
                        for(int i = 0; i < outputs.size(); i++){
                            try{
                                outputs.get(i).writeObject(comingIn);
                                outputs.get(i).flush();
                            }
                            catch(Exception e){
                                
                            }
                        }
                    }
                    catch(ClassNotFoundException c){
                        System.out.println("Don't Understand This Data...");
                    }

                }
                while(true);
            }
            catch(IOException i){
                i.printStackTrace();
            }
        }
    }
}

