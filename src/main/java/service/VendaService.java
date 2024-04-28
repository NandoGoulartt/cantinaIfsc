package service;

import DAO.VendaDAO;
import java.util.List;
import model.Venda;

public class VendaService {

    public static void adicionar(Venda objeto) {
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.create(objeto);
    }

    public static List<Venda> carregar() {
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.retrieve();
    }

    public static Venda carregar(int parPK) {
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.retrieve(parPK);
    }

    public static Venda carregar(String parString, String column) {
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.retrieve(parString, column);
    }

    public static void atualizar(Venda objeto) {
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.update(objeto);
    }

    public static void remover(Venda objeto) {
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.delete(objeto);
    }
}
