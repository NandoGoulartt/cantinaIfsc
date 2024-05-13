
package service;

import java.util.List;
import DAO.ItemVendaDAO;
import DAO.MovimentoCaixaDAO;
import model.ItemVenda;
import model.MovimentoCaixa;

/**
 *
 * @author luizf
 */
public class MovimentoCaixaService {
    public static void adicionar(MovimentoCaixa objeto) {
            MovimentoCaixaDAO.getInstance().create(objeto);
        }
        
        public static List<MovimentoCaixa> carregar(){
            return MovimentoCaixaDAO.getInstance().retrieve();
        }
        
        public static MovimentoCaixa carregar(int parPK) {
            return MovimentoCaixaDAO.getInstance().retrieve(parPK);
        }
        
        public static List<MovimentoCaixa> carregar(String parString) {
            return MovimentoCaixaDAO.getInstance().retrieve(parString);
        }
        
        public static void atualizar(MovimentoCaixa objeto){
            MovimentoCaixaDAO.getInstance().update(objeto);
        }
        
        public static void remover(MovimentoCaixa objeto){
            MovimentoCaixaDAO.getInstance().delete(objeto);
        }
}
