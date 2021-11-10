public abstract class ProductoElectrico extends ProductoDeSuper implements Producto {

    private int cantDiasDeGarantia;
    private static float recargoPorEnvio=0;
    private int porcentajeDeGanancia;

    public ProductoElectrico(String nombre, String origen, int codigo, float costo, float precioFinal, int cantDiasDeGarantia, int porcentajeDeGanancia) {
        super(nombre, origen, codigo, costo, precioFinal);
        this.cantDiasDeGarantia=cantDiasDeGarantia;
        this.porcentajeDeGanancia=porcentajeDeGanancia;
    }

    public int getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(int cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public int getPorcentajeDeGanancia() {
        return porcentajeDeGanancia;
    }

    public void setPorcentajeDeGanancia(int porcentajeDeGanancia) {
        this.porcentajeDeGanancia = porcentajeDeGanancia;
    }

    public float calcularGananciaObtenida(){
        if(cantDiasDeGarantia==365){
            porcentajeDeGanancia=45;
        }
        else if(cantDiasDeGarantia<=60){
            porcentajeDeGanancia=15;
        }
        return porcentajeDeGanancia;
    }

    public float calcularPrecioFinal(){
        this.precioFinal= this.costo + this.porcentajeDeGanancia + this.recargoPorEnvio;
        return this.precioFinal;
    }

    public String tipoDeProducto(){
        System.out.println("Producto eléctrico");
    }


}



