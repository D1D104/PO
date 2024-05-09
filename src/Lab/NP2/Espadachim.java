package Lab.NP2;

public class Espadachim extends Pirata  implements Comandar{
    private String nomeDaEspada;

    public Espadachim(String nome, String comidaFavorita, int poder, String nomeDaEspada) {
        super.setNome(nome);
        super.setComidaFavorita(comidaFavorita);
        super.setPoder(poder);
        this.nomeDaEspada = nomeDaEspada;
    }

    @Override
    public void darOrdens() {
        System.out.println("O imediato está ordenando os tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O imediato esta mudando a rota");
    }
}
