package br.com.grupo4.mercadon.model;

public class MercadoFavoritos {
	// ATRIBUTO
	private PessoaJuridica mercado;
	private Favoritos favoritos;

	// MÉTODO CONSTRUTOR
	public MercadoFavoritos(PessoaJuridica mercado, Favoritos favoritos) {
		super();
		this.mercado = mercado;
		this.favoritos = favoritos;
	}

	// GETTER E SETTER
	public PessoaJuridica getMercado() {
		return mercado;
	}

	public void setMercado(PessoaJuridica mercado) {
		this.mercado = mercado;
	}

	public Favoritos getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(Favoritos favoritos) {
		this.favoritos = favoritos;
	}

}
