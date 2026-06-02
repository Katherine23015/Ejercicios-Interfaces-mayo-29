package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import datos.RegistroEnMemoria;

public class RegistroEnMemoriaTest {

    @Test
    public void testRegistrarAtaque() {
        RegistroEnMemoria registro = new RegistroEnMemoria();
        registro.registrarAtaque("Ataque de prueba");
        assertEquals(1, registro.obtenerHistorial().size());
        assertEquals("Ataque de prueba", registro.obtenerHistorial().get(0));
    }
}