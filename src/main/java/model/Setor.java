package model;

import org.hibernate.loader.plan.build.internal.spaces.EntityQuerySpaceImpl;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "setores")
public class Setor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany
    private List<Equipamento> equipamentos = new ArrayList<>();
    private String nome;
    private int andar;
    private int ramal;

    public Setor(String nome, int andar, int ramal) {
        this.nome = nome;
        this.andar = andar;
        this.ramal = ramal;
    }

    public String toString(){
        return  getNome() + getAndar()  + getRamal();

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
        equipamento.setSetor(this);
    }
}

