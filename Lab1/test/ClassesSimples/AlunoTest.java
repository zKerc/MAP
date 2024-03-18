package ClassesSimples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlunoTest {
    private Aluno aluno;

    @Before
    public void setUp() {
        aluno = new Aluno("João", 123);
    }

    @Test
    public void testGetMatricula() {
        assertEquals(123, aluno.getMatricula());
    }

    @Test
    public void testSetMatricula() {
        aluno.setMatricula(456);
        assertEquals(456, aluno.getMatricula());
    }

    @Test
    public void testGetNome() {
        assertEquals("João", aluno.getNome());
    }

    @Test
    public void testSetNome() {
        aluno.setNome("Maria");
        assertEquals("Maria", aluno.getNome());
    }
}
