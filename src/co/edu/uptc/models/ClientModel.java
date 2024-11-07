package co.edu.uptc.models;

import java.net.Socket;

public class ClientModel {

    private Socket socket;
    private int id;

    public ClientModel(Socket socket, int id ){
        this.socket = socket;
        this.id = id;
        System.out.println("Client id: "+id);
    }
    
}
