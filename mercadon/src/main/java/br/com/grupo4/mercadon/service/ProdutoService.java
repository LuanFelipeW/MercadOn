package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.DAO.ProdutoDAO;;

public class ProdutoService {


	//metodo listagem de Produtos - como Filtro
	public List<Produto> listarProdutos() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new ProdutoDAO(con).lista();
		}
	}
	//metodo busca de Produtos - como Pesquisa
	public List<Produto> buscarProdutos() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new ProdutoDAO(con).lista();
            
}
}
}