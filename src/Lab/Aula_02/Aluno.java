package Lab.Aula_02;

import java.util.Scanner;
public class Aluno {
    public int matricula;
    public int np1;
    public int np2;
    public int periodo;
    public String nome;
    Aluno(int matricula, int np1, int np2, int periodo, String nome){
        this.matricula=matricula;
        this.np1=np1;
        this.np2=np2;
        this.periodo=periodo;
        this.nome=nome;
    }
    public void calculaMedia(int np1, int np2){
        int media=(np1+np2)/2;
        System.out.println("Média: "+media);
        if(media>=60){
            System.out.println("Aprovado ");
        }
        else{
            System.out.println("Informe a nota da np3");
            calcularNP3(media);
        }
    }
    public void calcularNP3(int media1){
        Scanner entrada=new Scanner(System.in);
        int notaNP3=entrada.nextInt();
        if ((notaNP3+media1)/2>=50){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
    public String toString(){
        return  "Matricula: "+
                this.matricula + " NP1: " +
                this.np1 + " NP2: "+
                this.np2 + " Periodo: "+
                this.periodo + " Nome: "+ this.nome;
    }
}