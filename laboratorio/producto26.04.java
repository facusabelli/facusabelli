package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Producto {

    private String nombre;
    private float precio;

    public Producto(String nuevoNombre, float nuevoPrecio) {
        nombre = nuevoNombre;
        precio = nuevoPrecio;
      }

      public String getNombre() {
        return nombre;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
 
     public float getPrecio() {
         return precio;
     }
     public void setPrecio(float precio) {
         this.precio = precio;
     }
}