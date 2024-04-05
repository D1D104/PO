package Lab.Aula_06;

public class Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public void transformar() {
        if (formaDeMorcego) {
            formaDeMorcego = false;
        }
    }

    public void recuperarVida() {
        setVida(getVida() + medidorDeSangue);
    }

    public void atacarComMordida(Monstro monstoAlvo) {
        monstoAlvo.setVida(monstoAlvo.getVida()-getEnergia());
    }

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego) {
        super.setIdade(idade);
        super.setVida(vida);
        super.setEnergia(energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;
    }
}