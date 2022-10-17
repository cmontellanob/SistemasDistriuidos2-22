/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package listaalumnos;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IListaAlumnos extends Remote {
    public void insertar(Alumno alumno) throws RemoteException;
    public Alumno[] getAlumnos() throws RemoteException;
    
}
