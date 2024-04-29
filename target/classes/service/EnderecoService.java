package service;

import DAO.EnderecoDAO;
import java.util.List;
import model.Endereco;

public class EnderecoService {

    public static void adicionar(Endereco objeto) {
        EnderecoDAO.getInstance().create(objeto);
    }

    public static List<Endereco> carregar() {
        return EnderecoDAO.getInstance().retrieve();
    }

    public static Endereco carregar(int parPK) {
        return EnderecoDAO.getInstance().retrieve(parPK);
    }

    public static Endereco carregar(String parString, String column) {
        return EnderecoDAO.getInstance().retrieve(parString, column);
    }

    public static void atualizar(Endereco objeto) {
        EnderecoDAO.getInstance().update(objeto);
    }

    public static void remover(Endereco objeto) {
        EnderecoDAO.getInstance().delete(objeto);
    }
}
