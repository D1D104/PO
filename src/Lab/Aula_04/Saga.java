package Lab.Aula_04;

public class Saga {
    private int nota;
    private Livro[] livros = new Livro[30];

    public int getNota() {
        return nota;
    }
    public Livro[] getLivros() {
        return livros;
    }

    public void listarLivros(){
        for(Livro livro:livros){
            if(livro!=null) {
                System.out.println(livro.getTitulo());
            }
        }
    }
    public void adicionarLivro(Livro livro){
        for(int i=0;i<livros.length;i++){
            if(livros[i]==null){
                livros[i] = livro;
                break;
            }
        }
    }
}
