package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO <E>{
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> thing;

    static{
        try{
            emf = Persistence
                    .createEntityManagerFactory("InventarioHGV");
        }catch (Exception e){
            //Log in -> log4j
        }
    }

    public DAO(){
        this(null);
    }
    public DAO(Class<E> thing){
        this.thing = thing;
        em = emf.createEntityManager();
    }

    public DAO<E> openTransaction(){
        em.getTransaction().begin();
        return this;
    }
    public DAO<E> closeTransaction(){
        em.getTransaction().commit();
        return this;
    }
    public DAO<E> include(E entity){
        em.persist(entity);
        return this;
    }
    public DAO<E> atomicInclude(E entity){
        return this.openTransaction().include(entity).closeTransaction();
    }

    public E obtainById(Object id){
        return em.find(thing,id);
    }
    public List<E> obtainAll(){
        return this.obtainAll(10,0);
    }
    public List<E> obtainAll(int amt, int delta){
        if(thing == null){
            throw new UnsupportedOperationException("Null Class.");
        }
        String jpql = "select e from " + thing.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, thing);
        query.setMaxResults(amt);
        query.setFirstResult(delta);
        return query.getResultList();
    }
    public List<E> query (String queryName, Object... params){
        TypedQuery<E> query = em.createNamedQuery(queryName,thing);

        for(int i = 0; i< params.length; i+=2){
            query.setParameter(params[i].toString(), params[i+1]);
        }
        return query.getResultList();
    }
    public E queryFirst(String queryName, Object... params){
        List<E> list = query(queryName, params);
        return list.isEmpty() ? null : list.get(0);

    }

    public List<E> standardQuery(String queryString){
        List<E> list = em.createQuery(queryString).getResultList();
        return list;

    }
    public void close(){
        em.close();
    }

}

