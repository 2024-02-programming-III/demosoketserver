package co.edu.uptc.models;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class AdminClients {
    
  private ArrayList<ClientModel> clients;
  private int idClient =0;

  private ServerSocket serverSocket;
  private int port;

  public AdminClients(int port) throws IOException{
    this.port = port;
    clients = new ArrayList<>();
     openServer();
  }

  public void openServer() throws IOException{
    serverSocket = new ServerSocket(port);
  }

  private void acceptClient() throws IOException{
    System.out.println("Waiting client");
      Socket socket = serverSocket.accept();
      ClientModel clientModel = new ClientModel(socket,idClient++);    
      clients.add(clientModel);
  }


  public void acceptClients() throws IOException{
    while (true) {
        
        acceptClient();
    }
  }



}
