package Lab.Aula_05;

public class Console extends Produto{
    private String geracao;
    private String marca;
    public void jogar(){
        System.out.println("Jogando");
    }
    public void mostrarInfo(){
        super.mostraInfo();
        System.out.println(marca);
        System.out.println(geracao);
    }
    public Console(double valor, String nome, String geracao, String marca) {
        super(valor, nome);
        this.geracao = geracao;
        this.marca = marca;
    }
}
