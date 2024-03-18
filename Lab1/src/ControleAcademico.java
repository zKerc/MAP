import java.util.ArrayList;

import ClassesAssociacao.AlunoDisciplina;
import ClassesAssociacao.ProfessorDisciplina;
import ClassesSimples.Disciplina;
import Exception.NaoEncontrado;

public class ControleAcademico {

    private ArrayList<AlunoDisciplina> alunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<ProfessorDisciplina> professores;

    public ControleAcademico() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }



    //Cadastrar
    public void matricularAluno(String nome, int matricula) {
        AlunoDisciplina novoAluno = new AlunoDisciplina(nome, matricula);
        alunos.add(novoAluno);
    }

    public void matricularProfessor(String nome, int matricula) {
        ProfessorDisciplina novoProfessor = new ProfessorDisciplina(nome, matricula);
        professores.add(novoProfessor);
    }

    public void cadastrarDisciplina(String nome, String id, String inicio, String fim) {
        Disciplina novaDisciplina = new Disciplina(nome, id, inicio, fim);
        disciplinas.add(novaDisciplina);
    }

    //Operações
    public AlunoDisciplina retornarAluno(int matricula) throws NaoEncontrado {
        AlunoDisciplina alunoProcurado = null;
        for (AlunoDisciplina alunoNaLista : alunos) {
            if (alunoNaLista.getAluno().getMatricula() == matricula) {
                alunoProcurado = alunoNaLista;
                break;
            }
        }
        if (alunoProcurado != null) {
            return alunoProcurado;
        } else {
            throw new NaoEncontrado("Aluno não encontrado com a matrícula especificada: " + matricula);
        }
    }
    public ProfessorDisciplina retornarProfessor(int matricula) throws NaoEncontrado {
        ProfessorDisciplina professorProcurado = null;
        for (ProfessorDisciplina professorNaLista : professores) {
            if (professorNaLista.getProfessor().getMatricula() == matricula) {
                professorProcurado = professorNaLista;
                break;
            }
        }
        if (professorProcurado != null) {
            return professorProcurado;
        } else {
            throw new NaoEncontrado("Aluno não encontrado com a matrícula especificada: " + matricula);
        }
    }
    public Disciplina retornarDisciplina(String id) throws NaoEncontrado {
        Disciplina disciplinaProcurada = null;
        for (Disciplina disciplinaNaLista : disciplinas) {
            if (disciplinaNaLista.getId().equals(id)) {
                disciplinaProcurada = disciplinaNaLista;
                break;
            }
        }
        if (disciplinaProcurada != null) {
            return disciplinaProcurada;
        } else {
            throw new NaoEncontrado("Disciplina não encontrada com esse id: " + id);
        }
    }

    // ConsultarAlunosNaDisciplina para mostrar nomes dos alunos matriculados
    public void consultarAlunosNaDisciplina(String idDisciplina) throws NaoEncontrado {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        Disciplina disciplina = retornarDisciplina(idDisciplina);

        for (AlunoDisciplina alunoDisciplina : alunos) {
            if (alunoDisciplina.estaMatriculadoNaDisciplina(idDisciplina)) {
                nomesAlunos.add(alunoDisciplina.getAluno().getNome());
            }
        }

        System.out.println(disciplina.getNome() + " possui " + nomesAlunos.size() + " aluno(s) matriculado(s):");
        for (String nomeAluno : nomesAlunos) {
            System.out.println("- " + nomeAluno);
        }
    }

    //Metodos de associação
    public void adicionarDisciplinaAoAluno(int matricula, String idDisciplina) throws NaoEncontrado {
        Disciplina disciplina = retornarDisciplina(idDisciplina);
        AlunoDisciplina aluno = retornarAluno(matricula);

        if(aluno.getDisciplinas().contains(disciplina)){
            System.out.println("O aluno já está cursando essa disciplina.");
        }
        else {
            aluno.cadastrarDisciplina(disciplina);
            System.out.println(aluno.getAluno().getNome() + " foi matrículado em " + disciplina.getNome());
            System.out.println("\n");
        }
    }
    public void adicionarDisciplinaAoProfessor(int matricula, String idDisciplina) throws NaoEncontrado {
        Disciplina disciplina = retornarDisciplina(idDisciplina);
        ProfessorDisciplina professor = retornarProfessor(matricula);

        if(professor.getDisciplinas().contains(disciplina)){
            System.out.println("O professor já está ensinando essa disciplina.");
        }
        else {
            professor.cadastrarDisciplina(disciplina);
            System.out.println(professor.getProfessor().getNome() + " agora está lecionando " + disciplina.getNome());
            System.out.println("\n");
        }
    }

    //gets & sets
    public ArrayList<AlunoDisciplina> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoDisciplina> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<ProfessorDisciplina> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<ProfessorDisciplina> professores) {
        this.professores = professores;
    }
}