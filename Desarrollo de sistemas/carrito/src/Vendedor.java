public class Vendedor {
    String nombre;
    String direccion;
    Integer cbu;
    String reputacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCbu() {
        return cbu;
    }

    public void setCbu(Integer cbu) {
        this.cbu = cbu;
    }

    public String getReputacion() {
        return reputacion;
    }

    public void setReputacion(String reputacion) {
        this.reputacion = reputacion;
    }

    public Vendedor(String nombre, String direccion, Integer cbu, String reputacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cbu = cbu;
        this.reputacion = reputacion;
    }
}
