package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;

public class EnderecoDAO implements InterfaceDAO<Endereco> {

    @Override
    public void create(Endereco endereco) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (cep, logradouro, status, cidade_id, bairro_id) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, endereco.getCep());
            pstm.setString(2, endereco.getLogradouro());
            pstm.setString(3, endereco.getStatusChar());
            pstm.setInt(4, endereco.getCidadeId());
            pstm.setInt(5, endereco.getBairroId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Endereco> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, cep, logradouro, status, cidade_id, bairro_id FROM endereco";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Endereco> listaEnderecos = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setId(rs.getInt("id"));
                endereco.setCep(rs.getString("cep"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setStatus(rs.getString("status"));
                endereco.setCidadeId(rs.getInt("cidade_id"));
                endereco.setBairroId(rs.getInt("bairro_id"));
                listaEnderecos.add(endereco);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaEnderecos;
    }

    @Override
    public Endereco retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, cep, logradouro, status, cidade_id, bairro_id FROM endereco WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Endereco endereco = new Endereco();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                endereco.setId(rs.getInt("id"));
                endereco.setCep(rs.getString("cep"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setStatus(rs.getString("status"));
                endereco.setCidadeId(rs.getInt("cidade_id"));
                endereco.setBairroId(rs.getInt("bairro_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return endereco;
    }

    @Override
    public Endereco retrieve(String searchString) {
        // Implemente o método de seleção por string de pesquisa (RETRIEVE) aqui
        return null;
    }

    @Override
    public void update(Endereco endereco) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE endereco SET cep = ?, logradouro = ?, status = ?, cidade_id = ?, bairro_id = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, endereco.getCep());
            pstm.setString(2, endereco.getLogradouro());
            pstm.setString(3, endereco.getStatusChar());
            pstm.setInt(4, endereco.getCidadeId());
            pstm.setInt(5, endereco.getBairroId());
            pstm.setInt(6, endereco.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Endereco endereco) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM endereco WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, endereco.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }
}
