package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Bairro;

public class BairroDAO implements InterfaceDAO<Bairro> {

    private static BairroDAO instance;
    protected EntityManager entityManager;

    public static BairroDAO getInstance() {
        if (instance == null) {
            instance = new BairroDAO();
        }
        return instance;
    }

    public BairroDAO() {
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
    public void create(Bairro objeto) {
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
    public List<Bairro> retrieve() {
        List<Bairro> listaBairros;
        listaBairros = entityManager.createQuery("Select b From Bairro b", Bairro.class).getResultList();
        return listaBairros;
    }

    @Override
    public Bairro retrieve(int parPK) {
        return entityManager.find(Bairro.class, parPK);
    }

    @Override
    public Bairro retrieve(String parString, String column) {
        String jpql = "SELECT b FROM Bairro b WHERE b." + column + " = :param";
        TypedQuery<Bairro> query = entityManager.createQuery(jpql, Bairro.class);
        query.setParameter("param", parString);
        return query.getSingleResult();
    }

    @Override
    public void update(Bairro objeto) {
        try {
            entityManager.find(Bairro.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Bairro objeto) {
    }

}
