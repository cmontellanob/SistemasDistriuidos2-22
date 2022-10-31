/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.io.Serializable;

/**
 *
 * @author alfa6
 */
public class Empresa implements Serializable{
    private String nombre;
    private Long Nit;

    public Empresa(String nombre, Long Nit) {
        this.nombre = nombre;
        this.Nit = Nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNit() {
        return Nit;
    }

    public void setNit(Long Nit) {
        this.Nit = Nit;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", Nit=" + Nit + '}';
    }
    
}
