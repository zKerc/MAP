import java.util.ArrayList;
import java.util.List;

public class Professor {
	 private String nome;
	    private List<Disciplina> disciplinasAtuais;

	    public Professor(String nome) {
	        this.nome = nome;
	        this.disciplinasAtuais = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }
	    //Quais disciplinas um professor está ministrando?
	    public List<Disciplina> getDisciplinasMinistradas() {
	        return disciplinasAtuais;
	    }

	    public void atribuirDisciplina(Disciplina disciplina) {
	        disciplinasAtuais.add(disciplina);
	        disciplina.setProfessorTitular(this);
	    }
}
