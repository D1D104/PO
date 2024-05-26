package Teoria.RedesSociais;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{


    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Fez um comentário no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma vídeo conferência no GooglePlus");
    }
    public void curtirPublicacao(){
        super.curtirPublicacao();
    }
}
