package Lab.NP1;

public class BracoArticulado extends Robo {
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int energiaMaxima, int numeroDeArticulacoes, int pressao) {
        super(energia, nome, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        garra = new Garra(pressao);
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void trabalhar() {
        if (camera != null) {
            garra.agarrarPeca(camera.acharPecas());
        } else {
            garra.agarrarPeca();
        }
    }

}
