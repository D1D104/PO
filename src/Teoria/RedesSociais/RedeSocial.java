package Teoria.RedesSociais;

public abstract class RedeSocial {
    protected String Senha;
    protected int numAmigos;
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação");
    }
}