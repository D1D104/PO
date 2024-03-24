package Teoria.PCMania;

public class Cliente {
    public String nome;
    public long cpf;
    Computador[] compras;

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador compra : compras) {
            if (compra != null) {
                total += compra.preco;
            }
        }
        return total;
    }

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
