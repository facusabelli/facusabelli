package com.company;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTarjeta {
    @Test
    public void testCargarSube(){

        TarjetaEquis a = new TarjetaEquis(300,-100,12);
        a.cargarSube(100);
        float valorEsperado = 400.0f;
        float valorObtenido = a.getSaldo();

        assertEquals(valorEsperado,valorObtenido,0);
    }
    @Test
    public void testUltimoMontoAbonado(){
        TarjetaEquis a = new TarjetaEquis(300,-100,12);
        a.cargarSube(100);
        float valorEsperado = 100.0f;
        float valorObtenido = a.getUltimoMonto();

        assertEquals(valorEsperado,valorObtenido,0);
    }
}
