import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class SistemaNotas{

    private HashMap<String,ArrayList<Float>>notasPorMateria;


    public SistemaRegistro(){
        this.notasPorMateria = new HashMap<>();
    }
    
    public void agregarNota(){
        Scanner notas = new Scanner(System.in);
        System.out.println("¿Cuantos notas quiere agregar?");
        int preguntaNotas = notas.nextInt();
        for (int i = 0; i < preguntaNotas; i++) {
            Scanner nuevaNota = new Scanner(System.in);
            System.out.println("¿Que nota quiere agregar?");
            float nota = nuevoNota.nextFloat();
            this.notasPorMateria.add(nota);
        }
    }

    public void menorNota(){
        float notas= 0;
        float notaMenor= 10;
        for(arraylist<Float> nota : notasPorMateria.values()){
            for(int a = 0; a < nota.size(); a++){
                notas = nota.get(a);
            }
            if(notas < notaMenor){
                notaMenor = notas;
            }
        }
        System.out.println("la menor nota es: "+ notaMenor);
    }

    public void mayorNota(){
        float notas= 0;
        float notaMayor= 0;
        for(arraylist<Float> nota : notasPorMateria.values()){
            for(int a = 0; a < nota.size(); a++){
                notas = nota.get(a);
            }
            if(notas > notaMayor){
                notaMayor = notas;
            }
        }
        System.out.println("la mayor nota es: "+ notaMayor);
    }

    public void promedioNota(){
        float notasTotal = 0;
        float notasPromedio = 0;
        for(arraylist<Float> nota : notasPorMateria.values()){
            notasTotal += nota;
        }
        notasPromedio = notasTotal/nota.size();
        System.out.println("el promedio de nota es: "+ notasPromedio);
    }

    public void agregarMateria(String nombreDeMateria){
        Scanner materias = new Scanner(System.in);
        System.out.println("¿Cuantos materias quiere agregar?");
        int preguntaMaterias = materias.nextInt();
        for (int i = 0; i < preguntaMaterias; i++) {
            Scanner nuevaMateria = new Scanner(System.in);
            System.out.println("¿Que materia quiere agregar?");
            String materia = nuevaMateria.nextline();
            this.notasPorMateria.add(materia);
        }
    }
}
