package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.Usuario;

public class UsuarioDAO {
	
private final Connection conn;
	

	public UsuarioDAO(Connection con) {
		this.conn = con;
	}
	
	public boolean inserir(Usuario usuario) throws SQLException{
		String sql = "INSERT INTO USUARIO (USU_CODIGO, USU_USUARIO, USU_SENHA, USU_PESSOAFISICA, USU_PERFIL) VALUES (SEQ_USUARIO.nextval, ?, ?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, usuario.getUsuario());
		statement.setString(2, usuario.getSenha());
		statement.setInt(3, usuario.getPessoaFisica().getCodigo());
		statement.setInt(4, usuario.getPerfil().getCodigo()); 
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE USUARIO WHERE USU_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	

	public List<Usuario> lista() throws SQLException {
		List<Usuario> lUsuario = new ArrayList<>();

		String sql = "SELECT US.USU_CODIGO, US.USU_USUARIO, US.USU_SENHA, US.USU_PESSOAFISICA, US.USU_PERFIL";
		sql += "PF.PEF_NOME, PF.PEF_SOBRENOME, PF.PEF_EMAIL";
		sql += "PE.PER_TIPO";
		sql += " FROM USUARIO US ";
		sql += " INNER JOIN PESSOAFISICA PF ON (US.USU_CODIGO = PF.PEF_CODIGO) ";
		sql += " INNER JOIN PERFIL PE ON (US.USU_PERFIL = PE.PER_CODIGO)";
		
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigo = rs.getInt(1);
					String usuario = rs.getString(2);
					String senha = rs.getString(3);
					
					int codigoPF =  rs.getInt(4);
					String nome = rs.getString(6);
					String sobrenome = rs.getString(7);
					String email = rs.getString(8);
					
					int codigoPER = rs.getInt(5);
					String tipoPer = rs.getString(9);
					
					
					PessoaFisica pessoaFisica = new PessoaFisica(codigoPf,nomeCliente);
					Carrinho carrinho = new Carrinho(codigo, quantidade, valorTotal,pessoaFisica);
					lCarrinho.add(carrinho);
					
				}
			}
		}
		return lUsuario;
	}
}
}
