
package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Caixa;
import DAO.InterfaceDAO;

public class CaixaDAO implements InterfaceDAO<Caixa>{
    private static CaixaDAO instance;
    protected EntityManager entityManager;
    
    public static CaixaDAO getInstance(){
        if(instance==null){
            instance = new CaixaDAO();
        }
        return instance;
    }
    
    public CaixaDAO(){
        entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_Cantina");
        
        if(entityManager == null){
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
    
    @Override
    public void create(Caixa objeto) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
       }
    }

    @Override
    public List<Caixa> retrieve() {
        List<Caixa> listaBairros;
        listaBairros = entityManager.createQuery("Select b From Caixa b",Caixa.class).getResultList();
        return listaBairros;
    }

    @Override
    public Caixa retrieve(int parPK) {
        return entityManager.find(Caixa.class, parPK);
    }

    
    public List<Caixa> retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Caixa objeto) {
        try {
             Caixa bairro = entityManager.find(Caixa.class, objeto.getId());
             entityManager.getTransaction().begin();
             entityManager.merge(objeto);
             entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Caixa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Caixa retrieve(String parString, String column) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
