package ClassesSimples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfessorTest {
    private Professor professor;

    @Before
    public void setUp() {
        professor = new Professor("João", 123);
    }

    @Test
    public void testGetNome() {
        assertEquals("João", professor.getNome());
    }

    @Test
    public void testSetNome() {
        professor.setNome("Maria");
        assertEquals("Maria", professor.getNome());
    }

    @Test
    public void testGetMatricula() {
        assertEquals(123, professor.getMatricula());
    }

    @Test
    public void testSetMatricula() {
        professor.setMatricula(456);
        assertEquals(456, professor.getMatricula());
    }
}
