package Lab.Aula_06;

public class Feitico {
    private String nome;
    private int poder;

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    public Feitico(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }
}
