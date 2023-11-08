package service;

import DAO.FornecedorDAO;
import java.util.List;
import model.Fornecedor;

public class FornecedorService {

    public static void adicionar(Fornecedor objeto) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.create(objeto);
    }

    public static List<Fornecedor> carregar() {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.retrieve();
    }

    public static Fornecedor carregar(int parPK) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.retrieve(parPK);
    }

    public static Fornecedor carregar(String parString) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.retrieve(parString);
    }

    public static void atualizar(Fornecedor objeto) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.update(objeto);
    }

    public static void remover(Fornecedor objeto) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.delete(objeto);
    }
}
