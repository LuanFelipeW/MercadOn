package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Categoria;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.service.CategoriaService;

public class CategoriaDAO {

	private final Connection conn;

	public CategoriaDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO CATEGORIA (CAT_CODIGO, CAT_NOME) VALUES (SEQ_CATEGORIA.nextval, ?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, categoria.getNome());

		return statement.executeUpdate() > 0;
	}

	public boolean alterar(Categoria categoria) throws SQLException {
		String sql = "UPDATE CATEGORIA SET CAT_NOME = ? WHERE CAT_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, categoria.getNome());
		statement.setInt(2, categoria.getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean apagar(Integer codigo) throws SQLException {
		String sql = " DELETE CATEGORIA WHERE CAT_CODIGO = ? ";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	// Metodo de listagem de produtos baseando-se na categoria selecionada
	public List<Produto> listarProCat(Integer entrada) throws SQLException {
		List<Produto> lProduto = new ArrayList<>();

		String sql = "SELECT PRO_NOME, PRO_PRECO FROM PRODUTO ";
		sql += " INNER JOIN SUBCATEGORIA ON (PRODUTO.PRO_SUBCATEGORIA = SUBCATEGORIA.SCA_CODIGO) ";
		sql += " WHERE SCA_CATEGORIA = ? ";

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
	
	// Metodo de listagem	 das categorias
	public List<Categoria> listaTodasCategorias() throws SQLException {
		List<Categoria> lCategoria = new ArrayList<>();

		String sql = "SELECT CAT_CODIGO, CAT_NOME FROM CATEGORIA ";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					Integer codigo = rs.getInt(1);
					String nome = rs.getString(2);
					Categoria categoria = new Categoria(codigo, nome);
					lCategoria.add(categoria);

				}
			}
		}
		return lCategoria;

	}

	
	
	
}
