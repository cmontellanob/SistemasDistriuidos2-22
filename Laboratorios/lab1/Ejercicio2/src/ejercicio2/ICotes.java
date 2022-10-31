/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio2;

import java.rmi.RemoteException;

/**
 *
 * @author alfa6
 */
public interface ICotes {
    public Facturas[] pedientes(int idcliente) throws RemoteException;
    public String pagar(Facturas[] facturas) throws RemoteException;
}
