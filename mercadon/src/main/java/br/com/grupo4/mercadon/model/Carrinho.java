package br.com.grupo4.mercadon.model;

import java.util.Set;

public class Carrinho {

	// ATRIBUTOS:
	private Integer codigo;
	private Integer quantidade;
	private Double precoTotal;
	private PessoaFisica pessoaFisica;

	private Set<ProdutoCarrinho> setProdutosCarrinhos;

	// MÉTODO CONSTRUTOR:
	public Carrinho(Integer codigo, Integer quantidade, Double precoTotal, PessoaFisica pessoaFisica) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.precoTotal = precoTotal;
		this.pessoaFisica = pessoaFisica;
	}

	public Carrinho() {

	}

	// GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public Set<ProdutoCarrinho> getSetProdutosCarrinhos() {
		return setProdutosCarrinhos;
	}

	public void setSetProdutosCarrinhos(Set<ProdutoCarrinho> setProdutosCarrinhos) {
		this.setProdutosCarrinhos = setProdutosCarrinhos;
	}

}
