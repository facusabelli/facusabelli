public class Transportista {
    String nombreEmpresa;
    String nombreTransportista;

    public Transportista(String nombreEmpresa, String nombreTransportista) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreTransportista = nombreTransportista;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreTransportista() {
        return nombreTransportista;
    }

    public void setNombreTransportista(String nombreTransportista) {
        this.nombreTransportista = nombreTransportista;
    }
}
