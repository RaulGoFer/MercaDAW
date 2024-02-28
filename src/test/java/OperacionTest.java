import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Alimentación;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Producto;

public class OperacionTest {

    @Test
    public void recargoTest(){
        final double INCREMENTO_25 = 1.25;

        Alimentación a = new Alimentación(null, null, 10, 0, 0, 0, 0, null);
        double precioVenta = 0;
        double resultadoEsperado = 12.5;

        precioVenta = a.getPrecio() * INCREMENTO_25;

        assertEquals(resultadoEsperado, precioVenta, 0.1);
    }

    @Test
    public void calculoPesoTest() {
        final double INCREMENTO_15 = 0.15;
        final double INCREMENTO_10 = 0.10;
        final double INCREMENTO_5 = 0.05;
        final int PESO_MIN = 1;
        final int PESO_MAX = 5;

        double peso = 7;
        double precioVenta = 6;
        double recargoPeso = 0;
        double resultadoEsperado = 0.9;

        if (peso > PESO_MAX) {
            recargoPeso = precioVenta * INCREMENTO_15; // 15% si pesa más de 5 kg
        } else if (peso > PESO_MIN) {
            recargoPeso = precioVenta * INCREMENTO_10; // 10% si pesa más de 1 kg
        } else {
            recargoPeso = precioVenta * INCREMENTO_5; // 5% en el resto de casos
        }

        assertEquals(resultadoEsperado, recargoPeso, 0.1);
    }

    @Test
    public void calculoAlturaTest() {
        final double INCREMENTO_10 = 0.10;
        final double INCREMENTO_5 = 0.05;
        final double ALTURA_LIMITE = 0.5;

        double altura = 0.2;
        double precioVenta = 10;
        double recargoAltura = 0;
        double resultadoEsperado = 0.5;

        if (altura > ALTURA_LIMITE) {
            recargoAltura = precioVenta * INCREMENTO_10;
        } else {
            recargoAltura = precioVenta * INCREMENTO_5;
        }

        assertEquals(resultadoEsperado, recargoAltura, 0.1);
    }

    @Test
    public void calculoAnchuraTest() {
        final double INCREMENTO_10 = 0.10;
        final double INCREMENTO_5 = 0.05;
        final double ANCHURA_LIMITE = 0.5;

        double anchura = 0.7;
        double precioVenta = 10;
        double recargoAnchura = 0;
        double resultadoEsperado = 1;

        if (anchura > ANCHURA_LIMITE) {
            recargoAnchura = precioVenta * INCREMENTO_10; // 10% si la anchura es mayor de 0.5 metros
        } else {
            recargoAnchura = precioVenta * INCREMENTO_5; // 5% en el resto de casos
        }

        assertEquals(resultadoEsperado, recargoAnchura, 0.1);
    }

}
