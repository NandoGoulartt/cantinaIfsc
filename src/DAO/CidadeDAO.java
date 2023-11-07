package DAO;

import java.sql.ResultSet;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cidade;

public class CidadeDAO implements InterfaceDAO<Cidade> {

    @Override
    public void create(Cidade objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO Cidade (descricao, uf) VALUES(?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Cidade> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cidade.id, cidade.descricao, cidade.uf FROM cidade";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cidade> listaCidade = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(rst.getInt("id"));
                cidade.setUf(rst.getString("uf"));
                cidade.setDescricao(rst.getString("descricao"));
                listaCidade.add(cidade);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCidade;
        }
    }

    @Override
    public Cidade retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT cidade.id, "
                           + " cidade.descricao "
                           + " cidade.uf"
                           + " FROM bairro "
                           + " WHERE cidade.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Cidade cidade = new Cidade();
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            while (rst.next()) {
                cidade.setId(rst.getInt("id"));
                cidade.setDescricao(rst.getString("descricao"));
                cidade.setUf(rst.getString("uf"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cidade;
        }

    }

    @Override
    public Cidade retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Cidade objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE cidade"
                           + " SET cidade.descricao = ?"
                           + " SET cidade.uf = ?"
                           + " WHERE cidade.id = ?" ;  
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
            pstm.setInt(3, objeto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Cidade objeto) {
    }

}
