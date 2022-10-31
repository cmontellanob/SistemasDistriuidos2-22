/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ServidorBanco extends UnicastRemoteObject implements IBanco {

    public ServidorBanco() throws RemoteException {
        super();
    }

    @Override
    public Facturas[] calcuar(int idcliente) throws RemoteException {
        ICessa cessa;
        ICotes cotes;
        Facturas[] facturascessa;
        Facturas[] facturascotes;
        

        try {
            cessa = (ICessa) Naming.lookup("rmi://localhost/Cessa"); // instanciar un objeto remoto
            facturascessa=cessa.pedientes(idcliente);
            
            cotes = (ICotes) Naming.lookup("rmi://localhost/Cotes"); // instanciar un objeto remoto
            facturascotes=cotes.pedientes(idcliente);
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String pagar(Facturas[] facturas) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
