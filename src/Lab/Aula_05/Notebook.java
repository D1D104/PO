package Lab.Aula_05;

public class Notebook extends Produto {
    private String processador;
    private String memoria;

    public void instalarAplicativo() {
        System.out.println("App instalado");
    }

    public void mostrarInfo() {
        super.mostraInfo();
        System.out.println(processador);
        System.out.println(memoria);
    }

    public Notebook(double valor, String nome, String processador, String memoria) {
        super(valor, nome);
        this.processador = processador;
        this.memoria = memoria;
    }
}
