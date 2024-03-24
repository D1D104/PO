package Teoria.PCMania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Computador[] computadores = new Computador[3];

        computadores[0] = new Computador("Positivo", 3300, "Linux Ubuntu", 32);
        computadores[0].hardwareBasicos[0].nome = "Pentium Core i3";
        computadores[0].hardwareBasicos[0].capacidade = 2200;
        computadores[0].hardwareBasicos[1].nome = "Memória RAM";
        computadores[0].hardwareBasicos[1].capacidade = 8;
        computadores[0].hardwareBasicos[2].nome = "HD";
        computadores[0].hardwareBasicos[2].capacidade = 500;
        MemoriaUSB memoria0 = new MemoriaUSB("Pen-drive", 16);
        computadores[0].addMemoriaUSB(memoria0);

        computadores[1] = new Computador("Acer", 8800, "Windows 8", 64);
        computadores[1].hardwareBasicos[0].nome = "Pentium Core i5";
        computadores[1].hardwareBasicos[0].capacidade = 3370;
        computadores[1].hardwareBasicos[1].nome = "Memória RAM";
        computadores[1].hardwareBasicos[1].capacidade = 16;
        computadores[1].hardwareBasicos[2].nome = "HD";
        computadores[1].hardwareBasicos[2].capacidade = 1;
        MemoriaUSB memoria1 = new MemoriaUSB("Pen-drive", 32);
        computadores[1].addMemoriaUSB(memoria1);


        computadores[2] = new Computador("Vaio", 4800, "Windows 10", 64);
        computadores[2].hardwareBasicos[0].nome = "Pentium Core i7";
        computadores[2].hardwareBasicos[0].capacidade = 4500;
        computadores[2].hardwareBasicos[1].nome = "Memória RAM";
        computadores[2].hardwareBasicos[1].capacidade = 32;
        computadores[2].hardwareBasicos[2].nome = "HD";
        computadores[2].hardwareBasicos[2].capacidade = 2;
        MemoriaUSB memoria2 = new MemoriaUSB("Pen-drive", 1);
        computadores[2].addMemoriaUSB(memoria2);

        Cliente cliente = new Cliente("Diego", 12345678);
        cliente.compras = new Computador[10];


        System.out.println("PCMania");
        System.out.println();
        System.out.println("Promoções da loja ");
        System.out.println();
        System.out.println("Promoção 1:");
        computadores[0].mostraPCConfigs();
        System.out.println();
        System.out.println("Promoção 2:");
        computadores[1].mostraPCConfigs();
        System.out.println();
        System.out.println("Promoção 3:");
        computadores[2].mostraPCConfigs();
        System.out.println();

        int opcao;
        int auxCompras = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o número da promoção para adionar ao carrinho ou '0' para finalizar");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cliente.compras[auxCompras] = computadores[0];
                    auxCompras++;
                    break;
                case 2:
                    cliente.compras[auxCompras] = computadores[1];
                    auxCompras++;
                    break;
                case 3:
                    cliente.compras[auxCompras] = computadores[2];
                    auxCompras++;
                    break;
                case 0:
                    System.out.println("Compra concluída");
                    System.out.println("Cliente: " + cliente.nome);
                    System.out.println("CPF: " + cliente.cpf);
                    System.out.println();
                    for (int i = 0; i < auxCompras; i++) {
                        if (cliente.compras[i] != null) {
                            cliente.compras[i].mostraPCConfigs();
                            System.out.println();
                        }
                    }
                    System.out.println("Total da compra foi de "+ cliente.calculaTotalCompra());
                    break;
                default:
                    System.out.println("Opção inválida, por favor insira um número entre 0-3");
                    break;
            }
        } while (opcao != 0);
    }
}
