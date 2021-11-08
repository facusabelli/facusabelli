package com.company;

public class bebidasAzucaradas extends bebidas{
    private int cantAzucar;

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public bebidasAzucaradas(String nombre, int cantAzucar) {
        super(nombre);
        this.setCP(1);
        this.cantAzucar=cantAzucar;
        this.setCN(cantAzucar*10);
    }
}
