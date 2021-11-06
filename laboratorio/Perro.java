package com.company;

public class Perro extends Mascota implements FuncionesAnimales{
    private int energia;

    public Perro(String nombre, String tipo, String nombreDueño) {
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
        System.out.println("guau");
    }

    @Override
    public void saludoExtraño() {
        System.out.println("GUAU!");
    }

    @Override
    public void tipoMascota() {
        System.out.println("tu mascota es: " + tipo);
    }

    @Override
    public void saludoProlongado() {
        for (int i = 0; i < this.energia ; i++){
            System.out.println("guau");
        }
    }
}
