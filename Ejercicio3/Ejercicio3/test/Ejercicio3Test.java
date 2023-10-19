import ejercicio3.Ejercicio3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ejercicio3Test {

    @Test
    public void testValorMinimo() {
        // Caso de prueba con un conjunto de monedas
        int[] monedas = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int resultadoEsperado = 55;
        assertEquals(resultadoEsperado, Ejercicio3.ValorMinimo(monedas));
    }
    
   
}