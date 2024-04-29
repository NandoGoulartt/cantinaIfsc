package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Carteirinha;

public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {
    private static CarteirinhaDAO instance;
    protected EntityManager entityManager;

    public static CarteirinhaDAO getInstance() {
        if (instance == null) {
            instance = new CarteirinhaDAO();
        }
        return instance;
    }

    public CarteirinhaDAO() {
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
    public void create(Carteirinha objeto) {
        Carteirinha carteirinha = new Carteirinha();
        carteirinha.setCodBarra(objeto.getCodBarra());
        carteirinha.setDataGeracao(objeto.getDataGeracao());
        carteirinha.setIdcliente(objeto.getIdcliente());
        carteirinha.setDataCancelamento(null);

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(carteirinha);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Carteirinha> retrieve() {
        List<Carteirinha> listaCarteirinhas;
        listaCarteirinhas = entityManager.createQuery("Select b From Carteirinha b", Carteirinha.class).getResultList();
        return listaCarteirinhas;
    }

    @Override
    public Carteirinha retrieve(int parPK) {
        return entityManager.find(Carteirinha.class, parPK);
    }

    @Override
    public Carteirinha retrieve(String parString, String column) {
        String jpql = "SELECT b FROM Carteirinha b WHERE b." + column + " = :param";
        TypedQuery<Carteirinha> query = entityManager.createQuery(jpql, Carteirinha.class);
        query.setParameter("param", parString);
        return query.getSingleResult();
    }

    @Override
    public void update(Carteirinha objeto) {
        Carteirinha carteirinha = new Carteirinha();
        carteirinha.setCodBarra(objeto.getCodBarra());
        carteirinha.setDataGeracao(objeto.getDataGeracao());
        carteirinha.setIdcliente(objeto.getIdcliente());
        carteirinha.setDataCancelamento(null);
        carteirinha.setId(objeto.getId());

        try {
            entityManager.find(Carteirinha.class, carteirinha.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(carteirinha);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Carteirinha objeto) {
    }

}
