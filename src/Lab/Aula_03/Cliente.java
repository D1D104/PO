package Lab.Aula_03;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;
    public boolean sacarDinheiro(double valor){
        if(conta.getSaldo()>=valor)
            return true;
        else
            return false;
    }
    public void depositarDinheiro(double valor){
        conta.setSaldo(conta.getSaldo()+valor);
    }
    public boolean comprarComCredito(double valor){
        if(valor <= conta.getSaldo() && valor <=conta.getLimite())
            return true;
        else
            return false;
    }
    public boolean transferir(Conta contaParaReceber){
        if(conta.getSaldo()>0) //sem tranferencia pq esta sem valor de troca
            return true;
        else
            return false;
    }
    public Cliente(String nome, String cpf, double saldo,double limite) {
        this.nome = nome;
        this.cpf = cpf;
        conta = new Conta(saldo,limite);
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo='" + conta.getSaldo() + '\'' +
                ", limie=" + conta.getLimite() +
                '}';
    }
}