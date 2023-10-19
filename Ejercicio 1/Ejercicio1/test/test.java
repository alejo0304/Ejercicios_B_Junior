/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio1.Ejercicio1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejo
 */
public class test {
    
    public test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidarNumero_ValidInteger_ReturnsTrue() {
        // Arrange
        String validInteger = "42";

        // Act
        boolean result = Ejercicio1.validarNumero(validInteger);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidarNumero_InvalidInteger_ReturnsFalse() {
        // Arrange
        String invalidInteger = "notanumber";

        // Act
        boolean result = Ejercicio1.validarNumero(invalidInteger);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testValidarNumero_DecimalNumber_ReturnsTrue() {
        // Arrange
        String decimalNumber = "3.14";

        // Act
        boolean result = Ejercicio1.validarNumero(decimalNumber);

        // Assert
        assertTrue(result);
    }
}
