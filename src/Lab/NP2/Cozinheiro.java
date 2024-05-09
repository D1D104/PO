package Lab.NP2;

import java.util.ArrayList;

public class Cozinheiro extends Pirata {
    ArrayList<Receita> listaDeReceitas = new ArrayList<>();

    public String prepararPrato(int index) {
        return listaDeReceitas.get(index).getNome();
    }

    public void mostrarReceitas() {
        try {
            System.out.print("[");
            for (Receita receita : listaDeReceitas) {
                System.out.print(receita.getNome() + " - ");
            }
            System.out.println("]");
        } catch (NullPointerException e) {
            System.out.println("Erro = " + e);
        }

    }

    public Cozinheiro(String nomeP, String comidaFav, int poder, String nome, int dificuldade) {
        super.setNome(nomeP);
        super.setComidaFavorita(comidaFav);
        super.setPoder(poder);
        listaDeReceitas.add(new Receita(nome, dificuldade));
    }

    public void criarReceita(String nome, int difuculdade) {
        //criei esse metódo para adicionar uma receita nova sem ser pelo construtor;
        listaDeReceitas.add(new Receita(nome, difuculdade));
    }

    public ArrayList<Receita> getListaDeReceitas() {
        return listaDeReceitas;
    }
}
