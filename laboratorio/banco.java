import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Banco{

    private String nombre;
    private ArrayList<cliente> visitaClientes;

    public banco(String nombre) {
        this.nombre=nombre;
        this.visitaClientes = new ArrayList<>();
    }

    public void agregarVisitaCliente(cliente a){
        this.visitaClientes.add(a);
    }

    public HashSet <Integer> cbusDeClientesVisitantes(){
        HashSet<Integer> cbuClientes = new HashSet<>();
        for(cliente a : visitaClientes){
            cbuClientes.add(a.getCbu());
        }
        return cbuClientes;
    }

    public void imprimirHashSet(HashSet imprimirSet){
        for(Integer a : imprimirSet){
            System.out.println(a);
        }
    }

    public HashMap <Integer,Integer> cantidadDeVisitasPorCliente(int visitas,cliente a){
        HashMap<Integer,Integer> cantidadVisitasCliente = new HashMap<>();
        cantidadVisitasCliente.put(a.getCbu(),visitas);
        return  cantidadVisitasCliente;
    }

    public void imprimirHashMap(HashMap imprimirMap){
        for(Object a : imprimirMap.keySet()){
            System.out.println("clave: " + imprimirMap.keySet() + " - valor: " + imprimirMap.get(a));
        }

    }
}
