/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import static laboratorio1servidor.Laboratorio1ServidorTcp.Factorial;
import static laboratorio1servidor.Laboratorio1ServidorTcp.Fibonacci;
import static laboratorio1servidor.Laboratorio1ServidorTcp.Sumatoria;

/**
 *
 * @author alfa6
 */
public class Laboratorio1ServidorUdp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port = 6789;
        try {

            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[2000];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion
                        = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde enl puerto remoto: "
                        + peticion.getPort());

                String cadena = new String(peticion.getData());
                String[] parts = cadena.split("_");
                String parte1 = parts[0];
                String parte2 = parts[1];
                int valor = Integer.valueOf(parte2.trim());
                System.out.println(" valor enviado: " + valor
                );
                // Construimos el DatagramPacket para enviar la respuesta

                int num = 0;
                if (parte1.equals("factorial")) {
                    int a = Integer.parseInt(parte2);
                    num = Factorial(a);
                    int resp = (num);
                    String response = String.valueOf(resp);
                    byte[] mensaje = response.getBytes();

                    DatagramPacket respuesta
                            = new DatagramPacket(mensaje, response.length(),
                                    peticion.getAddress(), peticion.getPort());

                    // Enviamos la respuesta, que es un eco
                    socketUDP.send(respuesta);

                } else if (parte1.equals("fibonacci")) {
                    int a = Integer.parseInt(parte2);
                    num = Fibonacci(a);
                    int resp = (num);
                    String response = String.valueOf(resp);
                    byte[] mensaje = response.getBytes();

                    DatagramPacket respuesta
                            = new DatagramPacket(mensaje, response.length(),
                                    peticion.getAddress(), peticion.getPort());

                    // Enviamos la respuesta, que es un eco
                    socketUDP.send(respuesta);

                } else if (parte1.equals("sumatoria")) {
                    int a = Integer.parseInt(parte2);
                    num = Sumatoria(a);
                    int resp = (num);
                    String response = String.valueOf(resp);
                    byte[] mensaje = response.getBytes();

                    DatagramPacket respuesta
                            = new DatagramPacket(mensaje, response.length(),
                                    peticion.getAddress(), peticion.getPort());

                    // Enviamos la respuesta, que es un eco
                    socketUDP.send(respuesta);

                }
            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }

    static int Factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Factorial(num - 1);
        }
    }

    static int Fibonacci(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }
    }

    static int Sumatoria(int num) {
        int sumatoria = 0;
        int contador = num;
        while (contador != 0) {
            sumatoria += contador;
            contador--;
        }
        return sumatoria;
    }
}
