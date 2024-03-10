import java.util.ArrayList;
import java.util.List;


public class Aluno {
    private String nome;
    private int matricula;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
    // Quais as disciplinas de um aluno?
    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        disciplina.matricularAluno(this);
    }

    
}
