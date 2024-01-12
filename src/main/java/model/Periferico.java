package model;

public class Periferico {

     String tipoPeriferico;
     String marca;
    private String modelo;
    private int Serial;
    private int tombamento;
    private String ip;
    private int tag;

    // Criação do Construtor para teste dos metodos na classe Perifericos
    Periferico(String tipoPeriferico, String marca ){
        this.tipoPeriferico = tipoPeriferico;
        this.marca = marca;

    }

    // Metodo para desconsiderar o uso da TAG
    // Objeto do tipo monitor não recebve TAG
    void seMonitor() {
        if (tipoPeriferico.equals("MONITOR") ) {
            tag = Integer.parseInt(null);

             }
         }
   }


