import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String horarioDisciplina;
    private Professor professorTitular;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome, String horarioDisciplina) {
        this.nome = nome;
        this.horarioDisciplina = horarioDisciplina;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    //Horario (professor) e Horario (aluno)
    public String getHorarioDisciplina() {
        return horarioDisciplina;
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professor) {
        this.professorTitular = professor;
    }

    
    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }
    
    //Verifica se o aluno já está matriculado e realiza a matricula do aluno na discplina
    public boolean matricularAluno(Aluno aluno) {
        if (alunoJaEstaMatriculado(aluno)) {
            return false;
        }

        alunosMatriculados.add(aluno);
        aluno.matricularDisciplina(this);
        return true;
    }

    //Quais alunos matriculados na disciplina?
    public List<Aluno> listarAlunosMatriculados() {
        return alunosMatriculados;
    }

    private boolean alunoJaEstaMatriculado(Aluno aluno) {
        return alunosMatriculados.contains(aluno);
    }
}
