package service;

import DAO.ClienteDAO;
import java.util.List;
import model.Cliente;

public class ClienteService {

    public static void adicionar(Cliente objeto) {
        ClienteDAO.getInstance().create(objeto);
    }

    public static List<Cliente> carregar() {
        return ClienteDAO.getInstance().retrieve();

    }

    public static Cliente carregar(int parPK) {
        return ClienteDAO.getInstance().retrieve(parPK);

    }

    public static Cliente carregar(String parString, String column) {
        return ClienteDAO.getInstance().retrieve(parString, column);

    }

    public static void atualizar(Cliente objeto) {
        ClienteDAO.getInstance().update(objeto);

    }

    public static void remover(Cliente objeto) {
        ClienteDAO.getInstance().delete(objeto);

    }
}
