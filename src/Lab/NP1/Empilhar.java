package Lab.NP1;

public class Empilhar extends Robo {
    private Pacote[] pacotes = new Pacote[10];
    private int pesoMaximo;

    public void adicionarPacote(int peso) {
        if (peso < pesoMaximo) {
            for (int i = 0; i < pacotes.length; i++) {
                if (pacotes[i] == null) {
                    pacotes[i] = new Pacote(peso);
                    break;
                }
            }
        } else {
            System.out.println("Peso ultrapassado");
        }
    }

    public void removerPacote(int posicao) {
        pacotes[posicao] = null;
    }

    public void mostrarPacote() {
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] != null) {
                System.out.println("Pacote " + (i + 1) + " com peso de " + pacotes[i].getPeso());
            }
        }
    }

    public Empilhar(int energia, String nome, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pesoMaximo = pesoMaximo;
    }
}
