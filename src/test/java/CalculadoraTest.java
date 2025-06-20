import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(15, calc.multiplicar(3, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
