package br.com.grupo4.mercadon.model;

public class Favoritos {
	// ATRIBUTO
	private Integer codigo;
	private HistoricoDeCompras historicoDeCompras;

	// MÉTODO CONSTRUTOR
	public Favoritos(Integer codigo, HistoricoDeCompras historicoDeCompras) {
		super();
		this.codigo = codigo;
		this.historicoDeCompras = historicoDeCompras;
	}

	// GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public HistoricoDeCompras getHistoricoDeCompras() {
		return historicoDeCompras;
	}

	public void setHistoricoDeCompras(HistoricoDeCompras historicoDeCompras) {
		this.historicoDeCompras = historicoDeCompras;
	}

}
