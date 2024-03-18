package ClassesAssociacao;

import java.util.ArrayList;

import ClassesSimples.Disciplina;
import ClassesSimples.Professor;

public class ProfessorDisciplina {
    private Professor professor;
    private ArrayList<Disciplina> disciplinas;

    public ProfessorDisciplina(String nome, int matriculaProfessor) {
        this.professor = new Professor(nome, matriculaProfessor);
        this.disciplinas = new ArrayList<>();
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(int id) {
        disciplinas.remove(id);
    }

    public void verificarDisciplinas() {
        System.out.println("\nO(A) professor(a) " + professor.getNome() + " está ensinando as seguintes disciplinas:\n");
        for (Disciplina disciplina:
                disciplinas) {
            System.out.println(disciplina.getNome());
            disciplina.consultarHorario();
        }
    }


    public void verificarHorarios() {
        System.out.println("\nHorários do(a) professor(a) " + professor.getNome() + ":\n");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Horário de Início: " + disciplina.getHorarios().getInicio()); // Aqui está a alteração
            System.out.println("Horário de Fim: " + disciplina.getHorarios().getFim()); // Se necessário
        }
    }

    

    //gets & sets
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
