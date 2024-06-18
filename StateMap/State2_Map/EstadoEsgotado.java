
public class EstadoEsgotado implements Estado {
    MaquinaDeChicletes maquinaDeChicletes;
 
    public EstadoEsgotado(MaquinaDeChicletes maquinaDeChicletes) {
        this.maquinaDeChicletes = maquinaDeChicletes;
    }
 
	public void inserirMoeda() {
		System.out.println("Você não pode inserir uma moeda, a máquina está esgotada");
	}
 
	public void ejetarMoeda() {
		System.out.println("Você não pode ejetar, você ainda não inseriu uma moeda");
	}
 
	public void virarManivela() {
		System.out.println("Você virou, mas não há chicletes");
	}
 
	public void dispensar() {
		System.out.println("Nenhum chiclete distribuído");
	}
	
	public void reabastecer() { 
		maquinaDeChicletes.setEstado(maquinaDeChicletes.getEstadoSemMoeda());
	}
 
	public String toString() {
		return "esgotado";
	}
}
