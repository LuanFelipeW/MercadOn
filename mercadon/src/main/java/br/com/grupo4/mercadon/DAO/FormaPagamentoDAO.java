package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.FormaPagamento;
import br.com.grupo4.mercadon.model.Pedido;


public class FormaPagamentoDAO {
	
private final Connection conn;
	
	public FormaPagamentoDAO(Connection con) {
		this.conn = con;
	}
	public boolean inserir(FormaPagamento frmpagamento) throws SQLException{
		String sql = "INSERT INTO FORMAPAGAMENTO (FOR_CODIGO, FOR_PAGAMENTO, FOR_PEDIDO) VALUES (SEQ_COMENTARIO.nextval, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, frmpagamento.getTipoPagamento());
		statement.setInt(2, frmpagamento.getPedido().getCodigo());
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int codigo, String frmPagamento) throws SQLException {
		String sql = "UPDATE FORMAPAGAMENTO SET FOR_PAGAMENTO = ? WHERE FOR_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, frmPagamento);
		statement.setInt(2, codigo);
		
		return statement.executeUpdate() > 0;
	}
	
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE FORMAPAGAMENTO WHERE FOR_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<FormaPagamento> lista() throws SQLException {
		List<FormaPagamento> lComentario = new ArrayList<>();

		String sql = "SELECT FRMPGTO.FOR_CODIGO, FRMPGTO.FOR_PAGAMENTO";
		sql += "PD.PED_CODIGO, PD.PED_VALOR";
		sql += " FROM FORMAPAGAMENTO FRMPGTO";
		sql += " INNER JOIN PEDIDO PD ON (FRMPGTO.FOR_PEDIDO = PD.PED_CODIGO)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					String formaPagamento = rs.getString(2);
					
					int codigoPedido = rs.getInt(3);
					Double valorTotal = rs.getDouble(4);
					
					Pedido pedido = new Pedido(codigoPedido, valorTotal);
					FormaPagamento frmPagamento = new FormaPagamento(codigo,formaPagamento, pedido);
					lComentario.add(frmPagamento);					
					
				}
			}
		}

		return lComentario;
		

	}
}

