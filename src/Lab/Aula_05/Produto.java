package Lab.Aula_05;

public class Produto {
    private double valor;
    private String nome;

    public Produto(double valor, String nome) {
        this.nome=nome;
        this.valor=valor;
    }
    public void mostraInfo() {
        System.out.println(nome + " " + valor);
    }
}
