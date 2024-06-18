//import java.util.Random;

public class EstadoTemMoeda implements Estado {
	MaquinaDeChicletes maquinaDeChicletes;
 
	public EstadoTemMoeda(MaquinaDeChicletes maquinaDeChicletes) {
		this.maquinaDeChicletes = maquinaDeChicletes;
	}
  
	public void inserirMoeda() {
		System.out.println("Você não pode inserir outra moeda");
	}
 
	public void ejetarMoeda() {
		System.out.println("Moeda devolvida");
		maquinaDeChicletes.setEstado(maquinaDeChicletes.getEstadoSemMoeda());
	}
 
	public void virarManivela() {
		System.out.println("Você virou...");
		maquinaDeChicletes.setEstado(maquinaDeChicletes.getEstadoVendido());
	}

    public void dispensar() {
        System.out.println("Nenhum chiclete distribuído");
    }
    
    public void reabastecer() { }
 
	public String toString() {
		return "esperando virar a manivela";
	}
}
