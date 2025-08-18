package cozykey.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeycapTest {

    private Keycap keycapC6;
    private Keycap keycapC10;

    @BeforeEach
    void setUp() {
        keycapC6 = new Keycap("Keycap C6", 24.99, 15, "XDA", "naranja");
        keycapC10 = new Keycap("Keycap C10", 19.99, 8, "MOT", "verde");
    }

    @Test
    void testDescripcionC6() {
        String descripcionEsperada = "Keycap C6 (XDA, color naranja) - €24.99 | Stock: 15";
        assertEquals(descripcionEsperada, keycapC6.getDescripcion());
    }

    @Test
    void testDescripcionC10() {
        String descripcionEsperada = "Keycap C10 (MOT, color verde) - €19.99 | Stock: 8";
        assertEquals(descripcionEsperada, keycapC10.getDescripcion());
    }
}


