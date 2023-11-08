package service;

import DAO.ClienteDAO;
import java.util.List;
import model.Cliente;

public class ClienteService {

    public static void adicionar(Cliente objeto) {
        ClienteDAO cidadeDAO = new ClienteDAO();
        cidadeDAO.create(objeto);
    }

    public static List<Cliente> carregar() {
        ClienteDAO cidadeDAO = new ClienteDAO();
        return cidadeDAO.retrieve();
    }

    public static Cliente carregar(int parPK) {
        ClienteDAO cidadeDAO = new ClienteDAO();
        return cidadeDAO.retrieve(parPK);
    }

    public static Cliente carregar(String parString) {
        ClienteDAO cidadeDAO = new ClienteDAO();
        return cidadeDAO.retrieve(parString);
    }

    public static void atualizar(Cliente objeto) {
        ClienteDAO cidadeDAO = new ClienteDAO();
        cidadeDAO.update(objeto);
    }

    public static void remover(Cliente objeto) {
        ClienteDAO cidadeDAO = new ClienteDAO();
        cidadeDAO.delete(objeto);
    }
}
