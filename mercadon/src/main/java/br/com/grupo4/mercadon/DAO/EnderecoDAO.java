package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.grupo4.mercadon.model.Endereco;
import br.com.grupo4.mercadon.model.PessoaFisica;
import br.com.grupo4.mercadon.model.PessoaJuridica;

public class EnderecoDAO {


private final Connection conn;
	

	public EnderecoDAO(Connection con) {		
		this.conn = con;
	}
	
	
	public boolean inserir(Endereco endereco) throws SQLException{
		String sql = "INSERT INTO ENDERECO (END_CODIGO, END_CEP, END_RUA, END_BAIRRO, END_NUMERO, END_CIDADE, END_ESTADO, END_TELEFONE, END_COMPLEMENTO, END_PESSOAJURIDICA, END_PESSOAFISICA) VALUES (SEQ_ENDERECO.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, endereco.getCep());
		statement.setString(2, endereco.getRua());
		statement.setString(3, endereco.getBairro());
		statement.setString(4, endereco.getNumero());
		statement.setString(5, endereco.getCidade());
		statement.setString(6, endereco.getEstado());
		statement.setString(7, endereco.getTelefone());
		statement.setString(8, endereco.getComplemento());
		statement.setInt(9, endereco.getPessoaJuridica().getCodigo());
		statement.setInt(10, endereco.getPessoaFisica().getCodigo());
		 
		return statement.executeUpdate() > 0;
	}
	
	
	public boolean apagar(Integer codigo) throws SQLException{
		String sql = "DELETE ENDERECO WHERE END_CODIGO = ?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);
		 
		return statement.executeUpdate() > 0;
	}
	

	public List<Endereco> listaPessoaFisica() throws SQLException {
		List<Endereco> lEndereco = new ArrayList<>();

		String sql = "SELECT END.END_CODIGO, END.END_CEP, END.END_RUA, END.END_BAIRRO, END.END_NUMERO, END.END_CIDADE, END.END_ESTADO, END.END_TELEFONE, END.END_COMPLEMENTO, END.END_PESSOAFISICA";
		sql += "PF.PEF_NOME, PF.PEF_SOBRENOME, PF.PEF_EMAIL, PF.PEF_DATANASC, PF.PEF_SEXO";
		sql += " FROM ENDERECO END ";
		sql += " INNER JOIN PESSOAFISICA PF ON (END.END_PESSOAFISICA = PF.PEF_CODIGO) ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigo = rs.getInt(1);
					String cep = rs.getString(2);
					String rua = rs.getString(3);
					String bairro = rs.getString(4);
					String numero = rs.getString(5);
					String cidade = rs.getString(6);
					String estado = rs.getString(7);
					String telefone = rs.getString(8);
					String complemento = rs.getString(9);
					int pessoaFisica = rs.getInt(10);
					
					String nome = rs.getString(11);
					String sobrenome = rs.getString(12);
					String email = rs.getString(13);
					Date dataNasc = rs.getDate(14);
					String sexo = rs.getString(15);
					

					PessoaFisica pessoaFisica2 = new PessoaFisica(pessoaFisica, nome, sobrenome, email, dataNasc, sexo);
					Endereco endereco = new Endereco(codigo, cep, rua, bairro, numero, cidade, estado, telefone, complemento, pessoaFisica2);
					lEndereco.add(endereco);
				}
			}
		}
		return lEndereco;
	}
	
	public List<Endereco> listaPessoaJuridica() throws SQLException {
		List<Endereco> lEndereco = new ArrayList<>();

		String sql = "SELECT END.END_CODIGO, END.END_CEP, END.END_RUA, END.END_BAIRRO, END.END_NUMERO, END.END_CIDADE, END.END_ESTADO, END.END_TELEFONE, END.END_PESSOAJURIDICA ";
		sql += "PJ.PEJ_NOMEFANTASIA, PJ.PEJ_RAZAOSOCIAL, PJ.PEJ_CNPJ";
		sql += " FROM ENDERECO END ";
		sql += " INNER JOIN PESSOAJURIDICA PJ ON (END.END_PESSOAJURIDICA = PJ.PEJ_CODIGO) ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					
					int codigo = rs.getInt(1);
					String cep = rs.getString(2);
					String rua = rs.getString(3);
					String bairro = rs.getString(4);
					String numero = rs.getString(5);
					String cidade = rs.getString(6);
					String estado = rs.getString(7);
					String telefone = rs.getString(8);
					int pessoaJuridica = rs.getInt(9);
					
					String nomeFantasia = rs.getString(10);
					String razaoSocial = rs.getString(11);
					String cnpj = rs.getString(12);

					
					PessoaJuridica pessoaJuridica2  = new PessoaJuridica(pessoaJuridica, nomeFantasia, razaoSocial, cnpj);
					Endereco endereco = new Endereco(codigo, cep, rua, bairro, numero, cidade, estado, telefone, pessoaJuridica2);
					lEndereco.add(endereco);
				}
			}
		}
		return lEndereco;
	}
}
