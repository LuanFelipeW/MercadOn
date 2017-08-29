package br.com.grupo4.mercadon.model;

public class HistoricoDeCompras {
	// ATRIBUTO
	private Integer codigo;
	private Pedido pedido;

	// MÉTODO CONSTRUTOR
	public HistoricoDeCompras(Integer codigo, Pedido pedido) {
		super();
		this.codigo = codigo;
		this.pedido = pedido;
	}

	// GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
