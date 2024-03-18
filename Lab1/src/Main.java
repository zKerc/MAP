
import ClassesAssociacao.AlunoDisciplina;
import ClassesAssociacao.ProfessorDisciplina;
import Exception.NaoEncontrado;


public class Main {
    public static void main(String[] args) throws NaoEncontrado {

        ControleAcademico controle = new ControleAcademico();
        
        // Matricular um aluno e cadastrar disciplinas
        controle.matricularAluno("Kaio", 123);
        controle.matricularAluno("Arthur", 2345);
        controle.cadastrarDisciplina("Matemática", "12312321", "11:00", "13:00");
        controle.cadastrarDisciplina("Lógica", "12321", "9:00", "11:00");

        // Matricular um professor
        controle.matricularProfessor("Sabrina", 213);

        // Adicionar disciplina ao aluno
        controle.adicionarDisciplinaAoAluno(123, "12321");
        controle.adicionarDisciplinaAoAluno(2345, "12321");

        // Adicionar disciplina ao professor
        controle.adicionarDisciplinaAoProfessor(213, "12321");
        controle.adicionarDisciplinaAoProfessor(213, "12312321");



        // Quais alunos de uma dada disciplina?
        // Quantos alunos em uma dada disciplina?
        controle.consultarAlunosNaDisciplina("12321");

        // Quais disciplinas um professor esta ministrando?
        // Quais os horarios de um professor?
        ProfessorDisciplina professorDisciplina = controle.retornarProfessor(213);
        professorDisciplina.verificarDisciplinas();
       

        // Quais as disciplinas de um aluno
        // Quais os horarios de um aluno?
        AlunoDisciplina alunoPorDisciplina = controle.retornarAluno(2345);
        alunoPorDisciplina.verificarDisciplinas();


        


        

    }
}
