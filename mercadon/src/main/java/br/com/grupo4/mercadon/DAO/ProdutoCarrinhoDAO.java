package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.grupo4.mercadon.model.ProdutoCarrinho;

public class ProdutoCarrinhoDAO {
	
private final Connection conn;
	

	public ProdutoCarrinhoDAO(Connection con) {
		this.conn = con;
	}
	
	
	public boolean inserirProdutoCarrinho(ProdutoCarrinho procarrinho) throws SQLException{
		String sql = "INSERT INTO PRODUTO_CARRINHO (PRC_PRODUTO, PRC_CARRINHO) VALUES (?,?)";
		
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, procarrinho.getProduto().getCodigo());
		statement.setInt(2, procarrinho.getCarrinho().getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
}
