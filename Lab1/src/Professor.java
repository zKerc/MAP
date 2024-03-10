import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas;
    private String horario;

    public Professor(String nome, List<Disciplina> disciplinas, String horario) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
