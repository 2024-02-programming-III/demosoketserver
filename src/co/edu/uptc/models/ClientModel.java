package co.edu.uptc.models;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientModel {

    private Socket socket;
    private int id;

    public ClientModel(Socket socket, int id ){
        this.socket = socket;
        this.id = id;
        System.out.println("Client id: "+id);
    }
    
  public void sendMessage(String value) throws IOException{
     PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
     out.println(value);      
  }

}
