package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Categoria;
import br.com.grupo4.mercadon.model.Produto;

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
		String sql = "DELETE CATEGORIA WHERE CAT_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	// Metodo de listagem de produtos baseando-se na categoria selecionada
	public List<Produto> listarProSub(Integer entrada) throws SQLException {
		List<Produto> lProduto = new ArrayList<>();

		String sql = "SELECT PRO_NOME, PRO_PRECO FROM PRODUTO WHERE PRO_SUBCATEGORIA = ?";


		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, entrada);
			stmt.execute();

			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nome = rs.getString("PRO_NOME");
					Double preco = rs.getDouble("PRO_PRECO");

					Produto produto = new Produto(nome, preco);
					lProduto.add(produto);

				}
			}
		}
		return lProduto;

	}

}
