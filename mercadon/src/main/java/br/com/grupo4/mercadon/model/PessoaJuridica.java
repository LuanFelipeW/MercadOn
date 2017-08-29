package br.com.grupo4.mercadon.model;

public class PessoaJuridica {
	
	//ATRIBUTOS:
	private Integer codigo;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	
	//MÉTODO CONSTRUTOR:
	public PessoaJuridica(Integer codigo, String nomeFantasia, String razaoSocial, String cnpj) {
		super();
		this.codigo = codigo;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	
	//GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
