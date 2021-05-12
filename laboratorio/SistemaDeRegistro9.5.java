import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaRegistro{

    private HashSet<Integer> HashNumero1;
    private HashSet<Integer> HashNumero2;
    
    public SistemaRegistro(){
        this.HashNumero1 = new HashSet<>();
        this.HashNumero2 = new HashSet<>();
    }

    public void agregagarNumero(){
        Scanner numeros = new Scanner(System.in);
        System.out.println("¿Cuantos numeros quiere agregar?");
        float preguntaPersonas = numeros.nextFloat();
        for (int i = 0; i < preguntaPersonas; i++) {
            Scanner nuevoNumero = new Scanner(System.in);
            System.out.println("¿Que numero quiere agregar?");
            int numero = nuevoNumero.nextInt();
            this.HashNumero1.add(numero);
        }
    }

    public void agregagarOtroNumero(){
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese mas numeros:");
        System.out.println("¿Cuantos numeros quiere agregar?");
        float preguntaPersonas = numeros.nextFloat();
        for (int i = 0; i < preguntaPersonas; i++) {
            Scanner nuevoNumero = new Scanner(System.in);
            System.out.println("¿Que numero quiere agregar?");
            int numero = nuevoNumero.nextInt();
            this.HashNumero2.add(numero);
        }
    }

    public void mismoNumero(){
        boolean iguales = false;
        for (int a : HashNumero1){
            for (int b : HashNumero2){
                if(a==b){
                    iguales = true;
                    System.out.println("Este es el numero que se repite: "+a);
                }
            }
        }
        if(iguales==false){
            System.out.println("No hay numeros repetidos");
        }
    }

    public void imprimir(){
        for (int a : this.HashNumero){
            System.out.println(a);
        }
    }
}