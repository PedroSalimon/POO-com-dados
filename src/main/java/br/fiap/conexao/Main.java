package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        DespesaDAO deDao = new DespesaDAO();
        Despesa despesa = new Despesa();
        //DateTimeFormatter mascara = new DateTimeFormatter();
        List<Categoria> lista = dao.listar();
        for (Categoria categoria : lista) {
            System.out.println(categoria.getId() + " --> " + categoria.getCategoria());
        }

        System.out.println("---------");

        List<Despesa> listaDespesa = deDao.listar();
        for (Despesa despesa : listaDespesa) {
            System.out.println(despesa.getId() + " --> " + despesa.getDescricao() + " --> " + despesa.getValor());
        }

    }
}
