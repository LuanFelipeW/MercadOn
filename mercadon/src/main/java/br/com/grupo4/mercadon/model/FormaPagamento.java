package br.com.grupo4.mercadon.model;

public class FormaPagamento {

	private Integer codigo;
	private String tipoPagamento;
	private Pedido pedido;
	
	
	//MÉTODO CONSTRUTOR:
	public FormaPagamento(Integer codigo, String tipoPagamento, Pedido pedido) {
		super();
		this.codigo = codigo;
		this.tipoPagamento = tipoPagamento;
		this.pedido = pedido;
	}
	

	//GETTER E  SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}	
}
