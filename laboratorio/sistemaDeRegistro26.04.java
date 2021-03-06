package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRegistro{
    
    private ArrayList<producto> productos;

    public void IniciarSistema(){
        System.out.println("se ha iniciado el sistema");
        System.out.println("¿cuantos productos desea ingresar?");

        int productosQueDeseaRegistrar = RegistrarProducto.nextInt();

        for(int i=0;i<productosQueDeseaRegistrar;i++){
            SistemaRegistro p = new sistemaDeRegistro();
            p.AgregagarProducto();
            system.out.println("---productos registrados hasta el momento---");
            pr.productosRegistrados();
        }
        SistemaRegistro i = new SistemaRegistro();
        i.verImporteTotal();
    }

    public SistemaRegistro(){
        this.productos = new ArrayList<>();
    }

    public void RegistrarProducto(producto a){
        this.productos.add(a);
    }

    public void verImporteParcial(){
        System.out.println("ahora va a ver el importe parcial:");
        float importeparcial=0;
        for(int i=0;i<this.productos.size();i++){
            producto f = this.productos.get(i);
            importeparcial += f.getPrecio();
        }
        System.out.println(importeparcial);
    }

    public void AgregagarProducto(){
        Scanner miObj = new Scanner(System.in);
        System.out.println("Cuantos productos quiere agregar:");
        float pregunta = miObj.nextFloat();
        for (int i=0;i<pregunta;i++){
            Scanner Nuevonombre = new Scanner(System.in);
            System.out.println("Que producto quiere:");
            String nombreproducto = Nuevonombre.nextLine();
            Scanner Nuevoprecio = new Scanner(System.in);
            System.out.println("Cuanto pagara por ese producto:");
            float precioproducto = Nuevoprecio.nextFloat();
            producto b = new producto(nombreproducto,precioproducto);
            this.productos.add(b);
        }
    }

    public void verImporteTotal(){
        float importeparcial=0;
        for(int i=0;i<this.productos.size();i++){
            producto f = this.productos.get(i);
            importeparcial += f.getPrecio();
        }
        System.out.println("ahora va a ver el importe total:");
            for(int i=0;i<this.productos.size();i++){
                producto f = this.productos.get(i);
                System.out.println(f.getNombre());
            }
            System.out.println(importeparcial);
    }

}

