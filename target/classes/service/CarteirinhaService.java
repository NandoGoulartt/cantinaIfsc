package service;

import DAO.CarteirinhaDAO;
import java.util.List;
import model.Carteirinha;

public class CarteirinhaService {

    public static void adicionar(Carteirinha objeto) {
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        carteirinhaDAO.create(objeto);
    }

    public static List<Carteirinha> carregar() {
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        return carteirinhaDAO.retrieve();
    }

    public static Carteirinha carregar(int parPK) {
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        return carteirinhaDAO.retrieve(parPK);
    }

    public static Carteirinha carregar(String parString, String column) {
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        return carteirinhaDAO.retrieve(parString, column);
    }

    public static void atualizar(Carteirinha objeto) {
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        carteirinhaDAO.update(objeto);
    }
    public static void remover(Carteirinha objeto) {
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        carteirinhaDAO.delete(objeto);
    }
}
