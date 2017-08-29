package br.com.grupo4.mercadon.model;

public class Endereco {

	//ATRIBUTOS:
	private Integer codigo;
	private String cep;
	private String rua;
	private String bairro;
	private String numero;
	private String cidade;
	private String estado;
	private String telefone;
	private String complemento;
	private PessoaJuridica pessoaJuridica;
	private PessoaFisica pessoaFisica;
	
	
	//MÉTODO CONSTRUTORs:
	public Endereco(Integer codigo, String cep, String rua, String bairro, String numero, String cidade, String estado,
			String telefone, String complemento, PessoaJuridica pessoaJuridica, PessoaFisica pessoaFisica) {
		super();
		this.codigo = codigo;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.complemento = complemento;
		this.pessoaJuridica = pessoaJuridica;
		this.pessoaFisica = pessoaFisica;
	}
	
	
	//GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}	
}
