package Clase06;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculadoraTest {

    @Test
    public void testMultiplicacion() {
        double resultado = Calculadora.mul(80.0, 3.0);
        assertEquals(240.0, resultado, 0.001);
    }

    @Test
    public void testSumaYDivision() {
        double aux = Calculadora.sum(150.0, 180.0);
        double resultado = Calculadora.div(aux, 3.0);
        assertEquals(110.0, resultado, 0.001);
    }

    @Test
    public void testRestaYMultiplicacion() {
        double aux = Calculadora.res(90.0, 50.0);
        double resultado = Calculadora.mul(aux, 15.0);
        assertNotEquals(605.0, resultado, 0.001);
    }

    @Test
    public void testSumaYMultiplicacion() {
        double aux = Calculadora.sum(70.0, 40.0);
        double resultado = Calculadora.mul(aux, 25.0);
        assertNotEquals(2700.0, resultado, 0.001);
    }
}
