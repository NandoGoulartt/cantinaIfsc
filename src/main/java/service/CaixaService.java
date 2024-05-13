/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import DAO.CaixaDAO;
import model.Caixa;

public class CaixaService {
    public static void adicionar(Caixa objeto) {
            CaixaDAO.getInstance().create(objeto);
        }
        
        public static List<Caixa> carregar(){
            return CaixaDAO.getInstance().retrieve();
        }
        
        public static Caixa carregar(int parPK) {
            return CaixaDAO.getInstance().retrieve(parPK);
        }
        public static void atualizar(Caixa objeto){
            CaixaDAO.getInstance().update(objeto);
        }
        
        public static void remover(Caixa objeto){
            CaixaDAO.getInstance().delete(objeto);
        }
}
