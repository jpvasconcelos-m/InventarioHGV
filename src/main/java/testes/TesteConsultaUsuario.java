package testes;

import infra.DAO;
import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TesteConsultaUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioHGV");
        EntityManager em = emf.createEntityManager();
        DAO<Usuario> usuarioDAO = new DAO<>(Usuario.class);

        System.out.println(em.createQuery("SELECT u FROM usuarios u").getResultList().get(0).toString());
        System.out.println(em.createQuery("SELECT u FROM usuarios u WHERE nome = 'Pedro Alvares de Cabral'").getResultList().get(0).toString());
        System.out.println(usuarioDAO.standardQuery("SELECT u FROM usuarios u WHERE nome = 'Pedro Alvares de Cabral'"));





    }
}
