package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Venda;

public class VendaDAO implements InterfaceDAO<Venda> {

    private static VendaDAO instance;
    protected EntityManager entityManager;

    public static VendaDAO getInstance() {
        if (instance == null) {
            instance = new VendaDAO();
        }
        return instance;
    }

    public VendaDAO() {
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
    public void create(Venda venda) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(venda);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Venda> retrieve() {
        List<Venda> listaVendas;
        listaVendas = entityManager.createQuery("Select e From Venda e", Venda.class).getResultList();
        return listaVendas;
    }

    @Override
    public Venda retrieve(int primaryKey) {
        Venda venda = entityManager.find(Venda.class, primaryKey);
        return venda;
    }

    @Override
    public Venda retrieve(String searchString, String column) {
        return (Venda) entityManager.createQuery("Select c From Venda c Where c." + column + " = :parString")
                .setParameter("parString", searchString).getSingleResult();
    }

    @Override
    public void update(Venda venda) {
        try {
            entityManager.find(Venda.class, venda.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(venda);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Venda venda) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(venda);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
