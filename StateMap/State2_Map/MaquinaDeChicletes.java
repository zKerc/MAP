
public class MaquinaDeChicletes {
	
	//objetos Estados
	Estado estadoEsgotado;
	Estado estadoSemMoeda;
	Estado estadoTemMoeda;
	Estado estadoVendido;
 
	Estado estado;
	int contagem = 0;
 
	public MaquinaDeChicletes(int numeroDeChicletes) {
		estadoEsgotado = new EstadoEsgotado(this);
		estadoSemMoeda = new EstadoSemMoeda(this);
		estadoTemMoeda = new EstadoTemMoeda(this);
		estadoVendido = new EstadoVendido(this);

		this.contagem = numeroDeChicletes;
 		if (numeroDeChicletes > 0) {
			estado = estadoSemMoeda;
		} else {
			estado = estadoEsgotado;
		}
	}
 
	public void inserirMoeda() {
		estado.inserirMoeda();
	}
 
	public void ejetarMoeda() {
		estado.ejetarMoeda();
	}
 
	public void virarManivela() {
		estado.virarManivela();
		estado.dispensar();
	}
 
	void liberarChiclete() {
		System.out.println("Um chiclete está saindo do compartimento...");
		if (contagem > 0) {
			contagem = contagem - 1;
		}
	}
 
	int getContagem() {
		return contagem;
	}
 
	void reabastecer(int contagem) {
		this.contagem += contagem;
		System.out.println("A máquina de chicletes foi reabastecida; seu novo estoque é: " + this.contagem);
		estado.reabastecer();
	}

	void setEstado(Estado estado) {
		this.estado = estado;
	}
    public Estado getEstado() {
        return estado;
    }

    public Estado getEstadoEsgotado() {
        return estadoEsgotado;
    }

    public Estado getEstadoSemMoeda() {
        return estadoSemMoeda;
    }

    public Estado getEstadoTemMoeda() {
        return estadoTemMoeda;
    }

    public Estado getEstadoVendido() {
        return estadoVendido;
    }
 
	public String toString() {
		StringBuffer resultado = new StringBuffer();
		resultado.append("\nMighty Gumball, Inc.");
		resultado.append("\nModelo de Chiclete Java #2004");
		resultado.append("\nInventário: " + contagem + " chiclete");
		if (contagem != 1) {
			resultado.append("s");
		}
		resultado.append("\n");
		resultado.append("A máquina está " + estado + "\n");
		return resultado.toString();
	}
}
