public class Base {
    String nombre;

    public Base(String nombre) {
        this.nombre = nombre;
    }

    public void getCantAmb(){
        Base bases;
        int contador = 0;
        for (String nombre : Base.nombre) {
            contador++;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
