package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Funcionario;

public class FuncionarioDAO implements InterfaceDAO<Funcionario> {

    private static FuncionarioDAO instance;
    protected EntityManager entityManager;

    public static FuncionarioDAO getInstance() {
        if (instance == null) {
            instance = new FuncionarioDAO();
        }
        return instance;
    }

    public FuncionarioDAO() {
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
    public void create(Funcionario funcionario) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(funcionario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Funcionario> retrieve() {
        List<Funcionario> listaFuncionarios;
        listaFuncionarios = entityManager.createQuery("Select e From Funcionario e", Funcionario.class).getResultList();
        return listaFuncionarios;
    }

    @Override
    public Funcionario retrieve(int primaryKey) {
        Funcionario funcionario = entityManager.find(Funcionario.class, primaryKey);
        return funcionario;
    }

    @Override
    public Funcionario retrieve(String searchString, String column) {
        if(column == "id"){
        return (Funcionario) entityManager
                .createQuery("Select c From Funcionario c Where c." + column + " = :parString")
                .setParameter("parString", Integer.valueOf(searchString)).getSingleResult();
    }
        return (Funcionario) entityManager
                .createQuery("Select c From Funcionario c Where c." + column + " = :parString")
                .setParameter("parString", searchString).getSingleResult();
    }
    @Override
    public void update(Funcionario funcionario) {
        try {
            entityManager.find(Funcionario.class, funcionario.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(funcionario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Funcionario funcionario) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(funcionario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
