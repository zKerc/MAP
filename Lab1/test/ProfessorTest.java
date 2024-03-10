import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessorTest {

    @Test
    public void testAtribuirDisciplina() {
        Professor professor = new Professor("Ana");
        Disciplina disciplina = new Disciplina("Química", "14:00 - 16:00");

        professor.atribuirDisciplina(disciplina);

        assertEquals(1, professor.getDisciplinasMinistradas().size());
        assertTrue(professor.getDisciplinasMinistradas().contains(disciplina));
        assertEquals(professor, disciplina.getProfessorTitular());
    }
}
