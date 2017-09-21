package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.grupo4.mercadon.DAO.CarrinhoDAO;
import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.Carrinho;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.model.ProdutoCarrinho;

public class CarrinhoService {

	//Metodo para adicionar carrinhos --- arrumar
     public void inserirProduto(ProdutoCarrinho procarrinho) throws SQLException{
   		try (Connection con = new ConnectionPoolOracle().getConnection()) {
        		new CarrinhoDAO(con).inserirProdutoCarrinho(procarrinho);
        		}
        	}
     
     //Em Andamento
    /* public void produtoCarrinho(Produto produto) throws SQLException{
    		try (Connection con = new ConnectionPoolOracle().getConnection()) {
    			definirProduto(produto);
         		new CarrinhoDAO(con).produtoCarrinho(produto);
			}
		}
	}*/
     
     //Metodo para apagar todos os itens do carrinho
     public void apagar(Carrinho carrinho) throws SQLException{
    	 
    	 
     }
     	
		
	
}
  