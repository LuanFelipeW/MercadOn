package br.com.mercadon.mercadon.model;

import java.util.Date;

public class PessoaFisica {
	// ATRIBUTOS
	private Integer codigo;
	private String nome;
	private String sobrenome;
	private String email;
	private Date dataNasc;
	private String sexo;
	private PessoaJuridica pessoaJuridica;

	// MÉTODO CONSTRUTOR
	public PessoaFisica(Integer codigo, String nome, String sobrenome, String email, Date dataNasc, String sexo,
			PessoaJuridica pessoaJuridica) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.pessoaJuridica = pessoaJuridica;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

}
