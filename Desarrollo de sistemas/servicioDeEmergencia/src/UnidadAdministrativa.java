import java.util.ArrayList;


public class UnidadAdministrativa extends Base{
    ArrayList<Base> bases;

    public UnidadAdministrativa(String nombre) {
        super(nombre);
        bases = new ArrayList<Base>();
    }

    public ArrayList<Base> getBases() {
        return bases;
    }

    public void setBases(ArrayList<Base> bases) {
        this.bases = bases;
    }
}
