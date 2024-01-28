package model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "perifericos")

public class Periferico {

    @Id
    @GeneratedValue
    private Long id;
     String tipoPeriferico;
     String marca;
    private String modelo;
    private int serial;
    private int tombamento;
    private String ip;
    private int tag;


   Periferico(){

   }

    // Criação do Construtor para teste dos metodos na classe Perifericos
    Periferico(String tipoPeriferico, String marca, String modelo, int serial, int tombamento, String ip, int tag  ){
        this.tipoPeriferico = tipoPeriferico;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.tombamento = tombamento;
        this.ip = ip;
        this.tag = tag;
    }

    public String getModelo(){
       return modelo;
    }

    public String setMOdelo (String modelo){
       return this.modelo =modelo;
    }

    // Metodo para desconsiderar o uso da TAG
    // Objeto do tipo monitor não recebve TAG

    void seMonitor() {
        if (tipoPeriferico.equals("MONITOR") ) {
            tag = Integer.parseInt(null);

             }
         }

   }


