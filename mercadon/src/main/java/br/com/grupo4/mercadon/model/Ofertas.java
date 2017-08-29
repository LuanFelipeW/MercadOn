package br.com.grupo4.mercadon.model;

import java.util.Date;

public class Ofertas {
	// ATRIBUTOS
	private Integer codigo;
	private Double preco;
	private Date tempo;

	// MÉTODO CONSTRUTOR
	public Ofertas(Integer codigo, Double preco, Date tempo) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.tempo = tempo;
	}

	// GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getTempo() {
		return tempo;
	}

	public void setTempo(Date tempo) {
		this.tempo = tempo;
	}

}
