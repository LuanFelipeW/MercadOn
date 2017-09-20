package testes;

import java.sql.SQLException;

import br.com.grupo4.mercadon.service.CategoriaService;
import br.com.grupo4.mercadon.service.ProdutoService;
import br.com.grupo4.mercadon.service.SubCategoriaService;

public class teste {
	public static void main(String[] args) throws SQLException {

		/*SubCategoriaService scat = new SubCategoriaService();
		scat.buscarSubCategoriaProdutos(60);

		System.out.println("|-----------------------------------------------------------------|");

		CategoriaService cat = new CategoriaService();
		cat.buscarCategoriaProdutos(1);*/
		
		System.out.println("|-----------------------------------------------------------------|");

		ProdutoService pros = new ProdutoService();
		//pros.buscarListaProduto("bolo");
		
<<<<<<< HEAD
		pros.filtrosProduto(1);
=======
		pros.filtrosProduto(4);
>>>>>>> branch 'master' of https://github.com/LuanFelipeW/MercadOn.git

	}
}
