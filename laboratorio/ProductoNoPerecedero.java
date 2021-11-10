public class ProductoNoPerecedero extends ProductoAlimenticio {

    private float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio=mgDeSodio;
    }

    public float getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }

    public HashSet<String> aptosParaHipertensos(){
        if(mgDeSodio<=1500){
            this.aptosParaHipertensos.add();
            System.out.println("El producto: "+ this.nombre + "tiene menos de 1500 mg");
        }
    }

}
