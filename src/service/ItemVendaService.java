package service;

import DAO.ItemVendaDAO;
import java.util.List;
import model.ItemVenda;

public class ItemVendaService {

    public static void adicionar(ItemVenda objeto) {
        ItemVendaDAO vendaDAO = new ItemVendaDAO();
        vendaDAO.create(objeto);
    }

    public static List<ItemVenda> carregar() {
        ItemVendaDAO vendaDAO = new ItemVendaDAO();
        return vendaDAO.retrieve();
    }

    public static ItemVenda carregar(int parPK) {
        ItemVendaDAO vendaDAO = new ItemVendaDAO();
        return vendaDAO.retrieve(parPK);
    }

    public static ItemVenda carregar(String parString, String column) {
        ItemVendaDAO vendaDAO = new ItemVendaDAO();
        return vendaDAO.retrieve(parString, column);
    }

    public static void atualizar(ItemVenda objeto) {
        ItemVendaDAO vendaDAO = new ItemVendaDAO();
        vendaDAO.update(objeto);
    }

    public static void remover(ItemVenda objeto) {
        ItemVendaDAO vendaDAO = new ItemVendaDAO();
        vendaDAO.delete(objeto);
    }
}
