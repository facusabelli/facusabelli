package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sala {
    private int numeroSala;
    private int cantidadAsientos;
    public static int capacidadMaxima=50;
    private Arraylist<Visitante> visitantesPresentes;
    private HashSet<Visitante> visitantesYaIngresados;

    public Sala(int numeroSala, int cantidadAsientos){
        this.numeroSala=numeroSala;
        this.cantidadAsientos=cantidadAsientos;
        this.visitantesYaIngresados = new HashSet<>();
        this.visitantesPresentes = new ArrayList<>();
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVisitantesPresentes() {
        return visitantesPresentes;
    }

    public void setVisitantesPresentes(visitantesPresentes) {
        this.visitantesPresentes = visitantesPresentes;
    }

    public int getVisitantesYaIngresados() {
        return visitantesYaIngresados;
    }

    public void setVisitantesPYaIngresados(visitantesYaIngresados) {
        this.visitantesYaIngresados = visitantesYaIngresados;
    }

    public void addVisitantesPresentes(Visitante a){
        this.visitantesPresentes.add(a);
    }

    public void addVisitantesYaIngresados(Visitante a){
        for(Visitante b : this.visitantesPresentes){
            if(b.getId().equals(a.getId())){
                this.visitantesYaIngresados.add(a);
                break;
            }
        }
    }

    public void hayInfiltrados(){
        boolean infiltrados=false;
        for(Visitante c : this.visitantesPresentes){
            if(c.visitantesPresentes()>capacidadMaxima)
                return infiltrados=true;
        }
    }

        public void asientosDisponibles(){
            int asientosOcupados=0;
            for(Visitante d : this.visitantesPresentes){
                asientosOcupados++;
            }
            int asientosSinOcupar= capacidadMaxima-asientosOcupados;
            return asientosSinOcupar;
        }

        public void asientosOcupados(){
            int asientosYaOcupados=0;
            for(Visitante d : this.visitantesPresentes){
                asientosYaOcupados++;
            }
            return asientosYaOcupados;
        }

        public void estaLlena(){
            boolean salaLlena=false;
            if(asientosOcupados()==capacidadMaxima){
                return salaLlena=true;
            }
        }




}
