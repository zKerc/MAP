import static org.junit.Assert.*;

import org.junit.Test;

public class DisciplinaTest {

    @Test
    public void testMatricularAluno() {
        Aluno aluno = new Aluno("João", 12345);
        Disciplina disciplina = new Disciplina("Matemática", "08:00 - 10:00");

        assertTrue(disciplina.matricularAluno(aluno));
        assertEquals(1, disciplina.getAlunosMatriculados().size());
        assertTrue(disciplina.getAlunosMatriculados().contains(aluno));
    }

    @Test
    public void testMatricularAlunoRepetido() {
        Aluno aluno = new Aluno("Maria", 54321);
        Disciplina disciplina = new Disciplina("Física", "10:00 - 12:00");

        assertTrue(disciplina.matricularAluno(aluno));
        assertEquals(1, disciplina.getAlunosMatriculados().size());
        assertTrue(disciplina.getAlunosMatriculados().contains(aluno));

        assertFalse(disciplina.matricularAluno(aluno));
        assertEquals(1, disciplina.getAlunosMatriculados().size());
    }
}
