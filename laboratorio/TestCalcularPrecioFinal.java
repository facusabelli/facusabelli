import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalcularPrecioFinal {

  @Test
  public void testPrecioFinal(){

      productoElectrico a = new ProductoElectrico("heladera", "congreso", 100, 10, 15,50, 10);
      a.calcularPrecioFinal(10);
      float valorEsperado = 10;
      float valorObtenido = a.getPrecioFinal();
      assertEquals(valorEsperado,valorObtenido, 0);
  }
}
