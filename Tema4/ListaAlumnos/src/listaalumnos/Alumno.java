/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaalumnos;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
class Alumno implements Serializable {
    private String nombres;
    private String apellidos;
    private String cu;

    public Alumno(String nombres, String apellidos, String cu) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cu = cu;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCu() {
        return cu;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cu=" + cu + '}';
    }
    
    
    
    
}
