/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrmi;

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
public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Introduzca unnumero");
       int n=sc.nextInt();
       
       // Operacion operacion=new Operacion();
       IOperacion operacion;
        try {
            operacion = (IOperacion)Naming.lookup("rmi://localhost/Operacion"); // instanciar un objeto remoto
             System.out.print("el factorial de "+n+" es:"+operacion.Factorial(n));
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       
        // TODO code application logic here
       
      
       
        // TODO code application logic here
    }
    
}
