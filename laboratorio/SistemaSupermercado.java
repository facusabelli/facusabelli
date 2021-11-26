import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaSupermercado implements SistemaDeVentas{

    private String nombre;
    private ArrayList<ProductoDeSuper> productosDisponibles;
    private HashSet<ProductoDeSuper> productosVendidos;

    public SistemaSupermercado(String nombre) {
        this.nombre=nombre;
        this.productosDisponibles = new ArrayList<>();
        this.productosVendidos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ProductoDeSuper> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(ArrayList<ProductoDeSuper> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    public HashSet<ProductoDeSuper> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(hashset<ProductoDeSuper> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    @Override
    public int cantidadDeProductosVendidos(){
        return this.productosVendidos.size();
    }

    @Override
    public float ingresosTotales(){
        float ingresoTotal=0f;
        for (ingresoTotal a:this.productosVendidos.values()) {
            ingresoTotal = ingresoTotal + productosVendidos.values();
        }
        return ingresoTotal;
    }

    @Override
    public float gananciaTotalObtenida() {
        float gananciaTotal = 0f;
        for(ProductoDeSuper productoDeSuper : this.productosVendidos){
            gananciaTotal+=productoDeSuper.getCosto();
        }
        return gananciaTotal;
    }

    public void agregarProductoVendido(){
        boolean registroDeVenta = false;

        while (!registroDeVenta) {

            try {
                System.out.println("Ingrese el producto vendido: ");
                String productoVendido = Consola.obtenerString();
                productosVendidos.add(productoVendido);


                registroDeVenta = true;
                System.out.println("¡Registro de venta realizado!");
            }
            catch (InputMismatchException excepcion) {
                excepcion.printStackTrace();
                System.out.println("Tipos de datos incorrectos, ingrese de nuevo el producto");
            }
        }
    }

    public static void serealizacion(){

        try{
            ObjectMapper mapper1 = new ObjectMapper();
            ArrayList<String> productosDisponibles = new ArrayList<>();
            productosDisponibles.add("banana");

            mapASerializar.put("productos",productosDisponibles);

            String objetoJson1 = mapper1.writeValueAsString(mapASerializar);
            System.out.println(objetoJson1);

            File archivo = new File("src/com/company/productosDelSuper.json");

            mapper1.writeValue(archivo,mapASerializar);

        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    } 

    public static void deserializacion(){
        try{
            ObjectMapper mapper2 = new ObjectMapper();
            String json1 = "{ \"nombre\":\"banana\","+"}";

            HashMap map1 = mapper2.readValue(json1,HashSet.class);
            System.out.println(map1);


        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }



}


//ultimo ejercicio de la prueba:

//clase abstracta: Mascota
//atributos: String nombre, int fechaNacimiento, String dueño

//interfaz: VisitasVeterinario
//metodos: visitasObligatorias(), asistenciaPerfecta(), mayorAsistenciaAlAño()

//clases: Perro, Gato, Tortuga (estas clases heredan de la clase Mascota y se tiene que implementar la interfaz VisitasVeterinario)
//atributo de las clases Perro y Gato: String raza
//atributo de solo la clase Perro: static int numeroDeControlesMinimosPorAño=4
//metodos de la clase Perro: visitasObligatorias(), asistenciaPerfecta(), mayorAsistenciaAlAño(), razasQueNoCumplenConAsistencia()
//atributo de solo la clase Gato: static int numeroDeControlesMinimosPorAño=2
//metodos de la clase Gato: visitasObligatorias(), asistenciaPerfecta(), mayorAsistenciaAlAño()
//atributo de solo la clase Tortuga: static int numeroDeControlesMinimosPorAño=1
//metodos de la clase Tortuga: visitasObligatorias(), asistenciaPerfecta(), mayorAsistenciaAlAño()

