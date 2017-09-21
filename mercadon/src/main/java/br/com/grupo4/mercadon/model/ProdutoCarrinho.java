package br.com.grupo4.mercadon.model;

public class ProdutoCarrinho {

	//ATRIBUTO:
	private Produto produto;
	private Carrinho carrinho;
	
	
	//MÉTODO CONTRUTOR:
	public ProdutoCarrinho(Produto produto, Carrinho carrinho) {
		super();
		this.produto = produto;
		this.carrinho = carrinho;
	}
	
	
	public ProdutoCarrinho() {
		// TODO Auto-generated constructor stub
	}


	//GETTER E SETTER:
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}	
}
