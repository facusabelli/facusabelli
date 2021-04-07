package com.company;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        nombre = "jose";
        edad = 35;
        dni = 2000000;
        telefono = 12345678;
        direccion = olazabal 1234;
    
    }

    public Persona(String nuevoNombre){
        nombre = nuevoNombre;
        edad = 36;
        dni = 2000001;
        telefono = 12345679;
        direccion = olazabal 1235;
    
    }

    public Persona(String nuevoNombre, int nuevaEdad, int nuevoDni, int nuevoTelefono, String nuevaDireccion){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        dni = nuevoDni;
        telefono = nuevoTelefono;
        direccion = nuevaDireccion;
    
    }
   

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int nuevoDni){
        dni = nuevoDni;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setEdad(int nuevoTelefono){
        telefono = nuevoTelefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }

    boolean esMayorDeEdaD(int nuevaEdad){
        if(nuevaEdad>18){
            return true;
         }
    return false;
    }

    boolean sonLaMismaPersona(int mismoDni1, int mismoDni2){
        if(mismoDni1==mismoDni2){
            return true;
        }
    return false;
    }

    boolean tienenLaMismaEdad(int mismaEdad1, int mismaEdad2){
        if(mismaEdad1==mismaEdad2){
            return true;
        }
    return false;
    }


    

