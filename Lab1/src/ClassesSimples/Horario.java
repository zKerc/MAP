package ClassesSimples;


public class Horario {
    private String inicio;
    private String fim;

    public boolean retornarHorarios() {
        String[] partesInicio = inicio.split(":");
        String[] partesFim = fim.split(":");

        String horasInicio = partesInicio[0];
        String horasFim = partesFim[0];

        System.out.println("Ínicio: " + horasInicio + " Fim: " + horasFim);

        int horasComoIntInicio = Integer.parseInt(horasInicio);
        int horasComoIntFim = Integer.parseInt(horasFim);

        return horasComoIntInicio < horasComoIntFim;
    }

    public Horario(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }
}
