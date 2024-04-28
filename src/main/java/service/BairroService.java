package service;

import java.util.List;
import DAO.BairroDAO;
import model.Bairro;

public class BairroService {

    public static void adicionar(Bairro objeto) {
        BairroDAO.getInstance().create(objeto);
    }

    public static List<Bairro> carregar() {
        return BairroDAO.getInstance().retrieve();
    }

    public static Bairro carregar(int parPK) {
        return BairroDAO.getInstance().retrieve(parPK);
    }

    public static Bairro carregar(String parString, String column) {
        return BairroDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Bairro objeto) {
        BairroDAO.getInstance().update(objeto);
    }

    public static void remover(Bairro objeto) {
        BairroDAO.getInstance().delete(objeto);
    }
}
