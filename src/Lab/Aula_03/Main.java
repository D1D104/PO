package Lab.Aula_03;

public class Main {
    public static void main(String[] args) {
        //exercico do cliente e conta
        Cliente cliente = new Cliente("Diego", "000", 50, 20);
        System.out.println(cliente.toString());
        System.out.println(cliente.sacarDinheiro(10));
        Conta contaReceber = new Conta(10, 10);
        System.out.println(cliente.transferir(contaReceber));
        cliente.depositarDinheiro(20);
        System.out.println(cliente.toString());
        System.out.println(cliente.comprarComCredito(60));
        //exercicio da aula 2 refeito com acesso privado
        Arma nerf = new Arma(10, 2);
        Jogador player = new Jogador(nerf, 20, 100);
        System.out.println(player.toString());
        Jogador alvo = new Jogador();
        player.atacar(alvo);
    }
}
