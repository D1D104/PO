package Lab.NP1;

public class Camera {
    private int qualidade;

    public int acharPecas() {
        int aux = (int) ((Math.random() * 9) + 1);
        return aux;
    }

    public Camera(int qualidade) {
        this.qualidade = qualidade;
    }
}
