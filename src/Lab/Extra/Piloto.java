package Lab.Extra;

public class Piloto {
    private final String nome;
    private final int idade;
    private final String nacionalidade;
    private static int idGeral = 1;
    private final int id;

    public void correr(Carro carro) {
        System.out.println("Piloto correndo no " + carro);
    }

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        id = idGeral;
        idGeral++;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", id=" + id +
                '}';
    }
}
