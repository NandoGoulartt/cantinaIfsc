
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import DAO.InterfaceDAO;
import model.MovimentacaoEstoque;

/**
 *
 * @author luizf
 */
public class MovimentoEstoqueDAO implements InterfaceDAO<MovimentacaoEstoque>{
    private static MovimentoEstoqueDAO instance;
    protected EntityManager entityManager;
    
     public static MovimentoEstoqueDAO getInstance(){
        if(instance==null){
            instance = new MovimentoEstoqueDAO();
        }
        return instance;
    }
    
    public MovimentoEstoqueDAO(){
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
    public void create(MovimentacaoEstoque objeto) {
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
    public List<MovimentacaoEstoque> retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MovimentacaoEstoque retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public List<MovimentacaoEstoque> retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MovimentacaoEstoque objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(MovimentacaoEstoque objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MovimentacaoEstoque retrieve(String parString, String column) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
