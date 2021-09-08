package com.company;

public class Cantantes extends Persona{
    private String nombreArtistico;
    private int albunes;

    public Cantantes(String nombre, String apellido, int edad, String nombreArtistico, int albunes) {
        super(nombre, apellido, edad);
        this.nombreArtistico=nombreArtistico;
        this.albunes=albunes;
    }

    @Override
    public String toString(){
        String elementosConcatenados;
        if(albunes>3){
            elementosConcatenados="nombre artistico: " + nombreArtistico;
            return elementosConcatenados;
        }

    }

}
