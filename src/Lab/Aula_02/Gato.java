package Lab.Aula_02;

public class Gato {
    public String cor;
    public int idade;
    public int velocidade;
    public Gato(String cor, int idade, int velocidade){
        this.cor = cor;
        this.idade = idade;
        this.velocidade = velocidade;
    }
    public String toString(){
        return "Cor: " +
                this.cor + " Idade: " +
                this.idade + " Velocidade: " +
                this.velocidade;
    }
    public void brincar(){}
    public void caçar(float velocidadeRato, boolean escondido1){
        if(velocidade>velocidadeRato && escondido1==false){
            System.out.println("Caça bem sucessida");
        }
        else{
            System.out.println("Falha na caça");
        }
    }
}
