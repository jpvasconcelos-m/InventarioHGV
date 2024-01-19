package model;


import javax.persistence.*;

@Entity
@Table(name = "equipamentos")
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Setor setor;

    private String hostname;
    private int tag;
    private String ip;
    private String marca;
    private String modelo;
    private String serialOuTomb;
    @ManyToOne
    private Fornecedor fornecedor;


    public Equipamento() {
    }

    public Equipamento(Setor setor, String hostname, int tag, String ip, String marca, String modelo, String serialOuTomb, Fornecedor fornecedor) {
        this.setor = setor;

        this.hostname = hostname;
        this.tag = tag;
        this.ip = ip;
        this.marca = marca;
        this.modelo = modelo;
        this.serialOuTomb = serialOuTomb;
        this.fornecedor = fornecedor;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }



    public String getHostname(String s) {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerialOuTomb() {
        return serialOuTomb;
    }

    public void setSerialOuTomb(String serialOuTomb) {
        this.serialOuTomb = serialOuTomb;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
