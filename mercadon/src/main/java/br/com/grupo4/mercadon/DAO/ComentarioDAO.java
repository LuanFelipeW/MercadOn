package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Comentario;
import br.com.grupo4.mercadon.model.PessoaJuridica;
import br.com.grupo4.mercadon.model.Produto;


public class ComentarioDAO {
	
private final Connection conn;
	
	public ComentarioDAO(Connection con) {
		this.conn = con;
	}
	public boolean inserir(Comentario comentario) throws SQLException{
		String sql = "INSERT INTO COMENTARIO (COM_CODIGO, COM_COMENTARIO, COM_AVALIACAO, COM_DATA, COM_NOME, COM_PESSOAJURIDICA, COM_PRODUTO) VALUES (SEQ_COMENTARIO.nextval, ?, ?, ?, ? ,? ,?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, comentario.getComentario());
		statement.setInt(2, comentario.getAvaliacao());
		statement.setDate(3, new Date(comentario.getData().getTime()));
		statement.setString(4, comentario.getNome());
		statement.setInt(5, comentario.getMercado().getCodigo());
		statement.setInt(6, comentario.getProduto().getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE COMENTARIO WHERE COM_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}

	public List<Comentario> lista() throws SQLException {
		List<Comentario> lComentario = new ArrayList<>();

		String sql = "SELECT CMT.COM_CODIGO, CMT.COM_COMENTARIO, CMT.COM_AVALIACAO, CMT.COM_DATA, CMT.COM_NOME";
		sql += "PJ.PEJ_CODIGO, PJ.PEJ_NOMEFANTASIA";
		sql += "PRDT.PRO_CODIGO, PRDT.PRO_NOME";
		sql += " FROM COMENTARIO CMT ";
		sql += " INNER JOIN PESSOAJURIDICA PJ ON (CMT.COM_PESSOAJURIDICA = PJ.PEJ_CODIGO) ";
		sql += "INNER JOIN PRODUTO PRDT ON(CMT.COM_PRODUTO = PRDT.PRO_CODIGO)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt(1);
					String comentarioe = rs.getString(2);
					int avaliacao = rs.getInt(3);
					Date data = rs.getDate(4);
					String nomeCliente =  rs.getString(5);
					
					int codigoJuridico = rs.getInt(6);
					String nomeJuridico = rs.getString(7);
					
					int codigoProduto = rs.getInt(8);
					String nomeProduto = rs.getString(9);
					
					PessoaJuridica pessoaJuridica = new PessoaJuridica(codigoJuridico, nomeJuridico);
					Produto produto = new Produto(codigoProduto,nomeProduto);
					Comentario comentario = new Comentario(codigo,comentarioe, avaliacao, data,nomeCliente,pessoaJuridica,produto);
					lComentario.add(comentario);					
					
				}
			}
		}

		return lComentario;
		

	}
}


