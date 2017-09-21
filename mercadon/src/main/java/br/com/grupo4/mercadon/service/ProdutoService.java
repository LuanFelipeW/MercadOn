package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;

import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.DAO.ProdutoDAO;
import br.com.grupo4.mercadon.DAO.SubCategoriaDAO;;

public class ProdutoService {
	DecimalFormat df = new DecimalFormat("#0.00");

	/*
	 * // metodo listagem de Produtos - como Filtro public List<Produto>
	 * listarProdutos() throws SQLException { try (Connection con = new
	 * ConnectionPoolOracle().getConnection()) { return new ProdutoDAO(con).lista();
	 * } }
	 */

	// metodo busca de Produtos - como Pesquisa
	public void buscarListaProduto(String entrada) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Produto> produtos = new ProdutoDAO(con).buscarListaProduto(entrada);
			for (Produto produto : produtos) {
				System.out.println(produto.getNome() + "\n" + df.format((produto.getPreco())));

			}
		}
	}

	public void filtrosProduto(Integer entrada) throws SQLException {
		String SQLcode = "";
		switch (entrada) {
		case 1:
			SQLcode = " PRO_NOME ASC ";
			break;
		case 2:
			SQLcode = " PRO_NOME DESC ";
			break;
		case 3:
			SQLcode = " PRO_PRECO ASC ";
			break;
		case 4:
			SQLcode = " PRO_PRECO DESC ";
			break;
		}	
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
				List<Produto> produtos = new ProdutoDAO(con).filtrarProduto(SQLcode);
				for (Produto produto : produtos) {
					System.out.println(produto.getNome() + "\n" + df.format((produto.getPreco())));
				}
			}
		}
	}

