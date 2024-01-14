package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Fornecedor {
    public static List<Fornecedor> fornecedores = new HashSet<>();
    public List<Equipamento> equipamentos = new ArrayList<>();
   private String nome;
   private String email;
   private int telefone;

   public static void adicionarFornecedor(Fornecedor fornecedor){
       fornecedores.add(fornecedor);
   }

    public Fornecedor() {

    }

    public Fornecedor(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fornecedor that = (Fornecedor) o;

        if (telefone != that.telefone) return false;
        if (!nome.equals(that.nome)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + telefone;
        return result;
    }
}
