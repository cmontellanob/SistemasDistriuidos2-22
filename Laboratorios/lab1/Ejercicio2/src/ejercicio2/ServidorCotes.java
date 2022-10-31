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
public class ServidorCotes extends UnicastRemoteObject implements ICotes {
  Empresa empresa;

    public ServidorCotes() throws RemoteException {
        super();
        empresa=new Empresa ("Cotes",341233);
    }
    

    @Override
    public Facturas[] pedientes(int idcliente) throws RemoteException {
    Facturas[] aux=null;
        switch (idcliente){
            case 1:
            aux=new Facturas[2];
            aux[0]=new Facturas(empresa,144,Mes.diciembre,2021,170);
            aux[1]=new Facturas(empresa,321,Mes.enero,2022,100);
            aux[2]=new Facturas(empresa,2494,Mes.febreo,2022,150);
            break;
        }
        return aux;
    }

    @Override
    public String pagar(Facturas[] facturas) throws RemoteException {
        return "pagado";
    }

    
}
