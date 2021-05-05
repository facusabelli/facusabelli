package com.company;
import java.util.Scanner;

public class Producto{

    private String nombre;
    private float precio;

    public Producto(String nuevoNombre, float nuevoPrecio){
        nombre = nuevoNombre;
        precio = nuevoPrecio;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void registroProducto(Scanner ingreso1,Scanner ingreso2){
        String registroNombre = this.nombre;
        float registroPrecio = this.precio;
        registroNombre = ingreso1.nextLine();
        registroPrecio = ingreso2.nextFloat();
    }

    public void imprimirRegistro(Scanner ingreso1, Scanner ingreso2){
        Scanner ingresoNombre1 = new Scanner(System.in);
        Scanner ingresoPrecio1 = new Scanner(System.in);
        ingresoNombre1 = ingreso1;
        ingresoPrecio1 = ingreso2;
        System.out.println(ingresoNombre1);
        System.out.println(ingresoPrecio1);
    }
}

