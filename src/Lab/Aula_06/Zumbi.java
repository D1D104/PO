package Lab.Aula_06;

public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos;
    public void atacarComMordida(Monstro mostroAlvo){
        int aux = mostroAlvo.getVida()-getEnergia();
        mostroAlvo.setVida(aux);
    }

    public Zumbi(int vida, int idade, int energia,int numeroDeCerebrosComidos) {
        super.setIdade(idade);
        super.setVida(vida);
        super.setEnergia(energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }
}
