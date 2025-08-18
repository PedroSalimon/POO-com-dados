package br.fiap.modelo;

import br.fiap.conexao.Conexao;
import sun.security.krb5.internal.crypto.Des;

import java.sql.*;

public class DespesaDAO {

    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public void inserir (Despesa despesa){
        sql = "insert into java_categoria values (?, ?, ?, ?, ?)";
        try (Connection connection = Conexao.conectar()) {
            ps = connection.prepareStatement(sql);
            ps.setLong(1, despesa.getId());
            ps.setString(2, despesa.getDescricao());
            ps.setDouble(3, despesa.getValor());
            ps.setDate(4, Date.valueOf(despesa.getData()));
            ps.setLong(4, despesa.getCategoria().getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dado no banco " + e);
        }
    }

}
