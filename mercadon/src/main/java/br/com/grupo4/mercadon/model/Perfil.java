package br.com.grupo4.mercadon.model;

public class Perfil {

	//ATRIBUTOS:
	private Integer codigo;
	private String tipoPerfil;
	
	
	//MÉTODO CONSTRUTOR:
	public Perfil(Integer codigo, String tipoPerfil) {
		super();
		this.codigo = codigo;
		this.tipoPerfil = tipoPerfil;
	}
	
	
	//GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTipoPerfil() {
		return tipoPerfil;
	}
	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}	
}
