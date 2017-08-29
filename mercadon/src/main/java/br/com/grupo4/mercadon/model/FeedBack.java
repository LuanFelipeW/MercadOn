package br.com.grupo4.mercadon.model;

import java.util.Date;

public class FeedBack {
	//ATRIBUTO
	private Integer codigo;
	private String comentario;
	private Integer avaliacao;
	private Date data;
	private String nome;
	private PessoaJuridica mercado;
	private Produto produto;
	
	//MÉTODO CONSTRUTOR	
	public FeedBack(Integer codigo, String comentario, Integer avaliacao, Date data, String nome,
			PessoaJuridica mercado, Produto produto) {
		super();
		this.codigo = codigo;
		this.comentario = comentario;
		this.avaliacao = avaliacao;
		this.data = data;
		this.nome = nome;
		this.mercado = mercado;
		this.produto = produto;
	}

	
	//GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PessoaJuridica getMercado() {
		return mercado;
	}

	public void setMercado(PessoaJuridica mercado) {
		this.mercado = mercado;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
