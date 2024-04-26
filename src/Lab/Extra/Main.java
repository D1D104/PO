package Lab.Extra;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Dieg0", 20, "Brasileiro");
        Piloto piloto2 = new Piloto("Edu", 20, "Brasileiro");

        Equipe equipe1 = new Equipe("Ferrari");
        equipe1.adicionarPiloto(piloto1);
        equipe1.adicionarPiloto(piloto2);
        equipe1.constroiCarro(2,20,true);
        equipe1.pitStop(3,0);
        equipe1.retirarPiloto(1);

        piloto1.correr(equipe1.getCarro());
        equipe1.getCarro().correr();

        System.out.println(equipe1.getCarro().getMotor());
        System.out.println(equipe1.getCarro());
        System.out.println(equipe1);
    }
}
