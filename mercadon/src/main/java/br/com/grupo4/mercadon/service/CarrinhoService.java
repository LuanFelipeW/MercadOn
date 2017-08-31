package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.grupo4.mercadon.DAO.CarrinhoDAO;
import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.Carrinho;
import br.com.grupo4.mercadon.model.Produto;

public class CarrinhoService {

	//Metodo para listar todas as categorias
	public List<Carrinho> listarSubCategorias() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CarrinhoDAO(con).lista();
		}
	}
	//Metodo para buscar todas as categorias --- arrumar
	public List<Carrinho> buscarSubCategoria() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CarrinhoDAO(con).lista();
            
}
}
	
	//Metodo para inserir produtos no carrinho --- arrumar
     public void inserir(Produto produto) throws SQLException{
   		try (Connection con = new ConnectionPoolOracle().getConnection()) {
   			definirProduto(produto);
        		new CarrinhoDAO(con).inserir(produto);
        		}
        	}
     
     //Em Andamento
/* 	private void definirProduto(Produto produto) throws SQLException {
		List<Produto> lProduto = new ProdutoService().listarProdutos();
		for (Produto produto : lProduto) {
			String prod = pessoa.getDtNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			if((dtNascimento.getMonthValue() == signo.getMesInicial() && dtNascimento.getDayOfMonth() >= signo.getDiaInicial())
					|| (dtNascimento.getMonthValue() == signo.getMesFinal() && dtNascimento.getDayOfMonth() <= signo.getDiaFinal())){
				pessoa.setSigno(signo);
				break;
			}
		}
	}*/
	
		
	
}
  