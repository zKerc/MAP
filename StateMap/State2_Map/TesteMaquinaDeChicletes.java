public class TesteMaquinaDeChicletes {

	public static void main(String[] args) {
		MaquinaDeChicletes maquinaDeChicletes = new MaquinaDeChicletes(2);

		System.out.println(maquinaDeChicletes);

		maquinaDeChicletes.inserirMoeda();
		maquinaDeChicletes.virarManivela();

		System.out.println(maquinaDeChicletes);

		maquinaDeChicletes.inserirMoeda();
		maquinaDeChicletes.virarManivela();
		maquinaDeChicletes.inserirMoeda();
		maquinaDeChicletes.virarManivela();
		
		maquinaDeChicletes.reabastecer(5);
		maquinaDeChicletes.inserirMoeda();
		maquinaDeChicletes.virarManivela();

		System.out.println(maquinaDeChicletes);
	}
}