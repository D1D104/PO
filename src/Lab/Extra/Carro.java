package Lab.Extra;

public class Carro {
    private Motor motor;
    private int tipoDePneu;

    public Motor getMotor() {
        return motor;
    }

    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public void correr() {
        System.out.println("Carro correndo vrumm");
    }

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        Health(tipoDePneu);
        this.motor = new Motor(potencia, turbo);
    }
    private void Health(int tipoDePneu) { //garantir que os tipos de pneu vão de 1 a 5
        if (tipoDePneu <1 || tipoDePneu > 5) {
            throw new IllegalArgumentException();
        } else {
            this.tipoDePneu = tipoDePneu;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }
}
