package Lab.Aula_05;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(4000,"Mac","M2","500");
        Console console = new Console(2000,"PS4","Quarta","Sony");
        notebook.mostrarInfo();
        console.mostrarInfo();
    }
}
