import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Arthur", 21209876);
        Aluno aluno2 = new Aluno("Kaio", 21209878);
        
        
        Professor professor1 = new Professor("Marcos");
        Disciplina disciplina1 = new Disciplina("MAP", "09:00 - 11:00");
        Disciplina disciplina2 = new Disciplina("APS", "11:00 - 13:00");
        Disciplina disciplina3 = new Disciplina("Redes", "14:00 - 16:00");
        
 

        // Matrícula de alunos na disciplina
        disciplina1.matricularAluno(aluno1);
        disciplina1.matricularAluno(aluno2);
        disciplina2.matricularAluno(aluno1);

        // Atribuição de disciplina ao professor
        professor1.atribuirDisciplina(disciplina1);
        professor1.atribuirDisciplina(disciplina2);
        professor1.atribuirDisciplina(disciplina3);

        // Quais disciplinas um professor está ministrando
        System.out.println("Docente " + professor1.getNome() + " está ministrando as disciplinas:");
        for (Disciplina d : professor1.getDisciplinasMinistradas()) {
            System.out.println(d.getNome());
        }
        
        //Qual o horário de um professor
        System.out.println("\nHorário do docente " + professor1.getNome() + ":");
        for (Disciplina d : professor1.getDisciplinasMinistradas()) {
            System.out.println(d.getNome() + " - Horário: " + d.getHorarioDisciplina());
        }
        
        // Quais os alunos de uma dada disciplina
        System.out.println("\nLista de alunos da disciplina " + disciplina1.getNome() + ":");
        List<Aluno> alunosMatriculados = disciplina1.listarAlunosMatriculados();

        // Itera sobre a lista de alunos matriculados e exibe
        for (Aluno aluno : alunosMatriculados) {
         System.out.println("\nNome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
        
        // Quais as disciplinas de um aluno
        System.out.println("\nDisciplinas de " + aluno1.getNome() + ":");
        for (Disciplina d : aluno1.getDisciplinasMatriculadas()) {
            System.out.println(d.getNome());
        }
        
        // Quais os horários de aula de um discente
        System.out.println("\nHorários de aula do dicente " + aluno1.getNome() + ":");
        for (Disciplina d : aluno1.getDisciplinasMatriculadas()) {
            System.out.println(d.getNome() + " - Horário: " + d.getHorarioDisciplina());
        }
        
        // Qual o número de alunos de uma disciplina
        System.out.println("\nNúmero de alunos na disciplina " + disciplina1.getNome() + ": " + disciplina1.getAlunosMatriculados().size());
    }
}
