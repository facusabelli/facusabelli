package com.company;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

    Scanner ingreso1 = new Scanner(System.in);
    Scanner ingreso2 = new Scanner(System.in);

    Producto producto1 = new Producto("leche",10);

    producto1.registroproducto(ingreso1,ingreso2);
    producto1.imprimirregistro(ingreso1,ingreso2);
    }
}
