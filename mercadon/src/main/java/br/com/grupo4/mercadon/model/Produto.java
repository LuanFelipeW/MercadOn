package br.com.grupo4.mercadon.model;

import java.util.Date;

public class Produto {
	// ATRIBUTOS
	private Integer codigo;
	private String nome;
	private String marca;
	private String fabricante;
	private SubCategoria subCategoria;
	private Double preco;
	private Date dataValidade;
	private Date dataFabricacao;
	private PessoaJuridica mercado;
	private Ofertas ofertas;

	// MÉTODO CONSTRUTOR
	public Produto(Integer codigo, String nome, String marca, String fabricante, SubCategoria subCategoria,
			Double preco, Date dataValidade, Date dataFabricacao, PessoaJuridica mercado, Ofertas ofertas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.fabricante = fabricante;
		this.subCategoria = subCategoria;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.mercado = mercado;
		this.ofertas = ofertas;
	}
	
	// GETTER E SETTER
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public SubCategoria getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(SubCategoria subCategoria) {
		this.subCategoria = subCategoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public PessoaJuridica getMercado() {
		return mercado;
	}

	public void setMercado(PessoaJuridica mercado) {
		this.mercado = mercado;
	}

	public Ofertas getOfertas() {
		return ofertas;
	}

	public void setOfertas(Ofertas ofertas) {
		this.ofertas = ofertas;
	}

}
