package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;

public class PerfilDAO {

	private final Connection conn;

	public PerfilDAO(Connection con) {
		this.conn = con;
	}

}
