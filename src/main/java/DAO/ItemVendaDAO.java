package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ItemVenda;
import model.Venda;

public class ItemVendaDAO implements InterfaceDAO<ItemVenda> {

    private static ItemVendaDAO instance;
    protected EntityManager entityManager;

    public static ItemVendaDAO getInstance() {
        if (instance == null) {
            instance = new ItemVendaDAO();
        }
        return instance;
    }

    public ItemVendaDAO() {
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
    public void create(ItemVenda itemvenda) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(itemvenda);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<ItemVenda> retrieve() {
        List<ItemVenda> listaItemVendas;
        listaItemVendas = entityManager.createQuery("Select e From ItemVenda e", ItemVenda.class).getResultList();
        return listaItemVendas;
    }

    @Override
    public ItemVenda retrieve(int primaryKey) {
        ItemVenda itemVenda = entityManager.find(ItemVenda.class, primaryKey);
        return itemVenda;
    }

    @Override
    public ItemVenda retrieve(String searchString, String column) {
        if(column == "id"){
            return (ItemVenda) entityManager.createQuery("Select c From ItemVenda c Where c." + column + " = :parString")
                .setParameter("parString", Integer.valueOf(searchString)).getSingleResult();
        }
        return (ItemVenda) entityManager.createQuery("Select c From ItemVenda c Where c." + column + " = :parString")
                .setParameter("parString", searchString).getSingleResult();
    }

    public List<ItemVenda> carregarPorVenda(Venda vendaId) {
        List<ItemVenda> listaItemVendas;
        listaItemVendas = entityManager
                .createQuery("Select e From ItemVenda e Where e.venda = :parVenda", ItemVenda.class)
                .setParameter("parVenda", vendaId).getResultList();
        return listaItemVendas;
    }

    @Override
    public void update(ItemVenda itemvenda) {
        try {
            entityManager.find(ItemVenda.class, itemvenda.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(itemvenda);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(ItemVenda itemvenda) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(itemvenda);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
