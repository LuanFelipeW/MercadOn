package br.com.grupo4.mercadon.model;

public class Categoria {
	
	// ATRIBUTOS
	private Integer codigo;
	private String nome;
	

	// MÉTODO CONSTRUTOR
	public Categoria(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Categoria(String nomeCategoria) {
		super();
		this.nome = nomeCategoria;
	}

	
	// GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
