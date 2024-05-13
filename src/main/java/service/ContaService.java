/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import DAO.ContaDAO;
import model.Contas;

/**
 *
 * @author luizf
 */
public class ContaService {
    public static void adicionar(Contas objeto) {
            ContaDAO.getInstance().create(objeto);
        }
        
        public static List<Contas> carregar(){
            return ContaDAO.getInstance().retrieve();
        }
        
        public static Contas carregar(int parPK) {
            return ContaDAO.getInstance().retrieve(parPK);
        }
        public static void atualizar(Contas objeto){
            ContaDAO.getInstance().update(objeto);
        }
        
        public static void remover(Contas objeto){
            ContaDAO.getInstance().delete(objeto);
        }
}
