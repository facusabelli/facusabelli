import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SistemaSupermercado implements SistemaDeVentas{

    private String nombre;
    private ArrayList<String> productosDisponibles;
    private HashMap<String, float> productosVendidos;

    public SistemaSupermercado(String nombre) {
        this.nombre=nombre;
        this.productosDisponibles = new ArrayList<>();
        this.productosVendidos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(ArrayList<String> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    public HashMap<String, float> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(HashMap<String, float> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public int cantidadDeProductosVendidos(){
        int productosQueFueronVendidos=0;
        for (productosQueFueronVendidos a:this.productosVendidos.keySet()) {
            productosQueFueronVendidos = productosQueFueronVendidos + 1;
        }
        return productosQueFueronVendidos;
    }

    public float ingresosTotales(){
        float ingresoTotal=0;
        for (ingresoTotal a:this.productosVendidos.values()) {
            ingresoTotal = ingresoTotal + productosVendidos.values();
        }
        return ingresoTotal;
    }

    public void agregarProductoVendido(productosVendidos a){
        this.productosVendidos.add(a);
        }
}

// se tiene que crear una super clase mascota, luego crear las clases perro, gato, tortuga haciendo un exteneds en todas, despues hacer una interfaz con lo metodos: visitasObligatorias(), asistenciaPerfecta(), mayorAsistenciaAlAño().

