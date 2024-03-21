package Lab.Aula_02;

public class Main {
    public static void main(String[] args) {

        Aluno aluno=new Aluno(1988,60,60,5,"Diego");
        aluno.calculaMedia(aluno.np1, aluno.np2);
        System.out.println(aluno.toString());

        System.out.println("///////////////////////////////////////////////");

        Jogador jogador = new Jogador(2,3,10,10);
        jogador.atacar();
        System.out.println(jogador.toString());

        System.out.println("///////////////////////////////////////////////");

        Gato gato = new Gato("Verde",10,20);
        Rato rato = new Rato(15,false);
        System.out.println(gato.toString());
        System.out.println(rato.toString());
        rato.esconder();
        rato.procurarComida();
        gato.caçar(rato.velocidade, rato.escondido);
    }
}
