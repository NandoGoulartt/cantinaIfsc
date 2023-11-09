package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import utilities.Utilities;

public class FuncionarioDAO implements InterfaceDAO<Funcionario> {

    @Override
    public void create(Funcionario funcionario) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO funcionario (nome, fone1, fone2, email, status, cpf, rg, usuario, senha, complementoEndereco, endereco_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getFone1());
            pstm.setString(3, funcionario.getFone2());
            pstm.setString(4, funcionario.getEmail());
            pstm.setString(5, funcionario.getStatusChar());
            pstm.setString(6, funcionario.getCpf());
            pstm.setString(7, funcionario.getRg());
            pstm.setString(8, funcionario.getUsuario());
            pstm.setString(9, funcionario.getSenha());
            pstm.setString(10, funcionario.getComplementoEndereco());
            pstm.setInt(11, funcionario.getEnderecoId());

            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Funcionario> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, email, status, cpf, rg, usuario, senha, complementoEndereco, endereco_id FROM funcionario";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setFone1(rs.getString("fone1"));
                funcionario.setFone2(rs.getString("fone2"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setUsuario(rs.getString("usuario"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setComplementoEndereco(rs.getString("complementoEndereco"));
                funcionario.setEnderecoId(rs.getInt("endereco_id"));
                listaFuncionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaFuncionarios;
    }

    @Override
    public Funcionario retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, email, status, cpf, rg, usuario, senha, complementoEndereco, endereco_id FROM funcionario WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Funcionario funcionario = new Funcionario();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setFone1(rs.getString("fone1"));
                funcionario.setFone2(rs.getString("fone2"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setUsuario(rs.getString("usuario"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setComplementoEndereco(rs.getString("complementoEndereco"));
                funcionario.setEnderecoId(rs.getInt("endereco_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return funcionario;
    }

    @Override
    public Funcionario retrieve(String searchString, String column) {
        // Implemente o m�todo de sele��o por string de pesquisa (RETRIEVE) aqui
        return null;
    }

    @Override
    public void update(Funcionario funcionario) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE funcionario SET nome = ?, fone1 = ?, fone2 = ?, email = ?, status = ?, cpf = ?, rg = ?, usuario = ?, senha = ?, complementoEndereco = ?, endereco_id = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getFone1());
            pstm.setString(3, funcionario.getFone2());
            pstm.setString(4, funcionario.getEmail());
            pstm.setString(5, funcionario.getStatusChar());
            pstm.setString(6, funcionario.getCpf());
            pstm.setString(7, funcionario.getRg());
            pstm.setString(8, funcionario.getUsuario());
            pstm.setString(9, funcionario.getSenha());
            pstm.setString(10, funcionario.getComplementoEndereco());
            pstm.setInt(11, funcionario.getEnderecoId());
            pstm.setInt(12, funcionario.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Funcionario funcionario) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM funcionario WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, funcionario.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }
}
