package service;

import DAO.VendaDAO;
import java.util.List;

import model.Venda;

public class VendaService {

    public static void adicionar(Venda objeto) {
        VendaDAO.getInstance().create(objeto);
    }

    public static List<Venda> carregar() {
        return VendaDAO.getInstance().retrieve();
    }

    public static Venda carregar(int parPK) {
        return VendaDAO.getInstance().retrieve(parPK);
    }

    public static Venda carregar(String parString, String column) {
        return VendaDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Venda objeto) {
        VendaDAO.getInstance().update(objeto);
    }

    public static void remover(Venda objeto) {
        VendaDAO.getInstance().delete(objeto);
    }
}
