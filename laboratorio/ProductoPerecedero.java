
public class ProductoPerecedero extends ProductoAlimenticio{

    private float temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio= temperaturaMinimaDeFrio;
    }

    public float getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }

    public void setTemperaturaMinimaDeFrio(float temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }
}
