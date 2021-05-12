package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRegistro{

    private ArrayList<Persona> ArrayPersona;

    public void IniciarSistema(){
        System.out.println("se ha iniciado el sistema");
        System.out.println("¿cuantas personas desea registrar?");

        int personaQueDeseaRegistrar = RegistrarPersona.nextInt();

        for(int i=0;i<personaQueDeseaRegistrar;i++){
            SistemaRegistro p = new sistemaDeRegistro();
            p.AgregagarPersona();
            system.out.println("---personas registradas hasta el momento---");
            pe.personasRegistradas();
        }
        SistemaRegistro i = new SistemaRegistro();
        i.ImprimirTodaslasPersonas();
    }

    public SistemaRegistro(){
        this.ArrayPersona = new ArrayList<>();
    }

    public void RegistrarPersona(Persona a){
        this.ArrayPersona.add(a);
    }

    public void AgregarPersona(){

        Scanner numeroPersona = new Scanner(System.in);
        System.out.println("Cuantos personas quiere agregar");
        float preguntaPersonas = numeroPersona.nextFloat();

        for (int i=0;i<preguntaPersonas;i++){
            Scanner nuevoNombre = new Scanner(System.in);
            System.out.println("Que nombre tiene la persona");
            String nombrePersona = nuevoNombre.nextLine();
            Scanner nuevaEdad = new Scanner(System.in);
            System.out.println("Cuanto edad tiene esta persona");
            int personaEdad = nuevaEdad.nextInt();
            Scanner nuevoDni = new Scanner(System.in);
            System.out.println("Cual es el dni de esta persona");
            int nuevoDniPersona = Nuevodni.nextInt();
            Persona a = new Persona(nombrePersona,personaEdad,nuevoDniPersona);
            this.ArrayPersona.add(a);
        }
    }

    public void EliminarPersona(){

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
    public void ModificarDatosPersona(){

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

    public void PersonasMayores18(){

        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            System.out.println("Personas mayor de 18 son:");
            if(a.getEdad()>=18){
                System.out.println(a);
            }
        }
    }

    public void ImprimirTodaslasPersonas(){

        for(int i=0;i<this.ArrayPersona.size();i++){
            Persona a = this.ArrayPersona.get(i);
            System.out.println(a);
        }
    }
}
