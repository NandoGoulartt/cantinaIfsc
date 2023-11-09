package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import utilities.Utilities;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    @Override
    public void create(Cliente cliente) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (nome, fone1, fone2, email, status, cpf, rg, matricula, dataNascimento, complementoEndereco, endereco_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;

        java.sql.Date sqlDate = new java.sql.Date(cliente.getDataNascimento().getTime());

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getFone1());
            pstm.setString(3, cliente.getFone2());
            pstm.setString(4, cliente.getEmail());
            pstm.setString(5, cliente.getStatusChar());
            pstm.setString(6, cliente.getCpf());
            pstm.setString(7, cliente.getRg());
            pstm.setString(8, cliente.getMatricula());
            pstm.setDate(9, sqlDate);
            pstm.setString(10, cliente.getComplementoEndereco());
            pstm.setInt(11, cliente.getEnderecoId());

            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Cliente> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, email, status, cpf, rg, matricula, dataNascimento, complementoEndereco, endereco_id FROM cliente";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Cliente> listaClientes = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setFone1(rs.getString("fone1"));
                cliente.setFone2(rs.getString("fone2"));
                cliente.setEmail(rs.getString("email"));
                cliente.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setRg(rs.getString("rg"));
                cliente.setMatricula(rs.getString("matricula"));
                cliente.setDataNascimento(rs.getDate("dataNascimento"));
                cliente.setComplementoEndereco(rs.getString("complementoEndereco"));
                cliente.setEnderecoId(rs.getInt("endereco_id"));
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaClientes;
    }

    @Override
    public Cliente retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, email, status, cpf, rg, matricula, dataNascimento, complementoEndereco, endereco_id FROM cliente WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setFone1(rs.getString("fone1"));
                cliente.setFone2(rs.getString("fone2"));
                cliente.setEmail(rs.getString("email"));
                cliente.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setRg(rs.getString("rg"));
                cliente.setMatricula(rs.getString("matricula"));
                cliente.setDataNascimento(rs.getDate("dataNascimento"));
                cliente.setComplementoEndereco(rs.getString("complementoEndereco"));
                cliente.setEnderecoId(rs.getInt("endereco_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return cliente;
    }

    @Override
    public Cliente retrieve(String searchString, String column) {
        String searchFormated = "%" + searchString + "%";
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM cliente WHERE " + column + " LIKE ?;";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Cliente cliente = new Cliente();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, searchFormated);
            rst = pstm.executeQuery();
            while (rst.next()) {
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setFone1(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setEmail(rst.getString("email"));
                cliente.setStatus(Utilities.getCharStatusFromString(rst.getString("status")));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setRg(rst.getString("rg"));
                cliente.setMatricula(rst.getString("matricula"));
                cliente.setDataNascimento(rst.getDate("dataNascimento"));
                cliente.setComplementoEndereco(rst.getString("complementoEndereco"));
                cliente.setEnderecoId(rst.getInt("endereco_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
        }

        return cliente;
    }

    @Override
    public void update(Cliente cliente) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cliente SET nome = ?, fone1 = ?, fone2 = ?, email = ?, status = ?, cpf = ?, rg = ?, matricula = ?, dataNascimento = ?, complementoEndereco = ?, endereco_id = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getFone1());
            pstm.setString(3, cliente.getFone2());
            pstm.setString(4, cliente.getEmail());
            pstm.setString(5, String.valueOf(cliente.getStatus()));
            pstm.setString(6, cliente.getCpf());
            pstm.setString(7, cliente.getRg());
            pstm.setString(8, cliente.getMatricula());
            pstm.setDate(9, new java.sql.Date(cliente.getDataNascimento().getTime()));
            pstm.setString(10, cliente.getComplementoEndereco());
            pstm.setInt(11, cliente.getEndereco().getId());
            pstm.setInt(12, cliente.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, cliente.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }
}
