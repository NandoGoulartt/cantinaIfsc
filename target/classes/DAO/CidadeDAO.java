package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cidade;

public class CidadeDAO implements InterfaceDAO<Cidade> {
    private static CidadeDAO instance;
    protected EntityManager entityManager;

    public static CidadeDAO getInstance() {
        if (instance == null) {
            instance = new CidadeDAO();
        }
        return instance;
    }

    public CidadeDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_Cantina");

        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    @Override
    public void create(Cidade objeto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Cidade> retrieve() {
        List<Cidade> listaCidades;
        listaCidades = entityManager.createQuery("Select c From Cidade c", Cidade.class).getResultList();
        return listaCidades;
    }

    @Override
    public Cidade retrieve(int parPK) {
        return entityManager.find(Cidade.class, parPK);
    }

    @Override
    public Cidade retrieve(String parString, String column) {
        if(column == "id"){
        return (Cidade) entityManager.createQuery("Select c From Cidade c Where c." + column + " = :parString")
                .setParameter("parString", Integer.valueOf(parString)).getSingleResult();
    }
        return (Cidade) entityManager.createQuery("Select c From Cidade c Where c." + column + " = :parString")
                .setParameter("parString", parString).getSingleResult();
    }
    
    @Override
    public void update(Cidade objeto) {
        try {
            entityManager.find(Cidade.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Cidade objeto) {
    }
}
