package Teoria.RedesSociais;

import Teoria.RedesSociais.Excecoes.NoVer;

public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        GooglePlus googlePlus = new GooglePlus();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();

        facebook.Senha = "1111";
        facebook.numAmigos = 10;
        googlePlus.Senha = "2222";
        googlePlus.numAmigos = 20;
        twitter.Senha = "3333";
        twitter.numAmigos = 30;
        instagram.Senha = "4444";
        instagram.numAmigos = 40;

        RedeSocial[] redeSocials = new RedeSocial[2];
        redeSocials[0] = facebook;
        redeSocials[1] = googlePlus;

        RedeSocial[] redeSocials1 = new RedeSocial[2];
        redeSocials1[0] = twitter;
        redeSocials1[1] = instagram;

        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = new Usuario(redeSocials);
        usuarios[1] = new Usuario(redeSocials1);
        usuarios[0].setNome("Diego");
        usuarios[1].setNome("Luan");
        usuarios[0].setEmail("diego@gmail.com");
        usuarios[1].setEmail("luan@gmail.com");

        try {
            System.out.print(usuarios[0].getNome()+" ");
            usuarios[0].getRedeSocialSet()[0].postarComentario();
            System.out.print(usuarios[0].getNome()+" ");
            usuarios[0].getRedeSocialSet()[0].curtirPublicacao();
            System.out.print(usuarios[0].getNome()+" ");
            usuarios[0].getRedeSocialSet()[1].postarVideo();
            System.out.print(usuarios[0].getNome()+" ");
            usuarios[0].getRedeSocialSet()[1].postarComentario();

            System.out.print(usuarios[1].getNome()+" ");
            usuarios[1].getRedeSocialSet()[0].postarFoto();
            System.out.print(usuarios[1].getNome()+" ");
            usuarios[1].getRedeSocialSet()[0].curtirPublicacao();
            System.out.print(usuarios[1].getNome()+" ");
            usuarios[1].getRedeSocialSet()[1].postarVideo();
            System.out.print(usuarios[1].getNome()+" ");
            usuarios[1].getRedeSocialSet()[1].curtirPublicacao();

        } catch (NoVer i) {
            System.out.println("Erro: " + i);
        }
    }
}
