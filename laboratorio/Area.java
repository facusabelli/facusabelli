package com.company;

import java.util.Scanner;


import static java.lang.Math.PI;
import static java.lang.Math.*;

public class Area{
    public static void Area(String[] args){


            public double circulo(){
                Scanner preguntaRadio = new Scanner(System.in);
                System.out.println("¿Cual es el radio del circulo?");
                double radio = preguntaRadio.nextDouble();
                double area=Math.PI*radio*radio;
                System.out.println("el area de tu circulo es: "+ area);
            }

            public double esfera(){
                Scanner preguntaRadio = new Scanner(System.in);
                System.out.println("¿Cual es el radio de tu esfera?");
                double radio = preguntaRadio.nextDouble();
                double area=4*Math.PI*radio*radio;
                System.out.println("el area de tu esfera es: "+ area);
            }

            public double cuadrado(){
                Scanner preguntaLado = new Scanner(System.in);
                System.out.println("¿Cuanto vale cada lado de tu cuadrado?");
                double lado = preguntaLado.nextDouble();
                double area=lado*lado;
                System.out.println("el area de tu cuadrado es: "+ area);
            }

            public double cubo(){
                Scanner preguntaLado = new Scanner(System.in);
                System.out.println("¿Cuanto vale cada lado de tu cubo?");
                double lado = preguntaLado.nextDouble();
                double area=6*lado*lado;
                System.out.println("el area de tu cubo es: "+ area);
            }

            public double triangulo(){
                Scanner preguntaBase = new Scanner(System.in);
                System.out.println("¿Cual es el valor de la base de tu triangulo?");
                double base = preguntaBase.nextDouble();
                Scanner preguntaAltura = new Scanner(System.in);
                System.out.println("¿Cual es el valor de la altura de tu triangulo?");
                double altura = preguntaAltura.nextDouble();
                double area=base*altura/2;
                System.out.println("el area de tu triangulo es: "+ area);
            }

        }



}
