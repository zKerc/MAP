package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DisciplinaTest {

    @Test
    public void testGetNome() {
        Disciplina disciplina = new Disciplina("Matemática", null, new ArrayList<>());
        assertEquals("Matemática", disciplina.getNome());
    }

    @Test
    public void testSetNome() {
        Disciplina disciplina = new Disciplina("Física", null, new ArrayList<>());
        disciplina.setNome("Química");
        assertEquals("Química", disciplina.getNome());
    }

    @Test
    public void testGetProfessor() {
        Professor professor = new Professor("João", new ArrayList<>(), "Segunda-feira, 8h-12h");
        Disciplina disciplina = new Disciplina("Biologia", professor, new ArrayList<>());
        assertEquals(professor, disciplina.getProfessor());
    }

    @Test
    public void testSetProfessor() {
        Professor professor1 = new Professor("Maria", new ArrayList<>(), "Terça-feira, 10h-14h");
        Professor professor2 = new Professor("Pedro", new ArrayList<>(), "Quarta-feira, 14h-18h");
        Disciplina disciplina = new Disciplina("História", professor1, new ArrayList<>());
        disciplina.setProfessor(professor2);
        assertEquals(professor2, disciplina.getProfessor());
    }

    @Test
    public void testGetAlunosMatriculados() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 123));
        alunos.add(new Aluno("Carlos", 456));
        Disciplina disciplina = new Disciplina("Geografia", null, alunos);
        assertEquals(alunos, disciplina.getAlunosMatriculados());
    }

    @Test
    public void testSetAlunosMatriculados() {
        List<Aluno> alunos1 = new ArrayList<>();
        alunos1.add(new Aluno("Ana", 123));
        alunos1.add(new Aluno("Carlos", 456));
        List<Aluno> alunos2 = new ArrayList<>();
        alunos2.add(new Aluno("Mariana", 789));
        Disciplina disciplina = new Disciplina("Inglês", null, alunos1);
        disciplina.setAlunosMatriculados(alunos2);
        assertEquals(alunos2, disciplina.getAlunosMatriculados());
    }
}

