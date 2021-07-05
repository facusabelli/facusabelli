import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.Math.*;

public class sistemaDeConsumo{

    private HashMap<String, Integer> consumoMes;
    int KWh_viviendas = 2;
    int KWh_empresas = 3;

    public SistemaRegistro(){
        this.consumoMes = new HashMap<>();
    }

    public float tarifaViviendas(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("¿Cuantos KWh gasto la vivenda?");
        float KWh_Gastados = pregunta.nextFloat()
        float tarifaVivienda = KWh_Gastados * KWh_viviendas;
        System.out.println("La tarifa de la vivienda es: "+ tarifaVivienda);
        consumoMes.put("viviendas",tarifaVivienda);
    }

    public float tarifaempresas(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("¿Cuantos KWh gasto la empresa?");
        float KWh_Gastados = pregunta.nextFloat()
        float tarifaEmpresa = KWh_Gastados * KWh_empresas;
        System.out.println("La tarifa de la vivienda es: "+ tarifaempresas);
        consumoMes.put(EMPRESAS.getNombre, tarifaEmpresa);
    }

}