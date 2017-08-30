package br.com.grupo4.mercadon.DAO; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Carrinho;
import br.com.grupo4.mercadon.model.PessoaFisica;


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
	
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE CARRINHO WHERE CAR_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Carrinho> lista() throws SQLException {
		List<Carrinho> lCarrinho = new ArrayList<>();

		String sql = "SELECT CO.CAR_CODIGO, CO.CAR_QUANTIDADE, CO.CAR_VALOR_TOTAL, CO.CAR_CLIENTE";
		sql += "CO.PEF_NOME";
		sql += " FROM CARRINHO CO ";
		sql += " INNER JOIN PESSOAFISICA PF ON (CO.CAR_CLIENTE = PF.PEF_CODIGO) ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					int quantidade = rs.getInt(2);
					double valorTotal = rs.getDouble(3);
					int codigoPf =  rs.getInt(4);
					String nomeCliente = rs.getString(5);
					PessoaFisica pessoaFisica = new PessoaFisica(codigoPf,nomeCliente);
					Carrinho carrinho = new Carrinho(codigo, quantidade, valorTotal,pessoaFisica);
					lCarrinho.add(carrinho);
					
					
				}
			}
		}

		return lCarrinho;
		//

	}
}