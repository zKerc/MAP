public class MaquinaDeChicletes {
 
    // variáveis de instância que representam os estados
    final static int ESGOTADO = 0;
    final static int SEM_MOEDA = 1;
    final static int TEM_MOEDA = 2;
    final static int VENDIDO = 3;
 
    int estado = ESGOTADO; //estado atual
    int contagem = 0; //contagem de chicletes

    //construtor recebe número de chicletes
    public MaquinaDeChicletes(int contagem) {
        this.contagem = contagem;
        if (contagem > 0) {
            estado = SEM_MOEDA;
        }
    }

    //métodos que representam as ações possíveis na máquina
  
    public void inserirMoeda() {
        if (estado == TEM_MOEDA) {
            System.out.println("Você não pode inserir outra moeda");
        } else if (estado == SEM_MOEDA) {
            estado = TEM_MOEDA;
            System.out.println("Você inseriu uma moeda");
        } else if (estado == ESGOTADO) {
            System.out.println("Você não pode inserir uma moeda, a máquina está esgotada");
        } else if (estado == VENDIDO) {
            System.out.println("Por favor, aguarde, já estamos lhe dando um chiclete");
        }
    }

    public void ejetarMoeda() {
        if (estado == TEM_MOEDA) {
            System.out.println("Moeda devolvida");
            estado = SEM_MOEDA;
        } else if (estado == SEM_MOEDA) {
            System.out.println("Você não inseriu uma moeda");
        } else if (estado == VENDIDO) {
            System.out.println("Desculpe, você já virou a manivela");
        } else if (estado == ESGOTADO) {
            System.out.println("Você não pode ejetar, não inseriu uma moeda ainda");
        }
    }
 
    public void virarManivela() {
        if (estado == VENDIDO) {
            System.out.println("Virar duas vezes não lhe dá outro chiclete!");
        } else if (estado == SEM_MOEDA) {
            System.out.println("Você virou, mas não há moeda");
        } else if (estado == ESGOTADO) {
            System.out.println("Você virou, mas não há chicletes");
        } else if (estado == TEM_MOEDA) {
            System.out.println("Você virou...");
            estado = VENDIDO;
            distribuir();
        }
    }
 
    private void distribuir() {
        if (estado == VENDIDO) {
            System.out.println("Um chiclete está saindo");
            contagem = contagem - 1;
            if (contagem == 0) {
                System.out.println("Oops, sem chicletes!");
                estado = ESGOTADO;
            } else {
                estado = SEM_MOEDA;
            }
        } else if (estado == SEM_MOEDA) {
            System.out.println("Você precisa pagar primeiro");
        } else if (estado == ESGOTADO) {
            System.out.println("Nenhum chiclete distribuído");
        } else if (estado == TEM_MOEDA) {
            System.out.println("Nenhum chiclete distribuído");
        }
    }
 
    public void reabastecer(int numChicletes) {
        this.contagem = numChicletes;
        estado = SEM_MOEDA;
    }

    public String toString() {
        StringBuffer resultado = new StringBuffer();
        resultado.append("\nMighty Gumball, Inc.");
        resultado.append("\nModelo de Chiclete Java #2004\n");
        resultado.append("Inventário: " + contagem + " chiclete");
        if (contagem != 1) {
            resultado.append("s");
        }
        resultado.append("\nA máquina está ");
        if (estado == ESGOTADO) {
            resultado.append("esgotada");
        } else if (estado == SEM_MOEDA) {
            resultado.append("esperando por uma moeda");
        } else if (estado == TEM_MOEDA) {
            resultado.append("esperando por virar a manivela");
        } else if (estado == VENDIDO) {
            resultado.append("entregando um chiclete");
        }
        resultado.append("\n");
        return resultado.toString();
    }
}