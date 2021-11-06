package com.company;

public class Gato extends Mascota implements FuncionesAnimales{
    private int energia;

    public Gato(String nombre, String tipo, String nombreDueño) {
        super(nombre, tipo, nombreDueño);
        this.energia = 0;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void alimentar() {
        this.energia++;
    }

    @Override
    public void saludoDueño() {
        System.out.println("miau");
    }

    @Override
    public void saludoExtraño() {
        System.out.println("MIAU!");
    }

    @Override
    public void tipoMascota() {
        System.out.println("tu mascota es: " + tipo);
    }

    @Override
    public void saludoProlongado() {
        for (int i = 0; i < this.energia ; i++){
            System.out.println("miau");
        }
}
