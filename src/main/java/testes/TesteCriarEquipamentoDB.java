package testes;

import infra.DAO;
import model.Equipamento;
import model.Fornecedor;
import model.Setor;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriarEquipamentoDB {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioHGV");
    static EntityManager em = emf.createEntityManager();
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("INFORP","INFORP@INFORP.COM",40028922);
        Setor setor = new Setor("EMERG",3,40028922);
        Equipamento eqp = new Equipamento(
                null,"GVCOMPUT",123456,"172.16.1.1","LENOVO","TOP","GVLOC1234",fornecedor);
        setor.adicionarEquipamento(eqp);

       DAO<Object> dao = new DAO<>();

       dao.openTransaction();
       dao.include(fornecedor);
       dao.include(setor.getEquipamentos().get(0));
       dao.include(eqp);
       dao.closeTransaction();
       dao.close();





}

}

