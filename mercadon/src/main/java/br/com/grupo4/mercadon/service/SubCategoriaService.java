package br.com.grupo4.mercadon.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.grupo4.mercadon.jdbc.oracle.ConnectionPoolOracle;
import br.com.grupo4.mercadon.model.SubCategoria;
import br.com.grupo4.mercadon.DAO.SubCategoriaDAO;


public class SubCategoriaService {

	
	//Metodo para listar todas as subcategorias
	public List<SubCategoria> listarSubCategorias() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new SubCategoriaDAO(con).lista();
		}
	}
	//Metodo para buscar todas as subcategorias --- arrumar
	public List<SubCategoria> buscarSubCategoria() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new SubCategoriaDAO(con).lista();
            
}
}
}
