package service;

import DAO.ProdutoDAO;
import java.util.List;
import model.Produto;

public class ProdutoService {

    public static void adicionar(Produto objeto) {
        ProdutoDAO.getInstance().create(objeto);
    }

    public static List<Produto> carregar() {
        return ProdutoDAO.getInstance().retrieve();
    }

    public static Produto carregar(int parPK) {
        return ProdutoDAO.getInstance().retrieve(parPK);
    }

    public static Produto carregar(String parString, String column) {
        return ProdutoDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Produto objeto) {
        ProdutoDAO.getInstance().update(objeto);
    }

    public static void remover(Produto objeto) {
        ProdutoDAO.getInstance().delete(objeto);
    }
}
