package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.PessoaFisica;
import br.com.grupo4.mercadon.model.PessoaJuridica;


public class PessoaFisicaDAO {

	
private final Connection conn;
	

	public PessoaFisicaDAO(Connection con) {
		this.conn = con;
	}
	
	
	public boolean inserir(PessoaFisica pessoaFisica) throws SQLException{
		String sql = "INSERT INTO PESSOAFISICA (PEF_CODIGO, PEF_NOME, PEF_SOBRENOME, PEF_EMAIL, PEF_DATANASC, PEF_SEXO) VALUES (SEQ_PESSOAFISICA.nextval, ?, ?, ?, ? ,?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, pessoaFisica.getNome());
		statement.setString(2, pessoaFisica.getSobrenome());
		statement.setString(3, pessoaFisica.getEmail());
		statement.setDate(4, new Date(pessoaFisica.getDataNasc().getTime()));
		statement.setString(5, pessoaFisica.getSexo());
		
		return statement.executeUpdate() > 0;
	}
	
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE PESSOAFISICA WHERE PEF_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	

	public List<PessoaFisica> listaPessoaFisica() throws SQLException {
		List<PessoaFisica> lPessoaFisica = new ArrayList<>();

		String sql = "SELECT PF.PEF_CODIGO, PF.PEF_NOME, PF.PEF_SOBRENOME, PF.PEF_EMAIL, PF.PEF_DATANASC, PF.PEF_SEXO";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigo = rs.getInt(1);
					String nome = rs.getString(2);
					String sobrenome = rs.getString(3);
					String email =  rs.getString(4);
					Date dataNasc = rs.getDate(5);
					String sexo = rs.getString(6);
					
					PessoaFisica pessoaFisica = new PessoaFisica(codigo, nome, sobrenome, email, dataNasc, sexo);
					lPessoaFisica.add(pessoaFisica);
					
				}
			}
		}
		return lPessoaFisica;
	}
	
	public List<PessoaFisica> listaPessoaJuridica() throws SQLException {
		List<PessoaFisica> lPessoaFisica = new ArrayList<>();

		String sql = "SELECT PF.PEF_CODIGO, PF.PEF_NOME, PF.PEF_SOBRENOME, PF.PEF_EMAIL, PF.PEF_DATANASC, PF.PEF_SEXO, PF.PEF_PESSOAJURIDICA";
		sql += "PJ.PEJ_NOMEFANTASIA, PJ.PEJ_RAZAOSOCIAL, PJ.PEJ_CNPJ";
		sql += "FROM PESSOAJURIDICA PJ";
		sql += "INNER JOIN PESSOAJURIDICA PJ ON (PF.PEF_PESSOAJURIDICA = PJ.PEJ_CODIGO)";
		
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigo = rs.getInt(1);
					String nome = rs.getString(2);
					String sobrenome = rs.getString(3);
					String email =  rs.getString(4);
					Date dataNasc = rs.getDate(5);
					String sexo = rs.getString(6);
					int codigoPJ = rs.getInt(7);
					String nomeFan = rs.getString(8);
					String razaosoc = rs.getString(9);
					String cnpj = rs.getString(10);
					
					PessoaJuridica pessoaJuridica = new PessoaJuridica(codigoPJ, nomeFan, razaosoc, cnpj);
					PessoaFisica pessoaFisica = new PessoaFisica(codigo, nome, sobrenome, email, dataNasc, sexo, pessoaJuridica);
					lPessoaFisica.add(pessoaFisica);
				}
			}
		}
		return lPessoaFisica;
	}
}
