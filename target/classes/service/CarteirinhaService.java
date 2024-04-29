package service;

import DAO.CarteirinhaDAO;
import java.util.List;
import model.Carteirinha;

public class CarteirinhaService {

    public static void adicionar(Carteirinha objeto) {
        CarteirinhaDAO.getInstance().create(objeto);
    }

    public static List<Carteirinha> carregar() {
        return CarteirinhaDAO.getInstance().retrieve();
    }

    public static Carteirinha carregar(int parPK) {
        return CarteirinhaDAO.getInstance().retrieve(parPK);
    }

    public static Carteirinha carregar(String parString, String column) {
        return CarteirinhaDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Carteirinha objeto) {
        CarteirinhaDAO.getInstance().update(objeto);
    }

    public static void remover(Carteirinha objeto) {
        CarteirinhaDAO.getInstance().delete(objeto);
    }
}
