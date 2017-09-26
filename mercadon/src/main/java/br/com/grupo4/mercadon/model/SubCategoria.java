package br.com.grupo4.mercadon.model;

public class SubCategoria {
	// ATRIBUTOS
	private Integer codigo;
	private Categoria categoria;
	private String nome;

	// MÉTODO CONSTRUTOR
	public SubCategoria(Integer codigo, Categoria categoria, String nome) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.nome = nome;
	}
	
	

	// GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
