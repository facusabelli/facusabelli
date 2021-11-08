package com.company;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

public class consumidor {
    private String nombre;
    private String apellido;
    private int DNI;
    private HashMap<bebidas, Integer> cantBebida;

    public int coeficienteHidratacion(){
        int coeficienteFinal = 0;
        for (bebidas bebida:this.cantBebida.keySet()) {
            int cantidadTomada=this.cantBebida.get(bebida);
            int calculoCoeficiente= bebida.getCP()-bebida.getCN();
            coeficienteFinal+=cantidadTomada*calculoCoeficiente;
        }
        return coeficienteFinal;
    }

    public String bebidasTomadas(){
        String bebidas="";
        for (bebidas bebida:this.cantBebida.keySet()) {
           bebidas += " "+bebida.getNombre();
        }
        return bebidas;
    }

    public HashMap<bebidas, Integer> getCantBebida() {
        return cantBebida;
    }
}
