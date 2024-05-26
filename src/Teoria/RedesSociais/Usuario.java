package Teoria.RedesSociais;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String Nome;
    private String email;
    private Set<RedeSocial> redeSocialSet;
    public Usuario(RedeSocial[] redeSocials){
        this.redeSocialSet = new HashSet<>();
        Collections.addAll(this.redeSocialSet,redeSocials);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedeSocialSet() {
        return this.redeSocialSet.toArray(new RedeSocial[0]);
    }
}
