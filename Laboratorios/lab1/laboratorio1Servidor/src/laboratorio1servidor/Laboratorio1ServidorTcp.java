/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alfa6
 */
public class Laboratorio1ServidorTcp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int port = 5002;

        try {

            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;
            client = server.accept(); //conexion
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            //System.out.println(fromClient.readLine());
            String cadena = fromClient.readLine();
            String[] parts = cadena.split("_");
            String parte1 = parts[0];
            String parte2 = parts[1];
            int num = 0;
            if (parte1.equals("factorial")) {
                int a = Integer.parseInt(parte2);
                num = Factorial(a);
                String respuesta = String.valueOf(num);
                toClient = new PrintStream(client.getOutputStream());
                toClient.println(respuesta);
            } else if (parte1.equals("fibonacci")) {
                int a = Integer.parseInt(parte2);
                num = Fibonacci(a);
                String respuesta = String.valueOf(num);
                toClient = new PrintStream(client.getOutputStream());
                toClient.println(respuesta);
            } else if (parte1.equals("sumatoria")) {
                int a = Integer.parseInt(parte2);
                num = Sumatoria(a);
                String respuesta = String.valueOf(num);
                toClient = new PrintStream(client.getOutputStream());
                toClient.println(respuesta);
            }

            System.out.println("Cliente se conecto");

        } catch (IOException e) {
            System.out.println(e.getMessage());
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
