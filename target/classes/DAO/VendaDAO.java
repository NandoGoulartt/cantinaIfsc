package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Venda;
import utilities.Utilities;

public class VendaDAO implements InterfaceDAO<Venda> {

    @Override
    public void create(Venda venda) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO venda (observacao, status, funcionario_id, carteirinha_id, flagTipoDesconto, dataHoraVenda) VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, venda.getObservacao());
            pstm.setString(2, String.valueOf(venda.getStatus()));
            pstm.setInt(3, venda.getFuncionario().getId());
            pstm.setInt(4, venda.getCarteirinha().getId());
            pstm.setString(5, venda.getFlagTipoDesconto());
            pstm.setDate(6, new java.sql.Date(venda.getDataHoraVenda().getTime()));
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Venda> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM venda";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Venda> listaVendas = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setObservacao(rs.getString("observacao"));
                venda.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                venda.setFuncionario(rs.getInt("funcionario_id"));
                venda.setCarteirinha(rs.getInt("carteirinha_id"));
                venda.setFlagTipoDesconto(rs.getString("flagTipoDesconto"));
                venda.setDataHoraVenda(rs.getDate("dataHoraVenda"));
                listaVendas.add(venda);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }
        return listaVendas;
    }

    @Override
    public Venda retrieve(int primaryKey) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM venda WHERE id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Venda venda = new Venda();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, primaryKey);
            rs = pstm.executeQuery();
            if (rs.next()) {
                venda.setId(rs.getInt("id"));
                venda.setObservacao(rs.getString("observacao"));
                venda.setStatus(Utilities.getCharStatusFromString(rs.getString("status")));
                venda.setFuncionario(rs.getInt("funcionario_id"));
                venda.setCarteirinha(rs.getInt("carteirinha_id"));
                venda.setFlagTipoDesconto(rs.getString("flagTipoDesconto"));
                venda.setDataHoraVenda(rs.getDate("dataHoraVenda"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rs);
        }

        return venda;
    }

    @Override
    public Venda retrieve(String searchString, String column) {
        String searchFormated = "%" + searchString + "%";
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * FROM venda WHERE " + column + " LIKE ?;";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Venda venda = new Venda();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, searchFormated);
            rst = pstm.executeQuery();
            while (rst.next()) {
                venda.setId(rst.getInt("id"));
                venda.setObservacao(rst.getString("observacao"));
                venda.setStatus(Utilities.getCharStatusFromString(rst.getString("status")));
                venda.setFuncionario(rst.getInt("funcionario_id"));
                venda.setCarteirinha(rst.getInt("carteirinha_id"));
                venda.setFlagTipoDesconto(rst.getString("flagTipoDesconto"));
                venda.setDataHoraVenda(rst.getDate("dataHoraVenda"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
        }

        return venda;
    }

    @Override
    public void update(Venda venda) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE venda SET observacao = ?, status = ?, funcionario_id = ?, carteirinha_id = ?, flagTipoDesconto = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, venda.getObservacao());
            pstm.setString(2, String.valueOf(venda.getStatus()));
            pstm.setInt(3, venda.getFuncionario().getId());
            pstm.setInt(4, venda.getCarteirinha().getId());
            pstm.setString(5, venda.getFlagTipoDesconto());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Venda venda) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM venda WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, venda.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }
}
