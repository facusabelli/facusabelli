package com.company;

import java.util.HashSet;

public interface sistema {


    public consumidor personaConMejorCoeficienteDeHidratacion();
    public consumidor personaConPeorCoeficienteDeHidratacion();
    public HashSet<String> nombresDeBebidasConsumidas();
    public String nombreDeBebidaMasConsumida();

}
