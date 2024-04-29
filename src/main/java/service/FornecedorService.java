package service;

import DAO.FornecedorDAO;
import java.util.List;
import model.Fornecedor;

public class FornecedorService {

    public static void adicionar(Fornecedor objeto) {
        FornecedorDAO.getInstance().create(objeto);
    }

    public static List<Fornecedor> carregar() {
        return FornecedorDAO.getInstance().retrieve();
    }

    public static Fornecedor carregar(int parPK) {
        return FornecedorDAO.getInstance().retrieve(parPK);
    }

    public static Fornecedor carregar(String parString, String column) {
        return FornecedorDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Fornecedor objeto) {
        FornecedorDAO.getInstance().update(objeto);
    }

    public static void remover(Fornecedor objeto) {
        FornecedorDAO.getInstance().delete(objeto);
    }
}
