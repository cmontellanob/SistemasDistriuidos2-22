/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.Serializable;

/**
 *
 * @author alfa6
 */
public class Empresa implements Serializable{
    private String nombre;
    private int Nit;

    public Empresa(String nombre, int Nit) {
        this.nombre = nombre;
        this.Nit = Nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", Nit=" + Nit + '}';
    }
    
}
