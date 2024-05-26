package Teoria.RedesSociais;

public class Instagram extends RedeSocial{
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Instagram");
    }
    public void curtirPublicacao(){
        super.curtirPublicacao();
    }
}
