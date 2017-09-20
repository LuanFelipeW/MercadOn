package br.com.grupo4.mercadon.model;

public class ProdutoCarrinho {

	//ATRIBUTO:
	private Integer produto;
	private Integer carrinho;
	
	
	//MÉTODO CONTRUTOR:
	public ProdutoCarrinho(Integer produto, Integer carrinho) {
		super();
		this.produto = produto;
		this.carrinho = carrinho;
	}
	
	
	public ProdutoCarrinho() {
		// TODO Auto-generated constructor stub
	}


	//GETTER E SETTER:
	public Integer getProduto() {
		return produto;
	}
	public void setProduto(Integer produto) {
		this.produto = produto;
	}
	public Integer getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Integer carrinho) {
		this.carrinho = carrinho;
	}	
}
