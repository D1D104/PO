package Lab.Aula_06;

public class Monstro {
    private int idade;
    private int vida;
    private int energia;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void assustar(Monstro mostroAlvo){
        System.out.println("Susto");
    }
}
