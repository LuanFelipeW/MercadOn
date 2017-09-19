package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.grupo4.mercadon.model.Favoritos;

public class MercadoFavoritosDAO {
	private final Connection conn;

	public MercadoFavoritosDAO(Connection con) {
		this.conn = con;
	}
	
	public boolean adicionarMercado(MercadoFavoritos mfavoritos) throws SQLException {
		String sql = "INSERT INTO MERCADOS_FAVORITOS (FAV_CODIGO, FAV_HISTORICODECOMPRAS) VALUES (SEQ_FAVORITOS.nextval,?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, favoritos.getHistoricoDeCompras().getCodigo());

		return statement.executeUpdate() > 0;
	}
	
}
