package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Fornecedor {
    static public HashSet<Fornecedor> fornecedores = new HashSet<>();
   private String nome;
   private String email;
   private int telefone;


    public Fornecedor() {
        fornecedores.add(this);
    }

    public Fornecedor(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        fornecedores.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
