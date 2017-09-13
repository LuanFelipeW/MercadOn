package testes;

import java.sql.SQLException;

import br.com.grupo4.mercadon.service.CategoriaService;

public class teste {
public static void main(String[] args) throws SQLException{
	
	CategoriaService cat = new CategoriaService();
	
	cat.buscarSubCategoriaProdutos(60);
	
	
}
}
