package com.company;

public class bebidasAlcoholicas extends bebidas{
    private int cantAlcohol;

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    public bebidasAlcoholicas(String nombre, int cantAlcohol) {
        super(nombre);
        this.setCP(0);
        this.setCN(cantAlcohol*20);
    }
}
