package ClassesSimples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DisciplinaTest {
    private Disciplina disciplina;

    @Before
    public void setUp() {
        disciplina = new Disciplina("Matemática", "M001", "08:00", "10:00");
    }

    @Test
    public void testGetId() {
        assertEquals("M001", disciplina.getId());
    }

    @Test
    public void testSetId() {
        disciplina.setId("M002");
        assertEquals("M002", disciplina.getId());
    }

    @Test
    public void testGetNome() {
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testSetNome() {
        disciplina.setNome("Física");
        assertEquals("Física", disciplina.getNome());
    }

    @Test
    public void testConsultarHorario() {
        try {
            disciplina.consultarHorario();
        } catch (Exception e) {
            fail("Exceção lançada: " + e.getMessage());
        }
    }
}
