package br.com.grupo4.mercadon.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.grupo4.mercadon.model.PessoaJuridica;

public class PessoaJuridicaDAO {

	private final Connection conn;

	public PessoaJuridicaDAO(Connection con) {
		this.conn = con;
	}

	public boolean inserir(PessoaJuridica pessoaJuridica) throws SQLException {
		String sql = "INSERT INTO PESSOAJURIDICA (PEJ_CODIGO, PEJ_NOMEFANTASIA, PEJ_RAZAOSICOAL, PEJ_CNPJ) VALUES (SEQ_PESSOAJURIDICA.nextval, ?, ?, ?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, pessoaJuridica.getNomeFantasia());
		statement.setString(2, pessoaJuridica.getRazaoSocial());
		statement.setString(3, pessoaJuridica.getCnpj());

		return statement.executeUpdate() > 0;
	}

	public boolean apagar(Integer codigo) throws SQLException {
		String sql = "DELETE PESSOAJURIDICA WHERE PEJ_CODIGO = ?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, codigo);

		return statement.executeUpdate() > 0;
	}
	//

	public List<PessoaJuridica> listaPessoaFisica() throws SQLException {
		List<PessoaJuridica> lPessoaJuridica = new ArrayList<>();

		String sql = "SELECT PJ.PEJ_CODIGO, PJ.PEJ_NOMEFANTASIA, PJ.PEJ_RAZAOSOCAIL, PJ.PEJ_CNPJ";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int codigo = rs.getInt(1);
					String nomeFantasia = rs.getString(2);
					String razaoSocial = rs.getString(3);
					String cnpj = rs.getString(4);

					PessoaJuridica pessoaJuridica = new PessoaJuridica(codigo, nomeFantasia, razaoSocial, cnpj);
					lPessoaJuridica.add(pessoaJuridica);

				}
			}
		}
		return lPessoaJuridica;
	}

}