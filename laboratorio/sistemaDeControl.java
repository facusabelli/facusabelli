package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class sistemaDeControl implements sistema {
    private HashSet<consumidor> consumidores;
    @Override
    public consumidor personaConMejorCoeficienteDeHidratacion(){
        consumidor mejorConsumidor = null;
        for (consumidor consumidor:this.consumidores) {
            consumidor.coeficienteHidratacion();
            if (mejorConsumidor.coeficienteHidratacion()<consumidor.coeficienteHidratacion()){
                mejorConsumidor=consumidor;
            }
        }
        return mejorConsumidor;
    }

    @Override
    public consumidor personaConPeorCoeficienteDeHidratacion() {
        consumidor mejorConsumidor = null;
        for (consumidor consumidor:this.consumidores) {
            consumidor.coeficienteHidratacion();
            if (mejorConsumidor.coeficienteHidratacion()>consumidor.coeficienteHidratacion()){
                mejorConsumidor=consumidor;
            }
        }
        return mejorConsumidor;
    }

    @Override
    public HashSet<String> nombresDeBebidasConsumidas(){ 
        
    }

    @Override
    public String nombreDeBebidaMasConsumida() {
        return null;
    }
}
