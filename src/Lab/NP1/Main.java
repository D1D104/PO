package Lab.NP1;

public class Main {
    public static void main(String[] args) {

        Robo roboTeste = new Robo(50,"Robozinho",60);
        roboTeste.trabalhar();
        System.out.println(roboTeste.getEnergia());
        Robo roboAlvo = new Robo(40,"Bee",50);
        roboTeste.trocarEnergia(roboAlvo);
        System.out.println(roboAlvo.getEnergia());
        roboTeste.regarregar(25);
        System.out.println(roboTeste.getEnergia());

        System.out.println();
        Empilhar empilhador = new Empilhar(8,"Empilhadeira",2,5);
        empilhador.adicionarPacote(2);
        empilhador.adicionarPacote(4);
        empilhador.mostrarPacote();
        empilhador.removerPacote(1);
        empilhador.mostrarPacote();


        System.out.println();
        BracoArticulado braco = new BracoArticulado(10,"Bracinho",20,3,5);
        Camera camera1 = new Camera(5);
        braco.setCamera(camera1);
        braco.trabalhar();
        BracoArticulado braco2 = new BracoArticulado(10,"Bracinho",20,3,5);
        braco2.trabalhar();

    }
}
