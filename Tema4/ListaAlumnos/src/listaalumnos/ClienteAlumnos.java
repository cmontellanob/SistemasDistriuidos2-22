/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaalumnos;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ClienteAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int op=0;
        String nombres;
        String apellidos;
        String cu;
        IListaAlumnos lista;
        Alumno[] vector;
        try {
            lista = (IListaAlumnos)Naming.lookup("rmi://localhost/ListaAlumnos"); // instanciar un objeto remoto
      
        while (op!=3)
        {
            System.out.println("1. Insertar Alumno");
            System.out.println("2. Listar Alumnos");
            System.out.println("-----------------");
            System.out.println("Introduzca opción");
            op=sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("Introduzca nombre: ");
                    nombres=sc.next();
                    System.out.print("Introduzca apellidos: ");
                    apellidos=sc.next();
                    System.out.print("Introduzca CU: ");
                    cu=sc.next();
                    lista.insertar(new Alumno(nombres,apellidos,cu));
                    break;
                case 2:
                    
                    vector=lista.getAlumnos();
                    for(Alumno alumno:vector)
                    {
                        System.out.println(alumno);
                    }
                    break;
                    
            }
            
        }
          } catch (NotBoundException ex) {
            Logger.getLogger(ClienteAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
