package service;

import DAO.FuncionarioDAO;
import java.util.List;
import model.Funcionario;

public class FuncionarioService {

    public static void adicionar(Funcionario objeto) {
        FuncionarioDAO cidadeDAO = new FuncionarioDAO();
        cidadeDAO.create(objeto);
    }

    public static List<Funcionario> carregar() {
        FuncionarioDAO cidadeDAO = new FuncionarioDAO();
        return cidadeDAO.retrieve();
    }

    public static Funcionario carregar(int parPK) {
        FuncionarioDAO cidadeDAO = new FuncionarioDAO();
        return cidadeDAO.retrieve(parPK);
    }

    public static Funcionario carregar(String parString, String column) {
        FuncionarioDAO cidadeDAO = new FuncionarioDAO();
        return cidadeDAO.retrieve(parString, column);
    }

    public static void atualizar(Funcionario objeto) {
        FuncionarioDAO cidadeDAO = new FuncionarioDAO();
        cidadeDAO.update(objeto);
    }

    public static void remover(Funcionario objeto) {
        FuncionarioDAO cidadeDAO = new FuncionarioDAO();
        cidadeDAO.delete(objeto);
    }
}
