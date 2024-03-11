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
    public void testConstrutor() {
        assertEquals("João", aluno.getNome());
        assertEquals(123, aluno.getMatricula());
        assertNotNull(aluno.getDisciplinasMatriculadas());
        assertEquals(0, aluno.getDisciplinasMatriculadas().size());
    }

    @Test
    public void testMatricularDisciplina() {
        Disciplina disciplina = new Disciplina("Matemática", "Segunda-feira, 8:00 - 10:00");

        aluno.matricularDisciplina(disciplina);

        assertEquals(2, aluno.getDisciplinasMatriculadas().size());
        assertEquals("Matemática", aluno.getDisciplinasMatriculadas().get(0).getNome());
    }
}
