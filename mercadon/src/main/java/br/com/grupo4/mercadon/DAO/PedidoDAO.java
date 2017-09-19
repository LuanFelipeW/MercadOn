package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Carrinho;
import br.com.grupo4.mercadon.model.Pedido;
import br.com.grupo4.mercadon.model.PessoaFisica;
import br.com.grupo4.mercadon.model.Status;

public class PedidoDAO {
private final Connection conn;
	

	public PedidoDAO(Connection con) {
		this.conn = con;
	}
	
	public boolean inserir(Pedido pedido) throws SQLException{
		String sql = "INSERT INTO PEDIDO (PED_CODIGO, PED_STATUS, PED_VALOR, PED_CARRINHO) VALUES (SEQ_PEDIDO.nextval, ?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, pedido.getStatus().getTipoStatus());
		statement.setDouble(2, pedido.getValorTotal());
		statement.setInt(3, pedido.getCarrinho().getCodigo());
		
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE PEDIDO WHERE PED_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	
	public List<Pedido> lista() throws SQLException {
		List<Pedido> lPedido = new ArrayList<>();

		String sql = "SELECT PED.PED_CODIGO, PED.PED_STATUS, PED.PED_VALOR ";
		sql += " FROM PEDIDO PED ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					int codigoStatus = rs.getInt(2);
					String tipoStatus = rs.getString(3);
					double valorTotal = rs.getDouble(4);
					int codigoCarrinho = rs.getInt(5);
					double precoTotal = rs.getDouble(6);
					Status status = new Status(codigoStatus, tipoStatus);
					Carrinho carrinho = new Carrinho(codigoCarrinho,precoTotal);
					Pedido pedido = new Pedido(codigo, status, valorTotal,carrinho);
					lPedido.add(pedido);
					
				}
			}
		}
		return lPedido;
	}
	
}
