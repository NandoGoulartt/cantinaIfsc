package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Endereco;

public class EnderecoDAO implements InterfaceDAO<Endereco> {

    private static EnderecoDAO instance;
    protected EntityManager entityManager;

    public static EnderecoDAO getInstance() {
        if (instance == null) {
            instance = new EnderecoDAO();
        }
        return instance;
    }

    public EnderecoDAO() {
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
    public void create(Endereco endereco) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(endereco);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Endereco> retrieve() {
        List<Endereco> listaEnderecos;
        listaEnderecos = entityManager.createQuery("Select e From Endereco e", Endereco.class).getResultList();
        return listaEnderecos;
    }

    @Override
    public Endereco retrieve(int primaryKey) {
        Endereco endereco = entityManager.find(Endereco.class, primaryKey);
        return endereco;
    }

    @Override
    public Endereco retrieve(String searchString, String column) {
        String jpql = "SELECT b FROM Endereco b WHERE b." + column + " = :param";
        TypedQuery<Endereco> query = entityManager.createQuery(jpql, Endereco.class);
        query.setParameter("param", searchString);
        return query.getSingleResult();
    }

    @Override
    public void update(Endereco objeto) {
        try {
            entityManager.find(Endereco.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Endereco endereco) {
        try {
            entityManager.getTransaction().begin();
            endereco = entityManager.find(Endereco.class, endereco.getId());
            entityManager.remove(endereco);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
