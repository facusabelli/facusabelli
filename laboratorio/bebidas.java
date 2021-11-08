package com.company;

public abstract class bebidas {
    private String nombre;
    private int CP;
    private int CN;


    public bebidas(String nombre) {
        this.nombre = nombre;
        this.CP = Integer.parseInt(null);
        this.CN = Integer.parseInt(null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getCN() {
        return CN;
    }

    public void setCN(int CN) {
        this.CN = CN;
    }
}
