package br.com.grupo4.mercadon.DAO;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Categoria;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.model.SubCategoria;

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
		//MÉTODO PARA LISTAGEM DE TODAS AS SUBCATEGORIAS
		public List<SubCategoria> listarSubCategorias() throws SQLException {
			List<SubCategoria> lSubCategoria = new ArrayList<>();	

			String sql = " SELECT SCA_CODIGO, CAT.CAT_NOME, SCA_NOME FROM SUBCATEGORIA ";
			sql += " INNER JOIN CATEGORIA CAT ON (SCA_CATEGORIA = CAT.CAT_CODIGO) ";
					
			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
				stmt.execute();

				try (ResultSet rs = stmt.getResultSet()) {
					while (rs.next()) {
						int codigo = rs.getInt(1);
						String nome = rs.getString(2);
						String nomeCategoria = rs.getString(3);
						Categoria cat = new Categoria(nomeCategoria);
						
						
						SubCategoria sca = new SubCategoria(codigo, cat, nome);
						lSubCategoria.add(sca);

					}
				}
			}
			return lSubCategoria;

		}

		
	}

