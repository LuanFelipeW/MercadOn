package testes;

import java.sql.SQLException;

import br.com.grupo4.mercadon.model.Carrinho;
import br.com.grupo4.mercadon.model.Produto;
import br.com.grupo4.mercadon.model.ProdutoCarrinho;
import br.com.grupo4.mercadon.service.CarrinhoService;
import br.com.grupo4.mercadon.service.CategoriaService;
import br.com.grupo4.mercadon.service.ProdutoCarrinhoService;
import br.com.grupo4.mercadon.service.ProdutoService;
import br.com.grupo4.mercadon.service.SubCategoriaService;

public class teste {
	public static void main(String[] args) throws SQLException {

		/*SubCategoriaService scat = new SubCategoriaService();
		scat.buscarSubCategoriaProdutos(60);

		System.out.println("|-----------------------------------------------------------------|");

		CategoriaService cat = new CategoriaService();
		cat.buscarCategoriaProdutos(1);*/
		
		/*System.out.println("|-----------------------------------------------------------------|");

		ProdutoService pros = new ProdutoService();
		pros.buscarListaProduto("bolo");
		
		pros.filtrosProduto(1);
		pros.filtrosProduto(4);*/
		
		
		Produto pro = new Produto(1,"bla");
		Carrinho car = new Carrinho(10,10d);
		ProdutoCarrinho proc = new ProdutoCarrinho(pro,car);

		ProdutoCarrinhoService cars = new ProdutoCarrinhoService();
		cars.inserirProduto(proc);

		System.out.println("|-----------------------------------------------------------------|");

	}
}








