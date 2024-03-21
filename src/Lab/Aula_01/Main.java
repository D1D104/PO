package Lab.Aula_01;

public class Main {
    public static void main(String[] args) {
        int num=7;
        System.out.println(fatorial(num));
        mostraPares(num);
    }
    public static int fatorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void mostraPares(int n){
        for(int i=n;i>0;i--){
            if(n%2==0){
                System.out.println(n);
            }
            n--;
        }
    }
}
