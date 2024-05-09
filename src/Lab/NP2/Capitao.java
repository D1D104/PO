package Lab.NP2;

public class Capitao extends Pirata implements Comandar {
    private int numeroDeSeguidores;

    public Capitao(int numeroDeSeguidores, String nome, String comidaFavorita, int poder) {
        this.numeroDeSeguidores = numeroDeSeguidores;
        super.setNome(nome);
        super.setNome(comidaFavorita);
        super.setPoder(poder);
    }

    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public void conquistarNovoSeguidor(Pirata pirata) {
        if (pirata.getPoder() >= getPoder()) {
            numeroDeSeguidores++;
        }
    }

    @Override
    public void darOrdens() {
        System.out.println("Capitao esta ordenando " + numeroDeSeguidores + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitao esta mudando a rota");
    }
}
