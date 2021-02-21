import java.net.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client{

    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Socket connection;
    private String username;
    private Scanner scan = new Scanner(System.in);
    private JTextArea chatWindow;
    private JTextField messageInput;
    private JScrollPane chatWindowScrollPane;

    public Client(String host, int port){

        JFrame frame = new JFrame();
        frame.setSize(600, 300);
        frame.setResizable(false);
        frame.setTitle("Ben's Chat App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatWindow = new JTextArea("Loading...");
        chatWindow.setVisible(true);
        chatWindow.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        chatWindow.setFont(new Font("Sans Serif", Font.PLAIN, 15));
        chatWindow.setEditable(false);

        chatWindowScrollPane = new JScrollPane(chatWindow);
        frame.add(chatWindowScrollPane, BorderLayout.CENTER);
        messageInput = new JTextField();
        messageInput.setVisible(true);
        messageInput.setEditable(false);
        messageInput.addActionListener(new EventHandler());

        frame.add(messageInput, BorderLayout.SOUTH);
        frame.setVisible(true);
        try{
            connection = new Socket(host, port);
            output = new ObjectOutputStream(connection.getOutputStream());
            input = new ObjectInputStream(connection.getInputStream());
            output.flush();
            addMessage("Successfully connected to server");

            do{
                username = JOptionPane.showInputDialog("Enter a username: ");
                if(username == null){
                    username = "User";
                }
            }while(username.equals(""));

            messageInput.setEditable(true);
            messageInput.requestFocus();

            String comingIn = "";
            do{
                try{
                    comingIn = (String)input.readObject();
                    addMessage(comingIn);
                }
                catch(ClassNotFoundException u){
                    addMessage("Odd Data Has Been Sent");
                }

            }while(true);

        }
        catch(UnknownHostException e){
            System.out.println("Invalid Host");
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

    public void addMessage(String s){
        chatWindow.append("\n" + s);
        chatWindow.setCaretPosition(chatWindow.getDocument().getLength());
    }

    public void sendMessage(String s){
        try{
            output.writeObject(username + ": " + s);
            output.flush();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

    private class EventHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String toSend = e.getActionCommand();
            sendMessage(toSend);
            JTextField j = (JTextField)e.getSource();
            j.setText("");
        }
    }

}

