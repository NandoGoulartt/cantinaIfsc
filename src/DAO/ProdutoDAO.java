package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produto;
import utilities.Utilities;

public class ProdutoDAO implements InterfaceDAO<Produto> {

    @Override
    public void create(Produto produto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO produto (descricao, codigoBarra, status) VALUES(?, ?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, produto.getDescricao());
            pstm.setString(2, produto.getCodigoBarra());
            pstm.setString(3, produto.getStatusChar());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Produto> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao, codigoBarra, status FROM produto";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Produto> listaProdutos = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setCodigoBarra(rs.getString("codigoBarra"));
                produto.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaProdutos;
    }

    @Override
    public Produto retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, descricao, codigoBarra, status FROM produto WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Produto produto = new Produto();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setCodigoBarra(rs.getString("codigoBarra"));
                produto.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return produto;
    }

    @Override
    public Produto retrieve(String searchString) {
        // Implemente o m�todo de sele��o por string de pesquisa (RETRIEVE) aqui
        return null;
    }

    @Override
    public void update(Produto produto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto SET descricao = ?, codigoBarra = ?, status = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, produto.getDescricao());
            pstm.setString(2, produto.getCodigoBarra());
            pstm.setString(3, String.valueOf(produto.getStatus()));
            pstm.setInt(4, produto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Produto produto) {
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
