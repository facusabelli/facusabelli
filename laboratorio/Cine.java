package com.company;

import java.util.ArrayList;

public class Cine extends Sala{
    private String nombre;
    private String direccion;
    private ArrayList<Sala> salas;
    private hashSet<Visitante>visitantesQueYaConcurrieron;

    public Cine(String nombre, String direccion, int numeroSala, int cantidadAsientos){
        super(numeroSala, cantidadAsientos, visitantesPresentes, visitantesYaIngresados);
        this.nombre=nombre;
        this.direccion=direccion;
        this.visitantesQueYaConcurrieron = visitantesQueYaConcurrieron;
        this.salas = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public static void informeActual(){
        System.out.println("El numero de salas es: "+a.getSalas()+"La cantidad de asientos es: "+a.getCantidadAsientos()+"La capacidad maxima permitida por sala es: "+ capacidadMaxima+"La cantidad de visitantes presentes es: "+a.getVisitantesPresentes());
    }
}

//a)crearia dos clases(salas2D y sala3D) y dejaria la clase Sala y haria una herencia de la clase sala a la clase salas2D y a la clase salas3D.
//b)en la clase Visitante le pediria la edad y haria metodo que cuente cuantas personas son menores y cuantas son mayores de edad.
//c)en la clase Visitante le pondia fechaDeIngreso, y ahi haria un metodo con un for que se fije cual es la fecha mayor.
