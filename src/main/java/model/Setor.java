package model;

import javax.persistence.Embeddable;


public class Setor {
    private String nome;
    private int andar;
    private int ramal;

    public Setor(String nome, int andar, int ramal) {
        this.nome = nome;
        this.andar = andar;
        this.ramal = ramal;
    }

    public Setor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
