package Lab.Aula_02;

public class Jogador {
    public Arma arma=new Arma();
    public int energia;
    public int vida;
    Jogador(int custoDeEnergia, int dano, int energia, int vida){
        this.arma.custoDeEnergia = custoDeEnergia;
        this.arma.dano = dano;
        this.energia = energia;
        this.vida = vida;
    }
    public void atacar(){
        if(energia<=0){
            System.out.println("Não pode atacar, sem energia");
        }
        else{
            vida -= arma.dano;
            energia -= arma.custoDeEnergia;
        }
    }
    public String toString(){
        return "Vida: " +
                this.vida + " Energia: " +
                this.energia + " Dano arma: " +
                this.arma.dano + " Custo de energia: " +
                this.arma.custoDeEnergia;
    }
}
