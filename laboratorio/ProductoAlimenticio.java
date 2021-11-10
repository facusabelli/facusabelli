public abstract class ProductoAlimenticio extends ProductoDeSuper {

    private int cantDiasParaVencerse;
    private static int descuento;
    private int porcentajeDeGanancia;


    public ProductoAlimenticio(String nombre, String origen, int codigo, float costo, float precioFinal, int cantDiasParaVencerse, float precioFinal) {
        super(nombre, origen, codigo, costo, precioFinal);
        this.cantDiasParaVencerse=cantDiasParaVencerse;
    }

    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public void setCantDiasParaVencerse(int cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public int getPorcentajeDeGanancia() {
        return porcentajeDeGanancia;
    }

    public void setPorcentajeDeGanancia(int porcentajeDeGanancia) {
        this.porcentajeDeGanancia = porcentajeDeGanancia;
    }

    public float calcularGananciaObtenida(){
        if(cantDiasParaVencerse<=90){
            porcentajeDeGanancia=10;
        }
        else if(cantDiasParaVencerse>=90){
            porcentajeDeGanancia=25;
        }
        return porcentajeDeGanancia;
    }

    public float calcularPrecioFinal(){
        this.precioFinal= this.costo + this.porcentajeDeGanancia + this.descuento;
        return this.precioFinal;
    }

    public String tipoDeProducto(){
        System.out.println("Producto alimenticio");
    }
}
