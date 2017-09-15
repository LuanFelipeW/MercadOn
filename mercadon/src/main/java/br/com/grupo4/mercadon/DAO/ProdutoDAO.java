package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.grupo4.mercadon.model.Produto;

public class ProdutoDAO {

	private final Connection conn;

	public ProdutoDAO(Connection con) {
		this.conn = con;
	}

	public List<Produto> buscarListaProduto(String entrada) throws SQLException {
		List<Produto> lProduto = new ArrayList<>();

		String sql = "SELECT PRO_NOME, PRO_PRECO ";
		sql += " FROM PRODUTO ";
		sql += " WHERE UPPER(PRO_NOME) LIKE UPPER(?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, "%" + entrada + "%");
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nome = rs.getString(1);
					double preco = rs.getDouble(2);
					Produto produto = new Produto(nome, preco);
					lProduto.add(produto);

				}
			}
		}
		return lProduto;
	}

	public List<Produto> filtrarProdutoAZ(Integer entrada) throws SQLException {
		List<Produto> lProduto = new ArrayList<>();

		String sql = " SELECT PRO_NOME, PRO_PRECO ";
		sql += " FROM PRODUTO ";
		sql += " ORDER BY ? ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, entrada);
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nome = rs.getString(1);
					double preco = rs.getDouble(2);
					Produto produto = new Produto(nome, preco);
					lProduto.add(produto);

				}
			}
		}
		return lProduto;
	}

}
