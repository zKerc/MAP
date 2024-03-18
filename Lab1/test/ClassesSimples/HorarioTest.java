package ClassesSimples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HorarioTest {
    private Horario horario;

    @Before
    public void setUp() {
        horario = new Horario("08:00", "10:00");
    }

    @Test
    public void testGetInicio() {
        assertEquals("08:00", horario.getInicio());
    }

    @Test
    public void testSetInicio() {
        horario.setInicio("09:00");
        assertEquals("09:00", horario.getInicio());
    }

    @Test
    public void testGetFim() {
        assertEquals("10:00", horario.getFim());
    }

    @Test
    public void testSetFim() {
        horario.setFim("11:00");
        assertEquals("11:00", horario.getFim());
    }

    @Test
    public void testRetornarHorarios() {
        assertTrue(horario.retornarHorarios());
    }
}
