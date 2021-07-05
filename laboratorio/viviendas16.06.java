public class viviendas extends Dueño{

    private String direccion;

    public viviendas(String nombre, string apellido, int dni,String direccion) {
        super(nombre, apellido, dni);
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

