import java.util.HashSet;

public class Dispositivo {
    private String nombre;
    HashSet<Impresora>impresoras;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        impresoras = new HashSet<Impresora>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Impresora> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(HashSet<Impresora> impresoras) {
        this.impresoras = impresoras;
    }
}
