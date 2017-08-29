package br.com.grupo4.mercadon.model;

public class Usuario {

	//ATRIBUTOS:
	private Integer codigo;
	private String usuario;
	private String senha;
	private PessoaFisica pessoaFisica;
	private Perfil perfil;
	
	
	//MÉTODO CONSTRUTOR:
	public Usuario(Integer codigo, String usuario, String senha, PessoaFisica pessoaFisica, Perfil perfil) {
		super();
		this.codigo = codigo;
		this.usuario = usuario;
		this.senha = senha;
		this.pessoaFisica = pessoaFisica;
		this.perfil = perfil;
	}
	
	
	//GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}	
}
