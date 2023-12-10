package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ItemVenda;

public class ItemVendaDAO implements InterfaceDAO<ItemVenda> {

    @Override
    public void create(ItemVenda itemvenda) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO itemvenda (qtdProduto, valorUnitario, venda_id, produto_id) VALUES(?, ?, ?, ?)";
        PreparedStatement pstm = null;

        System.out.println(itemvenda.getVenda().getId());

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, itemvenda.getQtdProduto());
            pstm.setDouble(2, itemvenda.getValorUnitario());
            pstm.setInt(3, itemvenda.getVenda().getId());
            pstm.setInt(4, itemvenda.getProduto().getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<ItemVenda> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM itemvenda";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<ItemVenda> listaItemVendas = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ItemVenda itemvenda = new ItemVenda();
                itemvenda.setId(rs.getInt("id"));
                itemvenda.setQtdProduto(rs.getInt("qtdProduto"));
                itemvenda.setValorUnitario(rs.getDouble("valorUnitario"));
                itemvenda.setVenda(rs.getInt("venda_id"));
                itemvenda.setProduto(rs.getInt("produto_id"));
                listaItemVendas.add(itemvenda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaItemVendas;
    }

    @Override
    public ItemVenda retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM itemvenda WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ItemVenda itemvenda = new ItemVenda();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                itemvenda.setId(rs.getInt("id"));
                itemvenda.setQtdProduto(rs.getInt("qtdProduto"));
                itemvenda.setValorUnitario(rs.getDouble("valorUnitario"));
                itemvenda.setVenda(rs.getInt("venda_id"));
                itemvenda.setProduto(rs.getInt("produto_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return itemvenda;
    }

    @Override
    public ItemVenda retrieve(String searchString, String column) {
        String searchFormated = "%" + searchString + "%";
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM itemvenda WHERE " + column + " LIKE ?;";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        ItemVenda itemvenda = new ItemVenda();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, searchFormated);
            rst = pstm.executeQuery();
            while (rst.next()) {
                itemvenda.setId(rst.getInt("id"));
                itemvenda.setQtdProduto(rst.getInt("qtdProduto"));
                itemvenda.setValorUnitario(rst.getDouble("valorUnitario"));
                itemvenda.setVenda(rst.getInt("venda_id"));
                itemvenda.setProduto(rst.getInt("produto_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
        }

        return itemvenda;
    }

    @Override
    public void update(ItemVenda itemvenda) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE itemvenda SET descricao = ?, codigoBarra = ?, status = ?, preco = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(4, itemvenda.getId());
            pstm.setInt(1, itemvenda.getQtdProduto());
            pstm.setDouble(2, itemvenda.getValorUnitario());
            pstm.setInt(3, itemvenda.getVenda().getId());
            pstm.setInt(4, itemvenda.getProduto().getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(ItemVenda itemvenda) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM itemvenda WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, itemvenda.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }
}
