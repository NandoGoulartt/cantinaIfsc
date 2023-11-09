package service;

import DAO.ProdutoDAO;
import java.util.List;
import model.Produto;

public class ProdutoService {

    public static void adicionar(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.create(objeto);
    }

    public static List<Produto> carregar() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve();
    }

    public static Produto carregar(int parPK) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve(parPK);
    }

    public static Produto carregar(String parString, String column) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.retrieve(parString, column);
    }

    public static void atualizar(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(objeto);
    }

    public static void remover(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.delete(objeto);
    }
}
