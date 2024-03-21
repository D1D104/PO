package Lab.Aula_04;

public class Autor {
    private String nome;
    private Saga[] sagas = new Saga[10];

    public void setNome(String nome) {
        this.nome = nome;
    }
 public void listarSagas() {
        for(Saga saga: sagas){
            if(saga != null){
                System.out.println(saga);
            }
        }
    }

    public void adionarSaga(Saga saga) {
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] == null) {
                sagas[i] = saga;
                break;
            }
        }
    }
}
