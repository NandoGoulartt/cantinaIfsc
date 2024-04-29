package service;

import DAO.CidadeDAO;
import java.util.List;
import model.Cidade;

public class CidadeService {

    public static void adicionar(Cidade objeto) {
        CidadeDAO.getInstance().create(objeto);
    }

    public static List<Cidade> carregar() {
        return CidadeDAO.getInstance().retrieve();
    }

    public static Cidade carregar(int parPK) {
        return CidadeDAO.getInstance().retrieve(parPK);
    }

    public static Cidade carregar(String parString, String column) {
        return CidadeDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Cidade objeto) {
        CidadeDAO.getInstance().update(objeto);
    }

    public static void remover(Cidade objeto) {
        CidadeDAO.getInstance().delete(objeto);
    }
}
