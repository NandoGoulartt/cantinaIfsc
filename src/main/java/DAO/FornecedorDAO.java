package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Fornecedor;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    private static FornecedorDAO instance;
    protected EntityManager entityManager;

    public static FornecedorDAO getInstance() {
        if (instance == null) {
            instance = new FornecedorDAO();
        }
        return instance;
    }

    public FornecedorDAO() {
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
    public void create(Fornecedor fornecedor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(fornecedor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Fornecedor> retrieve() {
        List<Fornecedor> listaFornecedors;
        listaFornecedors = entityManager.createQuery("Select e From Fornecedor e", Fornecedor.class).getResultList();
        return listaFornecedors;
    }

    @Override
    public Fornecedor retrieve(int primaryKey) {
        Fornecedor fornecedor = entityManager.find(Fornecedor.class, primaryKey);
        return fornecedor;
    }

    @Override
    public Fornecedor retrieve(String searchString, String column) {
        return (Fornecedor) entityManager.createQuery("Select c From Fornecedor c Where c." + column + " = :parString")
                .setParameter("parString", searchString).getSingleResult();
    }

    @Override
    public void update(Fornecedor fornecedor) {
        try {
            entityManager.find(Fornecedor.class, fornecedor.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(fornecedor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Fornecedor fornecedor) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(fornecedor);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
