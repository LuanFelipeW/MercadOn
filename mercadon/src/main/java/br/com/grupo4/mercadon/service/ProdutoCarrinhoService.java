package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.grupo4.mercadon.DAO.CarrinhoDAO;
import br.com.grupo4.mercadon.DAO.ProdutoCarrinhoDAO;
import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.ProdutoCarrinho;

public class ProdutoCarrinhoService {
	
	
    public void inserirProduto(ProdutoCarrinho procarrinho) throws SQLException{
  		try (Connection con = new ConnectionPoolOracle().getConnection()) {
       		new ProdutoCarrinhoDAO(con).inserirProdutoCarrinho(procarrinho);
       		}
       	}
    
}
