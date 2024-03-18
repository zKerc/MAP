package ClassesAssociacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassesSimples.Aluno;
import ClassesSimples.Disciplina;

public class AlunoDisciplinaTest {
    private AlunoDisciplina alunoDisciplina;
    private Disciplina disciplina1;
    private Disciplina disciplina2;
    private Aluno aluno;

    @Before
    public void setUp() {
        aluno = new Aluno("João", 123);
        alunoDisciplina = new AlunoDisciplina(aluno.getNome(), aluno.getMatricula());

        disciplina1 = new Disciplina("Matemática", "M001", "08:00", "10:00");
        disciplina2 = new Disciplina("Física", "F001", "10:00", "12:00");
    }

    @Test
    public void cadastrarDisciplina() {
        alunoDisciplina.cadastrarDisciplina(disciplina1);
        assertEquals(1, alunoDisciplina.getDisciplinas().size());
        assertTrue(alunoDisciplina.getDisciplinas().contains(disciplina1));
    }

    @Test
    public void removerDisciplina() {
        alunoDisciplina.cadastrarDisciplina(disciplina1);
        alunoDisciplina.cadastrarDisciplina(disciplina2);

        alunoDisciplina.removerDisciplina(0);
        assertEquals(1, alunoDisciplina.getDisciplinas().size());
        assertFalse(alunoDisciplina.getDisciplinas().contains(disciplina1));
        assertTrue(alunoDisciplina.getDisciplinas().contains(disciplina2));
    }

    @Test
    public void estaMatriculadoNaDisciplina() {
        alunoDisciplina.cadastrarDisciplina(disciplina1);
        alunoDisciplina.cadastrarDisciplina(disciplina2);

        assertTrue(alunoDisciplina.estaMatriculadoNaDisciplina("M001"));
        assertTrue(alunoDisciplina.estaMatriculadoNaDisciplina("F001"));
        assertFalse(alunoDisciplina.estaMatriculadoNaDisciplina("C001"));
    }

    @Test
    public void verificarDisciplinas() {
        alunoDisciplina.cadastrarDisciplina(disciplina1);
        alunoDisciplina.cadastrarDisciplina(disciplina2);
        try {
            alunoDisciplina.verificarDisciplinas();
        } catch (Exception e) {
            fail("Exceção lançada: " + e.getMessage());
        }
    }
}
