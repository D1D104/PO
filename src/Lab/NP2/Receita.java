package Lab.NP2;

public class Receita {
    private String nome;
    private int dificuldade;

    public Receita(String nome, int dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
