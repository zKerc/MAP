import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Exception.NaoEncontrado;

public class ControleAcademicoTest {

    private ControleAcademico controle;

    @Before
    public void setUp() {
        controle = new ControleAcademico();
    }

    @Test
    public void testMatricularAluno() {
        controle.matricularAluno("João", 123);
        assertEquals(1, controle.getAlunos().size());
    }

    @Test
    public void testMatricularProfessor() {
        controle.matricularProfessor("Maria", 456);
        assertEquals(1, controle.getProfessores().size());
    }

    @Test
    public void testCadastrarDisciplina() {
        controle.cadastrarDisciplina("Matemática", "MAT001", "08:00", "10:00");
        assertEquals(1, controle.getDisciplinas().size());
    }

    @Test
    public void testRetornarAluno() throws NaoEncontrado {
        controle.matricularAluno("João", 123);
        assertEquals("João", controle.retornarAluno(123).getAluno().getNome());
    }

    @Test(expected = NaoEncontrado.class)
    public void testRetornarAlunoNaoEncontrado() throws NaoEncontrado {
        controle.retornarAluno(999);
    }

    @Test
    public void testRetornarProfessor() throws NaoEncontrado {
        controle.matricularProfessor("Maria", 456);
        assertEquals("Maria", controle.retornarProfessor(456).getProfessor().getNome());
    }

    @Test(expected = NaoEncontrado.class)
    public void testRetornarProfessorNaoEncontrado() throws NaoEncontrado {
        controle.retornarProfessor(999);
    }

    @Test
    public void testRetornarDisciplina() throws NaoEncontrado {
        controle.cadastrarDisciplina("Matemática", "MAT001", "08:00", "10:00");
        assertEquals("Matemática", controle.retornarDisciplina("MAT001").getNome());
    }

    @Test(expected = NaoEncontrado.class)
    public void testRetornarDisciplinaNaoEncontrada() throws NaoEncontrado {
        controle.retornarDisciplina("INVALID");
    }
}
