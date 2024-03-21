package Lab.Aula_04;

public class Banda {
    private Musica[] musicas = new Musica[20];
    private String nome;
    private int numeroDeIntegrantes;
    public void tocarMusica(int posicao){
        System.out.println(musicas[posicao].getNome());
    }
    public void tocarShow(){
        for(Musica musica: musicas){
            if(musica!=null){
                System.out.println(musica.getNome());
            }
        }
    }
    public boolean adicionarMusica(Musica musica){
        boolean aux= false;
        for(int i=0;i< musicas.length;i++){
            if(musicas[i]==null){
                musicas[i]= musica;
                aux=true;
                break;
            }
        }
        return aux;
    }
    public boolean deletarMusica(String nome){
        boolean aux= false;
        for(int i=0;i< musicas.length;i++){
            if(musicas[i].getNome() == nome){
                musicas[i] = null;
                aux=true;
            }
        }
        return aux;
    }
    public Banda(String nome, int numeroDeIntegrantes){
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
