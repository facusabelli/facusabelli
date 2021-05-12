package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRegistro{

    private ArrayList<Persona> ArrayPersona;

    public void IniciarSistema(){
    boolean comenzar = true
    while(comenzar){
        System.out.println("se ha iniciado el sistema");
        System.out.println("presione 1---si quieres iniciar el sistema");
        System.out.println("presione 2---si quieres registrar a alguna persona");
        System.out.println("presione 3---si quieres agregar a alguna persona");
        System.out.println("presione 4---si quieres eliminar a alguna persona");
        System.out.println("presione 5---si quieres modificar a alguna persona");
        System.out.println("presione 6---si quieres saber si la persona es mayor de edad");
        System.out.println("presione 7---si quieres imprimir todas las personas");
        System.out.println("presione 8---si quieres salir del sistema");
        int eleccion = eleccionDePersona.nextint();

        if(eleccionDePersona==1){
            SistemaDeRegistroDePersona28.04.sistemaDeRegistro();
        }
        if(eleccionDePersona==2){
            SistemaDeRegistroDePersona28.04.regristrarPersona();
        }
        if(eleccionDePersona==3){
            SistemaDeRegistroDePersona28.04.agregarPersona();
        }
        if(eleccionDePersona==4){
            SistemaDeRegistroDePersona28.04.eliminarPersona();
        }
        if(eleccionDePersona==5){
            SistemaDeRegistroDePersona28.04.modificarDatosPersona();
        }
        if(eleccionDePersona==6){
            SistemaDeRegistroDePersona28.04.personasMayores18();
        }
        if(eleccionDePersona==7){
            SistemaDeRegistroDePersona28.04.imprimirTodaslasPersonas();
        }
        if(eleccionDePersona==8){
            SistemaDeRegistroDePersona28.04.salirDelSistema();
        }
    }


    }

    public sistemaRegistro(){
        this.ArrayPersona = new ArrayList<>();
    }

    public void registrarPersona(Persona a){
        this.ArrayPersona.add(a);
    }

    public void agregarPersona(){

        Scanner numeroPersona = new Scanner(System.in);
        System.out.println("Cuantos persSistemaDeRegistrodad tiene esta persona");
            int personaEdad = nuevaEdad.nextInt();
            Scanner nuevoDni = new Scanner(System.in);
            System.out.println("Cual es el dni de esta persona");
            int nuevoDniPersona = Nuevodni.nextInt();
            Persona a = new Persona(nombrePersona,personaEdad,nuevoDniPersona);
            this.ArrayPersona.add(a);
        }
    }

    public void eliminarPersona(){

        Scanner dniPersonaAEliminar = new Scanner(System.in);
        System.out.println("Ingrese el dni de la persona que desea eliminar de esta vida");
        int dniPersonaEliminar = dniPersonaAEliminar.nextInt();

        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            if(a.getDni()==dniPersonaEliminar){
                this.ArrayPersona.remove(a);
            }
            else{
                System.out.println("Esa persona no existe");
            }
        }
    }
    public void modificarDatosPersona(){

        Scanner dniPersonaACambiar = new Scanner(System.in);
        System.out.println("Ingrese el dni de la persona que desea modificar");
        int dniPersonaCambiar = dniPersonaACambiar.nextInt();

        for(int i=0;i<this.ArrayPersona.size();i++){ Persona a = this.ArrayPersona.get(i);
            if(a.getDni()==dniPersonaCambiar){
                Scanner SuNuevoDni = new Scanner(System.in);
                Scanner SuNuevoNombre = new Scanner(System.in);
                Scanner SuNuevaEdad = new Scanner(System.in);
                System.out.println("Cual sera el nuevo nombre de la persona");
                String nuevoNombre = SuNuevoNombre.nextLine();
                System.out.println("Cuanto edad tiene esta persona");
                int nuevaEdad= SuNuevaEdad.nextInt();
                System.out.println("Cual es el dni de esta persona");
                int nuevoDni = SuNuevoDni.nextInt();
                a.setEdad(nuevaEdad);
                a.setNombre(nuevoNombre);
                a.setDni(nuevoDni);
            }
            else{
                System.out.println("Esa persona no existe");
            }
        }
    }

    public void personasMayores18(){

        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            System.out.println("Personas mayor de 18 son:");
            if(a.getEdad()>=18){
                System.out.println(a);
            }
        }
    }

    public void imprimirTodaslasPersonas(){

        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            System.out.println(a);
        }
    }

    public void salirDelSistema(){
        System.out.println("bye!");
    }
}