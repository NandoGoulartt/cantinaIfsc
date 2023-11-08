package DAO;

import java.sql.ResultSet;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Carteirinha;

public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {
    @Override
    public void create(Carteirinha objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (codigoBarra, dataGeracao, dataCancelamento, cliente_id) VALUES(?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodBarra());
            pstm.setString(3, objeto.getDataGeracao());
            pstm.setString(2, objeto.getDataCancelamento());
            pstm.setInt(4, objeto.getIdcliente());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Carteirinha> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id, codigoBarra, dataGeracao, dataCancelamento, cliente_id FROM carteirinha";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Carteirinha> listaCarteirinha = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
                Carteirinha carteirinha = new Carteirinha();
                carteirinha.setId(rst.getInt("id"));
                carteirinha.setCodBarra("codigoBarra");
                carteirinha.setDataCancelamento("dataCancelamento");
                carteirinha.setDataGeracao("dataGeracao");
                carteirinha.setId(rst.getInt("cliente_id"));
                listaCarteirinha.add(carteirinha);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
        }
        return listaCarteirinha;
    }

    @Override
    public Carteirinha retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT id, codigoBarra, dataGeracao, dataCancelamento, cliente_id FROM carteirinha WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;
        Carteirinha carteirinha = new Carteirinha();
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            while (rst.next()) {
                carteirinha.setId(rst.getInt("id"));
                carteirinha.setCodBarra("codigoBarra");
                carteirinha.setDataCancelamento("dataCancelamento");
                carteirinha.setDataGeracao("dataGeracao");
                carteirinha.setId(rst.getInt("cliente_id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
        }

        return carteirinha;

    }

    @Override
    public Carteirinha retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Carteirinha objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE carteirinha SET codigoBarra = ?, dataGeracao = ?, dataCancelamento = ?, cliente_id = ? WHERE id = ?";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(2, objeto.getDataCancelamento());
            pstm.setInt(3, objeto.getIdcliente());
            pstm.setInt(4, objeto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Carteirinha objeto) {
    }

}
