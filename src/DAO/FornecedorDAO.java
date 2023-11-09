package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;
import model.Produto;
import utilities.Utilities;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    @Override
    public void create(Fornecedor fornecedor) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO fornecedor (nome, fone1, fone2, email, status, cnpj, inscricaoEstadual, razaoSocial, complementoEndereco, endereco_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, fornecedor.getNome());
            pstm.setString(2, fornecedor.getFone1());
            pstm.setString(3, fornecedor.getFone2());
            pstm.setString(4, fornecedor.getEmail());
            pstm.setString(5, fornecedor.getStatusChar());
            pstm.setString(6, fornecedor.getCnpj());
            pstm.setString(7, fornecedor.getInscricaoEstadual());
            pstm.setString(8, fornecedor.getRazaoSocial());
            pstm.setString(9, fornecedor.getComplementoEndereco());
            pstm.setInt(10, fornecedor.getEnderecoId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Fornecedor> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, email, status, cnpj, inscricaoEstadual, razaoSocial, complementoEndereco, endereco_id FROM fornecedor";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Fornecedor> listaFornecedor = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setFone1(rs.getString("fone1"));
                fornecedor.setFone2(rs.getString("fone2"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
                fornecedor.setRazaoSocial(rs.getString("razaoSocial"));
                fornecedor.setComplementoEndereco(rs.getString("complementoEndereco"));
                fornecedor.setEnderecoId(rs.getInt("endereco_id"));
                listaFornecedor.add(fornecedor);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaFornecedor;
    }

    @Override
    public Fornecedor retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, nome, fone1, fone2, email, status, cnpj, inscricaoEstadual, razaoSocial, complementoEndereco, endereco_id FROM fornecedor WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Fornecedor fornecedor = new Fornecedor();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setFone1(rs.getString("fone1"));
                fornecedor.setFone2(rs.getString("fone2"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setInscricaoEstadual(rs.getString("inscricaoEstadual"));
                fornecedor.setRazaoSocial(rs.getString("razaoSocial"));
                fornecedor.setComplementoEndereco(rs.getString("complementoEndereco"));
                fornecedor.setEnderecoId(rs.getInt("endereco_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return fornecedor;
    }

    @Override
    public Fornecedor retrieve(String searchString, String column) {
        return null;
    }

    @Override
    public void update(Fornecedor fornecedor) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE fornecedor SET nome = ?, fone1= ?, fone2= ?, email= ?, status= ?, cnpj= ?, inscricaoEstadual= ?, razaoSocial= ?, complementoEndereco= ?, endereco_id= ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, fornecedor.getNome());
            pstm.setString(2, fornecedor.getFone1());
            pstm.setString(3, fornecedor.getFone2());
            pstm.setString(4, fornecedor.getEmail());
            pstm.setString(5, fornecedor.getStatusChar());
            pstm.setString(6, fornecedor.getCnpj());
            pstm.setString(7, fornecedor.getInscricaoEstadual());
            pstm.setString(8, fornecedor.getRazaoSocial());
            pstm.setString(9, fornecedor.getComplementoEndereco());
            pstm.setInt(10, fornecedor.getEnderecoId());
            pstm.setInt(11, fornecedor.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Fornecedor produto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM produto WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, produto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }
}
