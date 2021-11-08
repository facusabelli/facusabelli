package com.company;

public class bebidasNeutras extends bebidas {

    public bebidasNeutras(String nombre) {
        super(nombre);
    }

    public bebidasNeutras(String nombre, int CP, int CN) {
        super(nombre);
        this.setCP(CP);
        this.setCN(CN);
    }


}
