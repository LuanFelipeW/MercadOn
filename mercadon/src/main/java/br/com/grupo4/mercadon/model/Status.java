package br.com.grupo4.mercadon.model;

public class Status {

	
	//ATRIBUTOS:
	private Integer codigo;
	private String tipoStatus;
	
	
	//MÉTODO CONSTRUTOR:
	public Status(Integer codigo, String tipoStatus) {
		super();
		this.codigo = codigo;
		this.tipoStatus = tipoStatus;
	}

	
	//GETTER E SETTER:
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTipoStatus() {
		return tipoStatus;
	}
	public void setTipoStatus(String tipoStatus) {
		this.tipoStatus = tipoStatus;
	}	
}
