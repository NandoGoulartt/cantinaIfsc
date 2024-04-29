package service;

import DAO.ItemVendaDAO;
import java.util.List;
import model.ItemVenda;

public class ItemVendaService {

    public static void adicionar(ItemVenda objeto) {
        ItemVendaDAO.getInstance().create(objeto);
    }

    public static List<ItemVenda> carregar() {
        return ItemVendaDAO.getInstance().retrieve();
    }

    public static ItemVenda carregar(int parPK) {
        return ItemVendaDAO.getInstance().retrieve(parPK);
    }

    public static ItemVenda carregar(String parString, String column) {
        return ItemVendaDAO.getInstance().retrieve(parString, column);
    }

    public static List<ItemVenda> carregarPorVenda(int vendaId) {
        return ItemVendaDAO.getInstance().carregarPorVenda(vendaId);
    }

    public static void atualizar(ItemVenda objeto) {
        ItemVendaDAO.getInstance().update(objeto);
    }

    public static void remover(ItemVenda objeto) {
        ItemVendaDAO.getInstance().delete(objeto);
    }
}
