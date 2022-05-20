import java.util.HashMap;

public class Compra {
    Cliente cliente;
    Tarjeta tarjeta;
    String direccion;
    Float precioTotal;
    HashMap<Producto,Integer>cantidadPorProducto;

    public Compra(Cliente cliente, Tarjeta tarjeta, String direccion, Float precioTotal) {
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.precioTotal = precioTotal;
        HashMap<Producto,Integer>cantidadPorProducto = new HashMap<>();
    }

    public void comprar(Carrito carrito,Tarjeta tarjeta){
        Cliente cl = new Cliente("Facu","Constituyentes 4040","Palmera 62","facu@gmail.com",true);
        Carrito c = new Carrito(cl);
        //agarrar el producto y la cantidad multiplicarla por el precio unitario

    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public HashMap<Producto, Integer> getCantidadPorProducto() {
        return cantidadPorProducto;
    }

    public void setCantidadPorProducto(HashMap<Producto, Integer> cantidadPorProducto) {
        this.cantidadPorProducto = cantidadPorProducto;
    }
}
