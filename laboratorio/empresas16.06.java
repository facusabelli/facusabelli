public class empresas extends viviendas{

    private String razonSocial;

    public viviendas(String nombre, string apellido, int dni,String direccion, String razonSocial) {
        super(nombre, apellido, dni, direccion);
        this.razonSocial=razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

}