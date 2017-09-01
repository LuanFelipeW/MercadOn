package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Categoria;
import br.com.grupo4.mercadon.model.Favoritos;

public class FavoritosDAO {
	private final Connection conn;

	public FavoritosDAO(Connection con) {
		this.conn = con;
	}

	public boolean adicionarCompra(Favoritos favoritos) throws SQLException {
		String sql = "INSERT INTO FAVORITOS (FAV_CODIGO, FAV_HISTORICODECOMPRAS) VALUES (SEQ_FAVORITOS.nextval,?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, favoritos.getHistoricoDeCompras().getCodigo());

		return statement.executeUpdate() > 0;
	}
	
//TEM QUE ADICIONAR O NOME DO MERCADO NOS FAVORITOS, INNER JOIN AO CONTRÁRIO ATÉ O NOME.

	public boolean apagar(Integer codigo) throws SQLException {
		String sql = "DELETE CARRINHO WHERE CAR_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}

	public List<Favoritos> lista() throws SQLException {
		List<Favoritos> lCarrinho = new ArrayList<>();

		String sql = "SELECT CO.CAR_CODIGO, CO.CAR_QUANTIDADE, CO.CAR_VALOR_TOTAL, CO.CAR_CLIENTE";
		sql += "PF.PEF_NOME";
		sql += " FROM CARRINHO CO ";
		sql += " INNER JOIN PESSOAFISICA PF ON (CO.CAR_CLIENTE = PF.PEF_CODIGO) ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					int quantidade = rs.getInt(2);
					double valorTotal = rs.getDouble(3);
					int codigoPf = rs.getInt(4);
					String nomeCliente = rs.getString(5);
					//PessoaFisica pessoaFisica = new PessoaFisica(codigoPf, nomeCliente);
				//	Carrinho carrinho = new Carrinho(codigo, quantidade, valorTotal, pessoaFisica);
				//	lCarrinho.add(carrinho);

				}
			}
		}
		return lCarrinho;
	}
}
