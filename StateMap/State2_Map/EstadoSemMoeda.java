
public class EstadoSemMoeda implements Estado {
    MaquinaDeChicletes maquinaDeChicletes;
 
	//referência para a máquina de chicletes
    public EstadoSemMoeda(MaquinaDeChicletes maquinaDeChicletes) {
        this.maquinaDeChicletes = maquinaDeChicletes;
    }
 
	public void inserirMoeda() {
		System.out.println("Você inseriu uma moeda");
		maquinaDeChicletes.setEstado(maquinaDeChicletes.getEstadoTemMoeda());
	}
 
	public void ejetarMoeda() {
		System.out.println("Você não inseriu uma moeda");
	}
 
	public void virarManivela() {
		System.out.println("Você virou, mas não há moeda");
	}
 
	public void dispensar() {
		System.out.println("Você precisa pagar primeiro");
	} 
	
	public void reabastecer() { }
 
	public String toString() {
		return "esperando por uma moeda";
	}
}
