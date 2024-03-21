package Lab.Aula_04;

public class Main {
    public static void main(String[] args) {
        //Exercicio 1
        Autor autor_1 = new Autor();
        autor_1.setNome("Eduardo");
        Livro livro_1 = new Livro("Pedra Filosofal",520);
        Saga Harry_Potter = new Saga();
        autor_1.adionarSaga(Harry_Potter);
        Harry_Potter.adicionarLivro(livro_1);
        autor_1.listarSagas();
        Harry_Potter.listarLivros();
        ///////////////
        // Exercicio 2
        Banda banda = new Banda("ColdPlay",5);
        Musica musica_1 = new Musica();
        musica_1.setNome("Yellow");
        musica_1.setAlbum("Album 1");
        Musica musica_2 = new Musica();
        musica_2.setNome("teste");

       banda.adicionarMusica(musica_1);
       banda.adicionarMusica(musica_2);

        banda.tocarMusica(2);
        banda.tocarShow();
        banda.deletarMusica("teste");
        banda.tocarShow();
    }
}
