package Lab.Aula_03;

public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}