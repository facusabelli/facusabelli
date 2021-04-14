package com.company;

public class Persona {
    

    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public persona(String nuevoNombre, int nuevaEdad, int nuevoDni, int nuevoTelefono, String nuevaDireccion){
        nombre = nuevoNombre;
        edad = nuevaEdad;
        dni = nuevoDni;
        telefono = nuevoTelefono;
        direccion = nuevaDireccion;

    }

    public void setDatos(String tipoDeDato, int nuevoDatoInt, String nuevoDatoString){
        if (tipoDeDato == "nombre"){
            nombre = nuevoDatoString;
        }
    
        if (tipoDeDato == "edad"){
            edad = nuevoDatoInt;
        }

        if (tipoDeDato == "dni"){
            dni = nuevoDatoInt;
        }

        if (tipoDeDato == "telefono"){
            telefono = nuevoDatoInt;
        }

        if (tipoDeDato == "direccion"){
            direccion = nuevoDatoString;
        }
    }
}
