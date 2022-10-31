/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alfa6
 */
public class ServidorCessa extends UnicastRemoteObject implements ICessa{
    Empresa empresa;
    public ServidorCessa() throws RemoteException {
        super();
        empresa=new Empresa ("Cessa",11233);
    }
    @Override
    public Facturas[] pedientes(int idcliente) throws RemoteException {
    Facturas[] aux=null;
        switch (idcliente){
            case 1:
            aux=new Facturas[2];
            aux[0]=new Facturas(empresa,154,Mes.diciembre,2021,150);
            aux[1]=new Facturas(empresa,326,Mes.enero,2022,701);
            break;
        }
        return aux;
    }
    @Override
    public String pagar(Facturas[] facturas) throws RemoteException {
        return "pagado";
    }
}
