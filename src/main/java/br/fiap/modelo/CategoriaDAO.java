package br.fiap.modelo;

import br.fiap.conexao.Conexao;

import java.sql.*;

public class CategoriaDAO {

    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public void inserir (Categoria categoria) {
        sql = "insert into java_categoria values (?, ?)";
        try (Connection connection = Conexao.conectar()) {
            ps = connection.prepareStatement(sql);
            ps.setLong(1, categoria.getId());
            ps.setString(2, categoria.getCategoria());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dado no banco " + e);
        }
    }

}
