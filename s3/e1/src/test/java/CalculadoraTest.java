import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba suma")
    void suma() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(3, 2));
    }

    @Test
    @DisplayName("Prueba resta")
    void resta() {
        int esperadoResta = 7;
        assertEquals(esperadoResta, calculadora.resta(10, 3));
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplica() {
        int esperadoMultiplica = 40;
        assertEquals(esperadoMultiplica, calculadora.multiplica(8, 5));
    }


    @Test
    @DisplayName("Prueba división")
    void divide() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0), "No es posible dividir un valor entre 0");
    }

    @Test
    @DisplayName("Prueba divide entre entero")
    void divide2() {
        assertEquals(10, calculadora.divide(100, 10));
    }
}