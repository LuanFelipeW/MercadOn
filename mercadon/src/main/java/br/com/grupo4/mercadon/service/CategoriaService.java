package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.Categoria;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.DAO.CategoriaDAO;

public class CategoriaService {
	DecimalFormat df = new DecimalFormat("#0.00");

	// Metodo para listar todas as categorias
	public List<Categoria> listarCategorias() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CategoriaDAO(con).listaTodasCategorias();
		}
	}

	// Metodo para buscar todas as categorias --- arrumar
	public void buscarCategoria() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Produto> produtos = new CategoriaDAO(con).listarProCat(3);
			for (Produto produto : produtos) {
				System.out.println(produto.getNome() + "\n" + df.format((produto.getPreco())));

			}
		}
	}
	// Metodo para mostrar todos os produtos de uma determinada categoria
	public void buscarCategoriaProdutos(Integer entrada) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Produto> produtos = new CategoriaDAO(con).listarProCat(entrada);
			for (Produto produto : produtos) {
				System.out.println(produto.getNome() + "\n" + df.format((produto.getPreco())));
			}
		}
	}
}
