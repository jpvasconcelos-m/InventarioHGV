package testes;

import infra.DAO;
import model.Equipamento;
import model.Fornecedor;
import model.Setor;

public class TesteCriarEquipamentoDB {
    public static void main(String[] args) {
        DAO<Equipamento> eqpDAO = new DAO<>(Equipamento.class);
        Fornecedor fornecedor = new Fornecedor("INFORP","INFORP@INFORP.COM",40028922);
        Setor setor = new Setor("EMERG",3,40028922);

        Equipamento eqp = new Equipamento(
                setor,"GVCOMPUT",123456,"172.16.1.1","LENOVO","TOP","GVLOC1234",fornecedor);


     eqpDAO.openTransaction();
     eqpDAO.include(eqp);
     eqpDAO.closeTransaction();
    }

}
