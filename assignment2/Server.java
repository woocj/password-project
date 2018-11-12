/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.*;
//import java.io.net.*;
import java.net.Socket;
import java.net.ServerSocket;
/**
 *
 * @author Xavier
 */
public class Server {
    private int currentTot;
    ServerSocket serversocket;
    Socket client;
    int bytesRead;
    
    Implementation i = new Implementation();
    BufferedReader input;
    PrintWriter output;
    
    public void start() throws IOException{
        System.out.println("Connection starting on port " + i.getPort());
        serversocket = new ServerSocket(i.getPort());
        client = serversocket.accept();
        System.out.println("Waiting for connection from client");
                
        try{
            logInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void logInfo() throws Exception{
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
        String username = input.readLine();
        System.out.println("SERVER SIDE" + username);
        String password = input.readLine();
        System.out.println("SERVER SIDE" + password);
        
        output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
        
        if(username.equals(i.getUsername()) &&password.equals(i.getPassword())){
            output.println("Welcome, " + username);
        } else{
            output.println("Login Failed");
        }
        
        if(username.equals(i.getUsername()) && password.equals(i.getPassword())){
            output.println("Welcome, " + username);
        } else {
            output.println("Login Failed");
        }
        output.flush();
        output.close();
    }   
    

}
    