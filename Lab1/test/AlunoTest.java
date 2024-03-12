import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AlunoTest {

    private Aluno aluno;
    private Disciplina disciplina;

    @Before
    public void setUp() {
        aluno = new Aluno("João", 123);
        disciplina = new Disciplina("Matemática", "8:00 - 9:00");
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
        aluno.matricularDisciplina(disciplina);
        List<Disciplina> disciplinasMatriculadas = aluno.getDisciplinasMatriculadas();
        assertEquals(1, disciplinasMatriculadas.size());
        assertTrue(disciplinasMatriculadas.contains(disciplina));
    }

}
