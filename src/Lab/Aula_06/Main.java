package Lab.Aula_06;

public class Main {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        Bruxa bruxa = new Bruxa(500,100,50);
        Vampiro vampiro = new Vampiro(100,80,80,10,false);
        Zumbi zumbi = new Zumbi(50,450,20,60);

        monstro.assustar(new Monstro());

        bruxa.aprenderFeitico("Fogin",30);
        bruxa.aprenderFeitico("Gelin",25);
        bruxa.listarFeitico();
        bruxa.esquecerFeitico(0);
        System.out.println();
        bruxa.listarFeitico();
        System.out.println();
        bruxa.lancarFeitico(monstro,1);

    }
}
