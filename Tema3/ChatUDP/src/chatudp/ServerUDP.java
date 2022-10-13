/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ServerUDP {

  public static void main (String args[]) { 
      ArrayList<Conexion> lista= new ArrayList<Conexion>();
    int port=6789;  
    
    try {
      
      DatagramSocket socketUDP = new DatagramSocket(port);
      byte[] bufer = new byte[1000];
      String respuesta="";
      String ip="";
      String origen="";
      while (true) {
        // Construimos el DatagramPacket para recibir peticiones
        DatagramPacket peticion =
          new DatagramPacket(bufer, bufer.length);

        // Leemos una petición del DatagramSocket
        socketUDP.receive(peticion);
        String cadena =new String (peticion.getData());
        String[] comando=cadena.split(":");
        switch (comando[0]){
            case "identificarse":
                lista.add(new Conexion(comando[1],peticion.getAddress().toString()));
                respuesta="mensaje:Conectado";
                ip=peticion.getAddress().toString();
                break;
            case "mensaje":
                // buscar al destinatario 
                String destinatario=comando[1];
                boolean encontro=false;
                
                for (Conexion c:lista)
                {
                    if (c.nombre.equals(destinatario))
                    {
                        encontro=true;
                        ip=c.ip;
                    }
                }
                // buscar al autor del mensaje
                
                
                 respuesta="recibido:"+origen+":"+comando[2];
                
                 // codigo para enviar al origen que se envio el mensaje
                 
                
                        break;
            case "desconectarse":
                break;    
                
        }
        
       InetAddress hostDestino = InetAddress.getByName(ip);
       String response=String.valueOf(respuesta);
       byte[] mensaje = respuesta.getBytes();
       DatagramPacket paqueterespuesta =
          new DatagramPacket(mensaje, response.length(),
                             hostDestino, peticion.getPort());

        // Enviamos la respuesta, que es un eco
        socketUDP.send(paqueterespuesta);
      }

    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }

}

    

