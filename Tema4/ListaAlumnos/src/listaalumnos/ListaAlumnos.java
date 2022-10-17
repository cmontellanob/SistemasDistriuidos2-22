/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaalumnos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ListaAlumnos extends UnicastRemoteObject implements IListaAlumnos {
    ArrayList<Alumno> lista;

    public ListaAlumnos() throws RemoteException {
        super();
        lista=new ArrayList<Alumno>();
    }

    @Override
    public void insertar(Alumno alumno) {
        lista.add(alumno);
    }

    @Override
    public Alumno[] getAlumnos() {
        int l=this.lista.size();
        Alumno[] aux=new Alumno[l];
        int i=0;
        for(Alumno alumno:lista)
        {
            aux[i]=alumno;
            i++;
        }
        return aux;
    }
    
}
