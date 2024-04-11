package Lab.NP1;

public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos = 0;
    private int energiaMaxima;

    public void trabalhar() {
        energia -= 1;
    }

    public void trocarEnergia(Robo roboAlvo) {
        int aux = roboAlvo.energiaMaxima - roboAlvo.energia;
        if (aux < energia) {
            roboAlvo.energia = roboAlvo.energiaMaxima;
            energia -= aux;
        }
    }

    public void regarregar(int horas) {
        int aux = energia + horas;
        if (aux > energiaMaxima) {
            energia = energiaMaxima;
        } else {
            energia += horas;
        }
    }

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
        totalDeRobos += 1;
    }

    public int getEnergia() {
        return energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
