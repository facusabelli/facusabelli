import java.util.ArrayList;
import java.util.HashMap;

public class Carrito {
    Cliente cliente;
    HashMap<Producto,Integer>cantidadPorProducto;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HashMap<Producto, Integer> getCantidadPorProducto() {
        return cantidadPorProducto;
    }

    public void setCantidadPorProducto(HashMap<Producto, Integer> cantidadPorProducto) {
        this.cantidadPorProducto = cantidadPorProducto;
    }

    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        HashMap<Producto,Integer>cantidadPorProducto = new HashMap<>();
    }
}
