import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ControleAcademicoTest {

    private ControleAcademico controleAcademico;
    private Aluno aluno1;
    private Aluno aluno2;
    private Professor professor;
    private Disciplina disciplina;

    @Before
    public void setUp() {
        controleAcademico = new ControleAcademico();
        aluno1 = new Aluno("João", 1234567);
        aluno2 = new Aluno("Maria", 89101113);
        professor = new Professor("Professor1");
        disciplina = new Disciplina("Disciplina1", "08:00");
    }

    @Test
    public void testMatricular() {
        assertTrue(controleAcademico.matricularAluno(aluno1));
        assertTrue(controleAcademico.matricularAluno(aluno2));
        
        assertFalse(controleAcademico.matricularAluno(aluno1)); // Tentar matricular o mesmo aluno novamente
    }

    @Test
    public void testAtribuirProfessor() {

        controleAcademico.atribuirProfessor(professor, disciplina);
        
        assertEquals(professor, disciplina.getProfessorTitular());
    }
}
