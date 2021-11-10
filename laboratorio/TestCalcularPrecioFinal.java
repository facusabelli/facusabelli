public class TestCalcularPrecioFinal {
    @Test
    public void testPrecioFinal(){
        productoElectrico a = new ProductoElectrico("heladera", "congreso", 100, 10, 15,50, 10);
        a.calcularPrecioFinal(1);
        float valorEsperado = 20.0f;
        float valorObtenido = a.getPrecioFinal();
        assertEquals(valorEsperado,valorObtenido, 0);
    }
}
