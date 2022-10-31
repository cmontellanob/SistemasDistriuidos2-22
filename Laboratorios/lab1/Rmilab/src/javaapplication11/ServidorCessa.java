/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.rmi.RemoteException;

/**
 *
 * @author alfa6
 */
public class ServidorCessa implements ICessa{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public Facturas[] pedientes(int idcliente) throws RemoteException {
    Facturas[] aux=null;
        switch (idcliente){
            case 1:
            aux=new Facturas[2];
            aux[0]=new Facturas(("cessa",4587),154,"diciembre",2021,150);
            break;
        }
        return aux;
    }

    @Override
    public String pagar(Facturas[] facturas) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
