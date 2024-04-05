package Lab.Aula_06;

public class Bruxa extends Monstro{
    private Feitico[] feitico = new Feitico[5];
    public boolean aprenderFeitico(String nome, int poder){
        boolean aux = false;
        for (int i = 0; i < feitico.length; i++) {
            if(feitico[i]==null){
                feitico[i] = new Feitico(nome, poder);
                aux = true;
                break;
            }
        }
        return aux;
    }
    public void listarFeitico(){
        for (int i = 0; i < feitico.length; i++) {
            if(feitico[i]!=null){
                System.out.println(feitico[i].getNome());
            }
        }
    }
    public void esquecerFeitico(int posicao){
        feitico[posicao] = null;
    }
    public void lancarFeitico(Monstro monstroAlvo, int posicao){
        int aux = feitico[posicao].getPoder();
        monstroAlvo.setVida(monstroAlvo.getVida()-aux);
    }

    public Bruxa(int idade, int vida, int energia) {
        super.setVida(vida);
        super.setEnergia(energia);
        super.setIdade(idade);
    }
}
