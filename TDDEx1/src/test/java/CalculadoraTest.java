import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        Calculadora c = new Calculadora();
        c.setV1(2);
        c.setV2(2);

        double s = c.soma();

        assertEquals(4, s);
    }

    @org.junit.jupiter.api.Test
    void diferenca() {
        Calculadora c = new Calculadora();
        c.setV1(2);
        c.setV2(2);

        double d = c.diferenca();

        assertEquals(0, d);
    }

    @org.junit.jupiter.api.Test
    void divisao() {
        Calculadora c = new Calculadora();
        c.setV1(2);
        c.setV2(2);

        double dv = c.divisao();

        assertEquals(1, dv);
    }

    @org.junit.jupiter.api.Test
    void produto() {
        Calculadora c = new Calculadora();
        c.setV1(2);
        c.setV2(2);

        double p = c.produto();

        assertEquals(4, p);
    }
}