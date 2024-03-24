package Teoria.PCMania;

public class Computador {
    public String marca;
    public float preco;
    HardwareBasico[] hardwareBasicos;
    SistemaOperacional sistemasOperacionais;
    MemoriaUSB memoriaUSB;

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println(hardwareBasicos[0].nome + " (" + hardwareBasicos[0].capacidade + " Mhz)");
        System.out.println(hardwareBasicos[1].capacidade + " Gb de " + hardwareBasicos[1].nome);
        if (hardwareBasicos[2].capacidade > 10) {
            System.out.println(hardwareBasicos[2].capacidade + "GB de " + hardwareBasicos[2].nome);
        } else {
            System.out.println(hardwareBasicos[2].capacidade + "TB de " + hardwareBasicos[2].nome);
        }
        System.out.println("Sistema Operacional " + sistemasOperacionais.nome + "(" + sistemasOperacionais.tipo + " bits)");
        System.out.println("Acompanha " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "Gb");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public Computador(String marca, float preco, String nome, int tipo) {
        this.marca = marca;
        this.preco = preco;
        this.sistemasOperacionais = new SistemaOperacional(nome, tipo);
        this.hardwareBasicos = new HardwareBasico[3];
        this.hardwareBasicos[0] = new HardwareBasico();
        this.hardwareBasicos[1] = new HardwareBasico();
        this.hardwareBasicos[2] = new HardwareBasico();
    }

}
