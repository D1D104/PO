package Lab.NP2;

public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public Pirata() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void comer(Cozinheiro cozinheiro, int index) {
        System.out.println(cozinheiro.prepararPrato(index));
        if (comidaFavorita == (cozinheiro.getListaDeReceitas().get(index).getNome())) {
            poder += 2;
        } else {
            poder++;
        }
    }

    public Pirata lutar(Pirata pirata) {
        if (this.poder > pirata.getPoder()) {
            return this;
        } else return pirata;
    }
}

