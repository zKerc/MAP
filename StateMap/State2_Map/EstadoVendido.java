
public class EstadoVendido implements Estado {
 
    MaquinaDeChicletes maquinaDeChicletes;
 
    public EstadoVendido(MaquinaDeChicletes maquinaDeChicletes) {
        this.maquinaDeChicletes = maquinaDeChicletes;
    }
       
	public void inserirMoeda() {
		System.out.println("Por favor, espere, já estamos entregando um chiclete");
	}
 
	public void ejetarMoeda() {
		System.out.println("Desculpe, você já virou a manivela");
	}
 
	public void virarManivela() {
		System.out.println("Virar duas vezes não vai te dar outro chiclete!");
	}
 
	public void dispensar() {
		maquinaDeChicletes.liberarChiclete();
		if (maquinaDeChicletes.getContagem() > 0) {
			maquinaDeChicletes.setEstado(maquinaDeChicletes.getEstadoSemMoeda());
		} else {
			System.out.println("Ops, sem chicletes!");
			maquinaDeChicletes.setEstado(maquinaDeChicletes.getEstadoEsgotado());
		}
	}
	
	public void reabastecer() { }
 
	public String toString() {
		return "distribuindo um chiclete";
	}
}
