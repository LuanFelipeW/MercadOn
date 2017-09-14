package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.SubCategoria;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.DAO.SubCategoriaDAO;


public class SubCategoriaService {
	DecimalFormat df = new DecimalFormat("#0.00");

	
	//Metodo para listar todas as subcategorias
	public List<SubCategoria> listarSubCategorias() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new SubCategoriaDAO(con).lista();
		}
	}
	//Metodo para buscar todas as subcategorias --- arrumar

	public List<SubCategoria> buscarSubCategorias() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new SubCategoriaDAO(con).lista();
		}
	}
	public void buscarSubCategoriaProdutos(Integer entrada) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Produto> produtos = new SubCategoriaDAO(con).listarProSub(entrada);
			for (Produto produto : produtos) {
				System.out.println(produto.getNome() +"\n"+ df.format((produto.getPreco())));
}
}
}
}
}
