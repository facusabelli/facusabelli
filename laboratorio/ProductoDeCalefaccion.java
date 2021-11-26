import java.util.Scanner;

public class ProductoDeCalefaccion extends ProductoElectrico{

  private float wattsDePotenciaMax;

  public ProductoDeCalefaccion(String nombre, String origen, int codigo, float costo, int cantDiasDeGarantia, float wattsDePotenciaMax) {
      super(nombre, origen, codigo, costo, cantDiasDeGarantia );
      this.wattsDePotenciaMax=wattsDePotenciaMax;
  }

  public float getWattsDePotenciaMax() {
      return wattsDePotenciaMax;
  }

  public void setWattsDePotenciaMax(float wattsDePotenciaMax) {
      this.wattsDePotenciaMax = wattsDePotenciaMax;
  }
  
  @Override
  public String tipoDeProducto(string productoDeCalefaccion){
    System.out.println("Esto es un "+ productoDeCalefaccion);
  }
}