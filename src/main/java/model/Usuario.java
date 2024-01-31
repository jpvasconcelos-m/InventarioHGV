package model;

import javax.persistence.*;

@Entity(name = "usuarios")
@Table(schema = "inventario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String hashSenha;
    private String salt;

    private String nome;
    private boolean isAdmin;

    static private HashSenhas hs = new HashSenhas();





    public Usuario() {
        this.salt = hs.generateSalt();
    }

    public Usuario(String login, String hashSenha, String salt, String nome, boolean isAdmin) {
        this.login = login;
        this.hashSenha = hashSenha;
        this.salt = salt;
        this.nome = nome;
        this.isAdmin = isAdmin;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashSenha() {
        return hashSenha;
    }

    public void setHashSenha(String hashSenha) {
        this.hashSenha = hashSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", hashSenha='" + hashSenha + '\'' +
                ", salt='" + salt + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
