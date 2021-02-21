import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client{

    private BenSync mainBenSync;
    private Socket connection;
    private String host;
    private int port;
    private JFrame frame;
    private JScrollPane pane;
    private JTextArea window;
    private JTextField textInput;
    private final int id = (int)(Math.random() * 10000);

    public Client(String host, int port){
        this.host = host;
        this.port = port;
    }

    public void setupScreen(){
        frame = new JFrame("BenChat");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    Request req = mainBenSync.request("leaving", "");
                    Response res = req.getResponse();
                    if(res.getStatus() == BenSync.RESPONSE_SUCCESS){
                        mainBenSync.stop();
                        System.exit(0);
                    } else {
                        System.out.println(res.getErrMessage());
                    }
                }
            });

        window = new JTextArea();
        window.setEditable(false);
        window.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        window.setFont(new Font("Sans-Serif", Font.PLAIN, 15));
        window.setLineWrap(true);

        pane = new JScrollPane(window);
        frame.add(pane, BorderLayout.CENTER);

        textInput = new JTextField();
        frame.add(textInput, BorderLayout.SOUTH);
        textInput.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Message toSend = new Message(e.getActionCommand(), id);
                Request r = mainBenSync.request("broadcast", toSend);
                Response res = r.getResponse();
                textInput.setText("");
            }
        });

    }

    public void connect(){
        setupScreen();
        try{

            connection = new Socket(host, port);
            mainBenSync = new BenSync(connection);
            mainBenSync.on("updateNumOfUsers", new BenCommand(){
                public void run(Request req){
                    
                    frame.setTitle("BenChat: " + ((int)(req.getData()) - 1) + " users");
                    
                    mainBenSync.respond(req, "");
                }
            });
            mainBenSync.on("addMessage", new AddMessageHandler());
            mainBenSync.on("show-screen", new BenCommand(){
                    public void run(Request r){
                        frame.setVisible(true);
                        mainBenSync.respond(r, "");
                    }
                });
            mainBenSync.on("clientid", new BenCommand(){
                    public void run(Request r){
                        mainBenSync.respond(r, id);
                    }
                });
            mainBenSync.on("username", new UsernameRequestHandler());
            mainBenSync.startStreaming();
            System.out.println("Successfully connected"); 

        }
        catch(UnknownHostException e){
            System.out.println("Unknown Host \"" + host + "\"");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    
    public void showMessage(String s){
        window.append(s + "\n");
        JScrollBar vertical = pane.getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }

    private class UsernameRequestHandler implements BenCommand{
        public void run(Request r){
            boolean validUsername = false;
            String usernameToSend = "";

            do{
                usernameToSend = JOptionPane.showInputDialog("Enter a username: ");
                if(usernameToSend == null || usernameToSend.equals("")){
                    validUsername = false;
                } else {
                    Request req = mainBenSync.request("username-valid", usernameToSend);
                    Response res = req.getResponse();
                    if(res.getStatus() == BenSync.RESPONSE_SUCCESS){
                        validUsername = true; 
                    } else {
                        JOptionPane.showMessageDialog(null, res.getErrMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        validUsername = false;
                    }
                }

            }while(!validUsername);

            mainBenSync.respond(r, usernameToSend);

        }
    }

    private class AddMessageHandler implements BenCommand{
        public void run(Request req){
            showMessage((String)req.getData());
        }
    }

    public static void main(String[] args){
        Client client = new Client("104.131.183.66", 1738);
        client.connect();
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