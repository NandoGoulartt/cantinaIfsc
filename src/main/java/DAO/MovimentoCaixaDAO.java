/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import DAO.InterfaceDAO;
import model.MovimentoCaixa;

/**
 *
 * @author luizf
 */
public class MovimentoCaixaDAO implements InterfaceDAO<MovimentoCaixa>{

    private static MovimentoCaixaDAO instance;
    protected EntityManager entityManager;
    
     public static MovimentoCaixaDAO getInstance(){
        if(instance==null){
            instance = new MovimentoCaixaDAO();
        }
        return instance;
    }
    
    public MovimentoCaixaDAO(){
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
    public void create(MovimentoCaixa objeto) {
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
    public List<MovimentoCaixa> retrieve() {
        List<MovimentoCaixa> listaItemVendas;
        listaItemVendas = entityManager.createQuery("Select i From MovimentoCaixa i",MovimentoCaixa.class).getResultList();
        return listaItemVendas;
    }

    @Override
    public MovimentoCaixa retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public List<MovimentoCaixa> retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MovimentoCaixa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(MovimentoCaixa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MovimentoCaixa retrieve(String parString, String column) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
