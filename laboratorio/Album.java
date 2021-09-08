package com.company;
import java.util.Scanner;

public class Album extends Cantantes{
    private String nombreAlbum;
    private String canciones;
    private static float precioMinimo;
    public Album(String nombre, String apellido, int edad, String nombreArtistico,int albunes, String nombreAlbum,  String canciones, float precioMinimo) {
        super(nombre, apellido, edad, nombreArtistico, albunes);
        this.nombreAlbum=nombreAlbum;
        this.canciones = canciones;
        this.precioMinimo=precioMinimo;
    }

    public void precioMinimoCanciones(){
        precioMinimo=500+albunes;
        System.out.println("el precio de la cancion es: " + precioMinimo);
    }

    @Override
    public String toString(){
        String salto = System.lineSeparator();
        String elementosConcatenados;
        String elementosConcatenados2;
        for(Album a : this.canciones){
            elementosConcatenados="nombre: " + nombre + salto + canciones +" = " +precio;
            return elementosConcatenados;
        }
        elementosConcatenados2="nombre: " + nombre + salto + "apellido:" +apellido +salto+ "edad:"+edad+salto+"nombre artistico:"+nombreArtistico+ salto+ "-Album:"+nombreAlbum+salto+canciones;
        return elementosConcatenados2;
    }

}
