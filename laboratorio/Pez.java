package com.company;

public class Pez extends Mascota implements FuncionesAnimales{
    private int vidas;

    public Pez(String nombre, String tipo, String nombreDueño) {
        super(nombre, tipo, nombreDueño);
        this.vidas = 10;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void sinVidas(){
        if(vidas==0){
            pez.delete();
            System.out.println("tu: " + this.tipo + "murio :(");
        }
    }

    @Override
    public void alimentar() {
        vidas++;
    }

    @Override
    public void saludoDueño() {
        vidas--;
    }

    @Override
    public void saludoExtraño() {
        vidas = 0;
    }

    @Override
    public void tipoMascota() {
        System.out.println("tu mascota es: " + this.tipo);
    }

}
