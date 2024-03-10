import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome, Professor professor, List<Aluno> alunosMatriculados) {
        this.nome = nome;
        this.professor = professor;
        this.alunosMatriculados = alunosMatriculados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
