package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Produto;

public class ProdutoDAO implements InterfaceDAO<Produto> {

    private static ProdutoDAO instance;
    protected EntityManager entityManager;

    public static ProdutoDAO getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        return instance;
    }

    public ProdutoDAO() {
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
    public void create(Produto produto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(produto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Produto> retrieve() {
        List<Produto> listaProdutos;
        listaProdutos = entityManager.createQuery("Select e From Produto e", Produto.class).getResultList();
        return listaProdutos;
    }

    @Override
    public Produto retrieve(int primaryKey) {
        Produto produto = entityManager.find(Produto.class, primaryKey);
        return produto;
    }

    @Override
    public Produto retrieve(String searchString, String column) {
        if(column == "id"){
            return (Produto) entityManager.createQuery("Select c From Produto c Where c." + column + " = :parString")
                .setParameter("parString", Integer.valueOf(searchString)).getSingleResult();
        }
        return (Produto) entityManager.createQuery("Select c From Produto c Where c." + column + " = :parString")
                .setParameter("parString", searchString).getSingleResult();
    }

    @Override
    public void update(Produto produto) {
        try {
            entityManager.find(Produto.class, produto.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(produto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Produto produto) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(produto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
