package assignment2;

import java.io.IOException;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args){
        Server server = new Server();
        Client client = new Client();

        try{
            server.start();
            client.startClient();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
