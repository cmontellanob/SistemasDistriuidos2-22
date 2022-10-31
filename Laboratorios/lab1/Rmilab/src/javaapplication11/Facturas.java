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
public class Facturas implements Serializable{
    private Empresa empresa;
    private int idfactura;
    private Mes mes;
    private int anio;
    private double monto;

    public Facturas(Empresa empresa, int idfactura, Mes mes, int anio, double monto) {
        this.empresa = empresa;
        this.idfactura = idfactura;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Facturas{" + "empresa=" + empresa + ", idfactura=" + idfactura + ", mes=" + mes + ", anio=" + anio + ", monto=" + monto + '}';
    }
    
}
