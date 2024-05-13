/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import DAO.MovimentoEstoqueDAO;
import model.MovimentacaoEstoque;

public class MovimentaEstoqueService {
    public static void adicionar(MovimentacaoEstoque objeto) {
            MovimentoEstoqueDAO.getInstance().create(objeto);
        }
        
        public static List<MovimentacaoEstoque> carregar(){
            return MovimentoEstoqueDAO.getInstance().retrieve();
        }
        
        public static MovimentacaoEstoque carregar(int parPK) {
            return MovimentoEstoqueDAO.getInstance().retrieve(parPK);
        }
        public static void atualizar(MovimentacaoEstoque objeto){
            MovimentoEstoqueDAO.getInstance().update(objeto);
        }
        
        public static void remover(MovimentacaoEstoque objeto){
            MovimentoEstoqueDAO.getInstance().delete(objeto);
        }
}
