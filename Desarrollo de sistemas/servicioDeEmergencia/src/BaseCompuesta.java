public class BaseCompuesta extends Base{
    int numeroDeAmbulancia;
    Float tiempoMedio;

    public BaseCompuesta(int numeroDeAmbulancia, Float tiempoMedio, String nombre) {
        super(nombre);
        this.numeroDeAmbulancia = numeroDeAmbulancia;
        this.tiempoMedio = tiempoMedio;
    }

    public int getNumeroDeAmbulancia() {
        return numeroDeAmbulancia;
    }

    public void setNumeroDeAmbulancia(int numeroDeAmbulancia) {
        this.numeroDeAmbulancia = numeroDeAmbulancia;
    }

    public Float getTiempoMedio() {
        return tiempoMedio;
    }

    public void setTiempoMedio(Float tiempoMedio) {
        this.tiempoMedio = tiempoMedio;
    }
}
