import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public ControleAcademico() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }
    
    //Matricula aluno no Controle Acadêmico
    public boolean matricularAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            System.out.println("O aluno " + aluno.getNome() + " já está matriculado.");
            return false;
        }
        alunos.add(aluno);
        return true;
    }
    
    //Atribui um professor a uma disciplina (Coordenador)
    public void atribuirProfessor(Professor professor, Disciplina disciplina) {
        if (!professores.contains(professor)) {
            professores.add(professor);
        }
        disciplina.setProfessorTitular(professor);
        professor.atribuirDisciplina(disciplina);
    }
}
