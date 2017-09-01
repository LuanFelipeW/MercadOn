package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Carrinho;
import br.com.grupo4.mercadon.model.HistoricoDeCompras;
import br.com.grupo4.mercadon.model.Pedido;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.model.ProdutoCarrinho;

public class HistoricoDeComprasDAO {
	
private final Connection conn;
	
	public HistoricoDeComprasDAO(Connection con) {
		this.conn = con;
	}
	public boolean inserir(HistoricoDeCompras hCompras) throws SQLException{
		String sql = "INSERT INTO HISTORICODECOMPRAS (HDC_CODIGO, HDC_PEDIDO) VALUES (SEQ_HISTORICODECOMPRAS.nextval, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, hCompras.getPedido().getCodigo());
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int codigo, String nome) throws SQLException {
		String sql = "UPDATE HISTORICODECOMPRAS SET HDC_PEDIDO = ? WHERE HDC_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, codigo);
		
		return statement.executeUpdate() > 0;
	}
	
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE HISTORICODECOMPRAS WHERE HDC_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<HistoricoDeCompras> lista() throws SQLException {
		List<HistoricoDeCompras> lComentario = new ArrayList<>();

		String sql = "SELECT HC.HDC_CODIGO";
		sql += "PD.PED_CODIGO, PD.PED_CARRINHO, PD.PED_VALOR";
		sql += " FROM HISTORICODECOMPRAS HC";
		sql += " INNER JOIN PEDIDO PD ON (HC.HDC_PEDIDO = PD.PED_CODIGO)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					
					int codigoPedido = rs.getInt(2);
					//String carrinho = rs.getString(3);
					Double valorTotal = rs.getDouble(4);
					
					Produto produto = new Produto();
					
					Carrinho carrinho = new Carrinho();
					
					ProdutoCarrinho = new ProdutoCarrinho(produto, carrinho);
					
					
					Pedido pedido = new Pedido(codigoPedido, carrinho, valorTotal);
					
					
					HistoricoDeCompras frmPagamento = new HistoricoDeCompras(codigo, pedido);
					
					
					lComentario.add(frmPagamento);				
					
				}
			}
		}

		return lComentario;
		

	}
}