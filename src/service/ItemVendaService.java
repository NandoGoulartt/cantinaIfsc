package service;

import DAO.ItemVendaDAO;
import java.util.List;
import model.ItemVenda;

public class ItemVendaService {

    public static void adicionar(ItemVenda objeto) {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        itemVendaDAO.create(objeto);
    }

    public static List<ItemVenda> carregar() {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        return itemVendaDAO.retrieve();
    }

    public static ItemVenda carregar(int parPK) {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        return itemVendaDAO.retrieve(parPK);
    }

    public static ItemVenda carregar(String parString, String column) {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        return itemVendaDAO.retrieve(parString, column);
    }

    public static void atualizar(ItemVenda objeto) {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        itemVendaDAO.update(objeto);
    }

    public static void remover(ItemVenda objeto) {
        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
        itemVendaDAO.delete(objeto);
    }
}
