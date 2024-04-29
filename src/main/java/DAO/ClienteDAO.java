package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class ClienteDAO implements InterfaceDAO<Cliente> {
    private static ClienteDAO instance;
    protected EntityManager entityManager;

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

    public ClienteDAO() {
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
    public void create(Cliente cliente) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Cliente> retrieve() {
        List<Cliente> listaClientes;
        listaClientes = entityManager.createQuery("Select c From Cliente c", Cliente.class).getResultList();
        return listaClientes;
    }

    @Override
    public Cliente retrieve(int primaryKey) {
        return entityManager.find(Cliente.class, primaryKey);
    }

    @Override
    public Cliente retrieve(String searchString, String column) {
        return (Cliente) entityManager.createQuery("Select c From Cliente c Where c." + column + " = :parString")
                .setParameter("parString", searchString).getSingleResult();
    }

    @Override
    public void update(Cliente cliente) {
        try {
            entityManager.find(Cliente.class, cliente.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Cliente cliente) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
