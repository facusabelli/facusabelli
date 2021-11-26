import java.util.Scanner;

public abstract class ProductoAlimenticio extends ProductoDeSuper {

  private int cantDiasParaVencerse;
  private static int descuento=10;
  private int porcentajeDeGanancia;


  public ProductoAlimenticio(String nombre, String origen, int codigo, float costo, int cantDiasParaVencerse, float precioFinal) {
      super(nombre, origen, codigo, costo);
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
  
  @Override
  public float calcularGananciaObtenida(){
      if(cantDiasParaVencerse<=90){
          porcentajeDeGanancia=10;
      }
      else if(cantDiasParaVencerse>=90){
          porcentajeDeGanancia=25;
      }
      return porcentajeDeGanancia;
  }

  @Override
  public float calcularPrecioFinal(){
      float precioFinal= (getCosto() + getPorcentajeGanancia())/ this.descuento;
      return precioFinal;
  }

  @Override
  public String tipoDeProducto(string productoAlimenticio){
    System.out.println("Esto es un "+ productoAlimenticio);
  }
}