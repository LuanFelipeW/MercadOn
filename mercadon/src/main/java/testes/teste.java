package testes;

import java.sql.SQLException;

import br.com.grupo4.mercadon.service.CategoriaService;
import br.com.grupo4.mercadon.service.SubCategoriaService;

public class teste {
	public static void main(String[] args) throws SQLException {

		SubCategoriaService cat = new SubCategoriaService();
		cat.buscarSubCategoriaProdutos(60);

		
	/*	CategoriaService cat = new CategoriaService();

		cat.buscarCategoriaProdutos(1);*/

	}
}
