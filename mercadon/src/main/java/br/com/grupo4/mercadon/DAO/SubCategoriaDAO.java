package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Produto;

public class SubCategoriaDAO {
	
	private final Connection conn;

	public SubCategoriaDAO(Connection con) {
		this.conn = con;
	}
	
	// Metodo de listagem de produtos baseando-se na categoria selecionada
		public List<Produto> listarProSub(Integer entrada) throws SQLException {
			List<Produto> lProduto = new ArrayList<>();	

			String sql = "SELECT PRO_NOME, PRO_PRECO FROM PRODUTO ";
			sql += " WHERE PRO_SUBCATEGORIA = ? ";

			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.setInt(1, entrada);
				stmt.execute();

				try (ResultSet rs = stmt.getResultSet()) {
					while (rs.next()) {
						String nome = rs.getString(1);
						Double preco = rs.getDouble(2);

						Produto produto = new Produto(nome, preco);
						lProduto.add(produto);

					}
				}
			}
			return lProduto;

		}

	}

