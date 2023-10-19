import ejercicio2.Ejercicio2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ejercicio2Test {

  

    @Test
    public void testFuncionCuadraticaConDatos() {
        // Caso de prueba con datos en el array
        int[] input = {1, 2, 3, 5, 6, 8, 9};
        int S = 6;
        int[] expectedOutput = {1, 4, 9, 25, 36, 64};
        assertArrayEquals(expectedOutput, Ejercicio2.FuncionCuadratica(input, S));
    }
}