import java.util.ArrayList;
import java.util.HashSet;

public class Cliente {
    String nombre;
    String direccionEnvio;
    String direccionCobro;
    String email;
    boolean preferecial;
    HashSet<Tarjeta> tarjetas;
    ArrayList<Carrito>carritos;

    public Cliente(String nombre, String direccionEnvio, String direccionCobro, String email, boolean preferecial) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.direccionCobro = direccionCobro;
        this.email = email;
        this.preferecial = preferecial;
        HashSet<Tarjeta>tarjetas = new HashSet<>();
        HashSet<Carrito>carritos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionCobro() {
        return direccionCobro;
    }

    public void setDireccionCobro(String direccionCobro) {
        this.direccionCobro = direccionCobro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPreferecial() {
        return preferecial;
    }

    public void setPreferecial(boolean preferecial) {
        this.preferecial = preferecial;
    }

    public HashSet<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(HashSet<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public ArrayList<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }
}
