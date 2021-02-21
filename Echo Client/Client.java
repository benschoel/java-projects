import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client{
    private Scanner scan = new Scanner(System.in);
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Socket connection;

    public void connect(String ip, int port){
        try{
            connection = new Socket(ip, port);
            output = new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());
            output.flush();
            String d;

            do{

                System.out.print("Enter your message: ");
                d = scan.nextLine();
                output.writeObject(d);
                output.flush();

                try{
                    String response = (String)input.readObject();
                    System.out.println(response);
                }
                catch(ClassNotFoundException c){
                    System.out.println("Weird data has been sent to you...");
                }

            }while(!d.equals("exit"));

            System.out.println("Exiting...");

            shutdown();
        }catch(IOException i){
            System.out.println(i);
        }

    }

    public void shutdown(){
        try{
            output.close();
            connection.close();
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}