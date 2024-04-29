package service;

import DAO.FuncionarioDAO;
import java.util.List;
import model.Funcionario;

public class FuncionarioService {

    public static void adicionar(Funcionario objeto) {
        FuncionarioDAO.getInstance().create(objeto);
    }

    public static List<Funcionario> carregar() {
        return FuncionarioDAO.getInstance().retrieve();
    }

    public static Funcionario carregar(int parPK) {
        return FuncionarioDAO.getInstance().retrieve(parPK);
    }

    public static Funcionario carregar(String parString, String column) {
        return FuncionarioDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Funcionario objeto) {
        FuncionarioDAO.getInstance().update(objeto);
    }

    public static void remover(Funcionario objeto) {
        FuncionarioDAO.getInstance().delete(objeto);
    }
}
