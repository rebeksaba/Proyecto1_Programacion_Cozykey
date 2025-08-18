package cozykey.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TecladoTest {

    private Teclado tecladoT3;
    private Teclado tecladoT4;

    @BeforeEach
    void setUp() {
        tecladoT3 = new Teclado("Teclado T3", 89.99, 10, "Red", true);
        tecladoT4 = new Teclado("Teclado T4", 129.99, 5, "Blue", false);
    }

    @Test
    void testDescripcionT3() {
        String descripcionEsperada = "Teclado T3 con switches Red con cable - €89.99 | Stock: 10";
        assertEquals(descripcionEsperada, tecladoT3.getDescripcion());
    }

    @Test
    void testDescripcionT4() {
        String descripcionEsperada = "Teclado T4 con switches Blue, inalámbrico - €129.99 | Stock: 5";
        assertEquals(descripcionEsperada, tecladoT4.getDescripcion());
    }
}


