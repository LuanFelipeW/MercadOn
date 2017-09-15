package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;

public class ProdutoDAO {
	private final Connection conn;

	public CarrinhoDAO(Connection con) {
		this.conn = con;
	}
}
