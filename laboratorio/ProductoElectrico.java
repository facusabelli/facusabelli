import java.util.Scanner;

public abstract class ProductoElectrico extends ProductoDeSuper implements Producto {

  private int cantDiasDeGarantia;
  private static float recargoPorEnvio=10;
  private int porcentajeDeGanancia;

  public ProductoElectrico(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia, int porcentajeDeGanancia) {
      super(nombre, origen, codigo, costo);
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
  
    @Override
    public float calcularGananciaObtenida(){
        if(cantDiasDeGarantia==365){
            porcentajeDeGanancia=45;
        }
        else if(cantDiasDeGarantia<=60){
              porcentajeDeGanancia=15;
        }
        return porcentajeDeGanancia;
    }

    @Override
    public float calcularPrecioFinal(){
        float precioFinal= (getCosto() + getPorcentajeGanancia())/ this.recargoPorEnvio;
        return precioFinal;
    }

    @Override
    public String tipoDeProducto(string productoElectrico){
        System.out.println("Esto es un "+ productoElectrico);
    }


}