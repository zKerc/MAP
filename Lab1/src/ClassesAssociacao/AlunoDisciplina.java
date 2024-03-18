package ClassesAssociacao;

import java.util.ArrayList;

import ClassesSimples.Aluno;
import ClassesSimples.Disciplina;

public class AlunoDisciplina {
    private Aluno aluno;
    private ArrayList<Disciplina> disciplinas;

    public AlunoDisciplina(String nome, int matriculaAluno) {
        this.aluno = new Aluno(nome, matriculaAluno);
        this.disciplinas = new ArrayList<>();
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(int id) {
        disciplinas.remove(id);
    }

    public void verificarDisciplinas() {
        System.out.println("\nO aluno " + aluno.getNome() + " está matrículado nas seguintes disciplinas:\n");
        for (Disciplina disciplina :
                disciplinas) {
            System.out.println(disciplina.getNome());
            disciplina.consultarHorario();
        }
    }


    public boolean estaMatriculadoNaDisciplina(String idDisciplina) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getId().equals(idDisciplina)) {
                return true;
            }
        }
        return false;
    }



    //gets & sets
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
