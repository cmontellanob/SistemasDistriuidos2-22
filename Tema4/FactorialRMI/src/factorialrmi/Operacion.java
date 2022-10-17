/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class Operacion extends UnicastRemoteObject implements IOperacion{

    public Operacion() throws RemoteException {
        super();
    }
    
    @Override
    public int Factorial(int n) {
        int fac=1;
        for (int i=2;i<=n;i++)
        {
            fac*=i;
        }
        return fac;
    }
    
}
