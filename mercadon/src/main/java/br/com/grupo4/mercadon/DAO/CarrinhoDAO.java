package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Carrinho;

public class CarrinhoDAO {
private final Connection conn;
	
	public CarrinhoDAO(Connection con) {
		this.conn = con;
	}
	public boolean inserir(Carrinho carrinho) throws SQLException{
		String sql = "INSERT INTO CARRINHO (CAR_CODIGO, CAR_QUANTIDADE, CAR_VALOR_TOTAL, CAR_CLIENTE) VALUES (SEQ_CARRINHO.nextval, ?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, carrinho.getQuantidade());
		statement.setDouble(2, carrinho.getPrecoTotal());
		statement.setInt(3, carrinho.getPessoaFisica().getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(Integer codigo, String nome) throws SQLException{
		String sql = "UPDATE CARRINHO SET CAC_NOME = ? WHERE CAC_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(Integer codigo) throws SQLException{
		String sql = "DELETE CACHORRO WHERE CAC_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> lCachorros = new ArrayList<>();

		String sql = "select * from CACHORRO";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("CAC_CODIGO");
					String nome = rs.getString("CAC_NOME");
					String cor = rs.getString("CAC_COR");
					int qtdPtas = rs.getInt("CAC_QTD_PATAS");
					String som = rs.getString("CAC_SOM");
					Cachorro cachorro = new Cachorro(codigo, nome, cor, qtdPtas, som);
					lCachorros.add(cachorro);
				}
			}
		}

		return lCachorros;

	}
}