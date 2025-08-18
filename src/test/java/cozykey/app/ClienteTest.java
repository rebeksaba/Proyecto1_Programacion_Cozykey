package cozykey.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente clienteSinId;
    private Cliente clienteConId;
    private Cliente clienteParaModificar;

    @BeforeEach
    void setUp() {
        clienteSinId = new Cliente("Rebeca", "12345678A", "rebeca@gmail.com", "600123456", "Calle Pajarito 123");
        clienteConId = new Cliente(99, "Mario", "99887766D", "mario@email.com", "633445566", "Plaza Mayor 26");
        clienteParaModificar = new Cliente("Ana", "87654321B", "ana@email.com", "611987654", "Avenida República Argentina 25");
    }

    @Test
    void constructorSinIdAsignaCorrectamente() {
        assertEquals("Rebeca", clienteSinId.getNombre());
        assertEquals("12345678A", clienteSinId.getDNI());
        assertEquals("rebeca@gmail.com", clienteSinId.getEmail());
        assertEquals("600123456", clienteSinId.getTelefono());
        assertEquals("Calle Pajarito 123", clienteSinId.getDireccion());
        assertTrue(clienteSinId.getId() > 0);
    }

    @Test
    void settersModificaCorrectamente() {
        clienteParaModificar.setNombre("Lucía");
        clienteParaModificar.setDNI("11223344C");
        clienteParaModificar.setEmail("lucia@email.com");
        clienteParaModificar.setTelefono("622334455");
        clienteParaModificar.setDireccion("Calle Oso Polar 456");

        assertEquals("Lucía", clienteParaModificar.getNombre());
        assertEquals("11223344C", clienteParaModificar.getDNI());
        assertEquals("lucia@email.com", clienteParaModificar.getEmail());
        assertEquals("622334455", clienteParaModificar.getTelefono());
        assertEquals("Calle Oso Polar 456", clienteParaModificar.getDireccion());
    }

    @Test
    void constructorConIdAsignaCorrectamente() {
        assertEquals(99, clienteConId.getId());
        assertEquals("Mario", clienteConId.getNombre());
    }
}


