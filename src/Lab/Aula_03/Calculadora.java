package Lab.Aula_03;


public class Calculadora {
    private static float pi= 3.14F;
    public static float getPi() {
        return pi;
    }
    public static double getCircunferencia(double raio){
        return raio*2*pi;
    }
    public static double volumeEsfera(double raio){
        return 4/3*pi*raio*raio*raio;
    }
    public static double volumeCilindrio(double raio, double h){
        return pi*raio*raio*h;
    }
}