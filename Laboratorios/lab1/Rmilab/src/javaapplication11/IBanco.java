/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication11;

import java.rmi.RemoteException;

/**
 *
 * @author alfa6
 */
public interface IBanco {
    public Facturas[] calcuar(int idcliente) throws RemoteException;
    public String pagar(Facturas[] facturas) throws RemoteException;

}
