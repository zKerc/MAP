package ClassesSimples;

public class Disciplina {
    private String nome;
    private String id;
    private Horario horarios;

    public void consultarHorario() {
        horarios.retornarHorarios();
    }

    public Disciplina(String nome, String id, String inicio, String fim) {
        Horario novoHorario = new Horario(inicio, fim);
        this.nome = nome;
        this.id = id;
        this.horarios = novoHorario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Horario getHorarios() {
        return horarios;
    }

    public void setHorarios(Horario horarios) {
        this.horarios = horarios;
    }
}