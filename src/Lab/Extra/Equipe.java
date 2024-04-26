package Lab.Extra;

import java.util.Arrays;

public class Equipe {
    private Carro carro;
    private Piloto[] pilotos = new Piloto[4];
    private Piloto pilotoAtual;
    private String nome;

    private boolean trocarPilotoAtual(int pilodoid) {
        boolean aux = false;
        pilotoAtual = pilotos[pilodoid];
        if (pilotoAtual == pilotos[pilodoid]) {
            aux = true;
        }
        return aux;
    }

    public Carro getCarro() {
        return carro;
    }

    private boolean trocarPneu(int tipoDePneu) {
        boolean aux = false;
        carro.setTipoDePneu(tipoDePneu);
        if (carro.getTipoDePneu() == tipoDePneu) {
            aux = true;
        }
        return aux;
    }

    public void pitStop(int tipoDePneu, int pilotoid) {
        trocarPneu(tipoDePneu);
        if (pilotos[pilotoid] != null) {
            trocarPilotoAtual(pilotoid);
            System.out.println("Sucesso em trocar piloto");
        }
    }

    public boolean adicionarPiloto(Piloto piloto) {
        boolean aux = false;
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i] == null) {
                pilotos[i] = piloto;
                aux = true;
                break;
            }
        }
        return aux;
    }

    public boolean retirarPiloto(int pilodoid) {
        boolean aux = false;
        pilotos[pilodoid] = null;
        if (pilotos[pilodoid] == null) {
            aux = true;
        }
        return aux;
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo) {
        this.carro = new Carro(tipoDePneu, potencia, turbo);
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", nome='" + nome + '\'' +
                '}';
    }
}
