import java.util.ArrayList;

public class Impresion {
    private String estado;
    ArrayList<String>colaImpresion;

    public Impresion(String estado) {
        this.estado = estado;
        colaImpresion = new ArrayList<String>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<String> getColaImpresion() {
        return colaImpresion;
    }

    public void setColaImpresion(ArrayList<String> colaImpresion) {
        this.colaImpresion = colaImpresion;
    }

}
