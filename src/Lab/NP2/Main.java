package Lab.NP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pirata pirata1 = new Pirata("Edu", "queijo", 21);
        Cozinheiro cozinheiro1 = new Cozinheiro("Pedro", "Sushi", 10, "Temaki", 2);
        Capitao capitao = new Capitao(10, "Rogerio", "Pastel", 20);
        Espadachim espadachim = new Espadachim("Diego", "Bolacha", 15, "Espadinha");
        cozinheiro1.criarReceita("queijo", 2);

        capitao.conquistarNovoSeguidor(pirata1);
        System.out.println(capitao.getNumeroDeSeguidores());
        System.out.println("Pirata vencedor da luta: " + capitao.lutar(pirata1).getNome());
        pirata1.comer(cozinheiro1, 1);
        System.out.println(pirata1.getPoder());
        cozinheiro1.mostrarReceitas();
        capitao.darOrdens();
        capitao.mudarRota();
        espadachim.darOrdens();
        espadachim.mudarRota();
    }
}
