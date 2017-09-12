package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.Categoria;
import br.com.grupo4.mercadon.DAO.CategoriaDAO;

public class CategoriaService {

	// Metodo para listar todas as categorias
	public List<Categoria> listarCategorias() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			return new CategoriaDAO(con).lista();
		}
	}

	// Metodo para buscar todas as categorias --- arrumar
	public void buscarCategoria() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Categoria> categorias = new CategoriaDAO(con).lista();
			for (Categoria categoria : categorias) {
				System.out.println(categoria.getNome());

			}
		}
		
		public void buscarSubCategoria(int txt) throws SQLException {
			try (Connection con = new ConnectionPoolOracle().getConnection()) {
				List<Categoria> categorias = new CategoriaDAO(con).lista();
				for (Categoria categoria : categorias) {
					System.out.println(categoria.getNome());
	}
}
		}
	}
