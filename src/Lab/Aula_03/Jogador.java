package Lab.Aula_03;

public class Jogador {
    private int energia;
    private int vida;
    private Arma arma;

    public void atacar(Jogador alvo) {
        if (arma.getCustoDeEnergia() <= energia) {
            System.out.println("Consegue atacar");
            alvo.vida -= arma.getDano();
        } else {
            System.out.println("Não consegue atacar");
        }
    }

    public Jogador() {
    }

    public Jogador(Arma arma1, int energia, int vida) {
        this.arma = new Arma(arma1.getDano(), arma1.getCustoDeEnergia());
        this.energia = energia;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "energia=" + energia +
                ", vida=" + vida +
                ", dano arma=" + arma.getDano() +
                ", custo de energia arma=" + arma.getCustoDeEnergia() +
                '}';
    }
}