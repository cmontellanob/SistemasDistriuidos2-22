/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soquetstcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ServidorTCP {
      public static void main(String[] args) {
        int port = 5002; 
              
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;       
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            System.out.println(fromClient.readLine());
            toClient = new PrintStream(client.getOutputStream()); 
            toClient.println("Hola Mundo");
            System.out.println("Cliente se conecto");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
