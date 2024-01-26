package model;

import javax.persistence.Entity;

@Entity(name = "usuarios")
public class Usuario {
    private String nomeUsuario;
    private String hashSenha;

    private String nome;
    private String senha;


}
