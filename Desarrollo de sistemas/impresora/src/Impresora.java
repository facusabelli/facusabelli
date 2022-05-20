public class Impresora {
    private String nombre;
    private Impresion impresion;

    private Impresora instance;

    private Impresora(String nombre, Impresion impresion) {
        this.nombre = nombre;
        this.impresion = impresion;
    }

    public Impresora getInstance(){
        if(instance==null){
            Impresion i = new Impresion("preparado");
            Impresora impresora = new Impresora("facusfacus",i);
            return impresora;
        }
        else {
            return instance;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Impresion getImpresion() {
        return impresion;
    }

    public void setImpresion(Impresion impresion) {
        this.impresion = impresion;
    }
}
