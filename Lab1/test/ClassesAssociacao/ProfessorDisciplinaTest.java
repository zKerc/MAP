package ClassesAssociacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassesSimples.Disciplina;
import ClassesSimples.Professor;

public class ProfessorDisciplinaTest {
    private ProfessorDisciplina professorDisciplina;
    private Disciplina disciplina1;
    private Disciplina disciplina2;
    private Professor professor;

    @Before
    public void setUp() {
        professor = new Professor("Maria", 456);
        professorDisciplina = new ProfessorDisciplina(professor.getNome(), professor.getMatricula());

        disciplina1 = new Disciplina("História", "H001", "14:00", "16:00");
        disciplina2 = new Disciplina("Geografia", "G001", "16:00", "18:00");
    }

    @Test
    public void cadastrarDisciplina() {
        professorDisciplina.cadastrarDisciplina(disciplina1);
        assertEquals(1, professorDisciplina.getDisciplinas().size());
        assertTrue(professorDisciplina.getDisciplinas().contains(disciplina1));
    }

    @Test
    public void removerDisciplina() {
        professorDisciplina.cadastrarDisciplina(disciplina1);
        professorDisciplina.cadastrarDisciplina(disciplina2);

        professorDisciplina.removerDisciplina(0);
        assertEquals(1, professorDisciplina.getDisciplinas().size());
        assertFalse(professorDisciplina.getDisciplinas().contains(disciplina1));
        assertTrue(professorDisciplina.getDisciplinas().contains(disciplina2));
    }

    @Test
    public void verificarDisciplinas() {
        professorDisciplina.cadastrarDisciplina(disciplina1);
        professorDisciplina.cadastrarDisciplina(disciplina2);
        try {
            professorDisciplina.verificarDisciplinas();
        } catch (Exception e) {
            fail("Exceção lançada: " + e.getMessage());
        }
    }

    @Test
    public void verificarHorarios() {
        professorDisciplina.cadastrarDisciplina(disciplina1);
        professorDisciplina.cadastrarDisciplina(disciplina2);
        try {
            professorDisciplina.verificarHorarios();
        } catch (Exception e) {
            fail("Exceção lançada: " + e.getMessage());
        }
    }
}
