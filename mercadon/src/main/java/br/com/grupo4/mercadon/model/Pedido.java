package br.com.grupo4.mercadon.model;

public class Pedido {

	//ATRIBUTOS:
	private Integer codigo;
	private Status status;
	private Double valorTotal;
	private Carrinho carrinho;
	
	
	//MÉTODO CONSTRUTOR:
	public Pedido(Integer codigo, Status status, Double valorTotal, Carrinho carrinho) {
		super();
		this.codigo = codigo;
		this.status = status;
		this.valorTotal = valorTotal;
		this.carrinho = carrinho;
	}
	
		
	
	public Pedido(int codigoPedido, Double valorTotal2) {
		
		this.codigo = codigoPedido;
		this.valorTotal = valorTotal2;
		
	}


	//GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}	
}
