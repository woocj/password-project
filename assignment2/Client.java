/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.*;
//import java.io.net.*;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Xavier
 */
public class Client {
    private final String FILENAME = null;
    Implementation i = new Implementation();
    Socket socket;
    BufferedReader read;
    PrintWriter output;

    public void Client() throws UnknownHostException, IOException{
        //Create socket connection
        socket = new Socket(i.gethostName(), i.getPort());

        //create printwriter for sending login to server
        output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        //prompt for user name
        String username = JOptionPane.showInputDialog(null, "Enter User Name:");

        //send user name to server
        output.println(username);

        //prompt for password
        String password = JOptionPane.showInputDialog(null, "Enter Password");

        //send password to server
        output.println(password);
        output.flush();

        //create Buffered reader for reading response from server
        read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //read response from server
        String response = read.readLine();
        System.out.println("This is the response: " + response);

        //display response
        JOptionPane.showMessageDialog(null, response);
    }

    public void fileInfo(){

    }

    public void startClient() {
    }
}