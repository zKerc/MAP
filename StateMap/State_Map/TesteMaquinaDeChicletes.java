public class TesteMaquinaDeChicletes {

    public static void main(String[] args) {
        MaquinaDeChicletes maquinaDeChicletes = new MaquinaDeChicletes(5);

        System.out.println(maquinaDeChicletes);

        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.virarManivela();

        System.out.println(maquinaDeChicletes);

        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.ejetarMoeda();
        maquinaDeChicletes.virarManivela();

        System.out.println(maquinaDeChicletes);

        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.virarManivela();
        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.virarManivela();
        maquinaDeChicletes.ejetarMoeda();

        System.out.println(maquinaDeChicletes);

        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.virarManivela();
        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.virarManivela();
        maquinaDeChicletes.inserirMoeda();
        maquinaDeChicletes.virarManivela();

        System.out.println(maquinaDeChicletes);
    }
}