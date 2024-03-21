package Lab.Aula_02;

public class Rato {
    public float velocidade;
    public boolean escondido;
    public Rato(int velocidade, boolean escondido){
        this.velocidade = velocidade;
        this.escondido = escondido;
    }
    public String toString(){
        return "Velocidade: " +
                this.velocidade + " Escondido: " +
                this.escondido;
    }
    public void esconder(){
        this.escondido=true;
    }
    public void procurarComida(){
        this.escondido=false;
    }
}
