import java.net.*;
import java.io.*;

public class Server{
    private int port;
    private ServerSocket serverSocket;
    private Socket connection;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public Server(int port){
        this.port = port;
    }

    public void startRunning(){
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Successfully started server on port " + port);

            connection = serverSocket.accept();
            System.out.println("Successfully connected to a client...\n");
            input = new ObjectInputStream(connection.getInputStream());
            output = new ObjectOutputStream(connection.getOutputStream());
            String d;
            try{
                do{
                    d = (String)input.readObject();
                    output.writeObject(d);
                    output.flush();
                }while(!d.equals("exit"));
            }
            catch(ClassNotFoundException c){
                System.out.println("This dude sent some weird stuff to you...");
            }

            shutdown();
        }
        catch(IOException i){
            System.out.println(i);
        }
    }

    public void shutdown(){
        try{
            serverSocket.close();
            connection.close();
            input.close();
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}