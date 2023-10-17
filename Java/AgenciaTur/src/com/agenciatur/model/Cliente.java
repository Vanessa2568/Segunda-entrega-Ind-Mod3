package com.agenciatur.model;

public class Cliente {
	private int idCliente;
	private String tipoCliente;
	private String nomeCliente;
	private String cpfcnpjCliente;
	private String emailCliente;
	private String enderecoCliente;
	private String telefoneCliente;
	private String formaPgto;
	
		
	public Cliente() {
		super();
		
	}

	public Cliente(String tipoCliente, String nomeCliente, String cpfcnpjCliente, String emailCliente,
			String enderecoCliente, String telefoneCliente, String formaPgto) {
		super();
		this.tipoCliente = tipoCliente;
		this.nomeCliente = nomeCliente;
		this.cpfcnpjCliente = cpfcnpjCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.telefoneCliente = telefoneCliente;
		this.formaPgto = formaPgto;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfcnpjCliente() {
		return cpfcnpjCliente;
	}

	public void setCpfcnpjCliente(String cpfcnpjCliente) {
		this.cpfcnpjCliente = cpfcnpjCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public String getFormaPgto() {
		return formaPgto;
	}

	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", tipoCliente=" + tipoCliente + ", nomeCliente=" + nomeCliente
				+ ", cpfcnpjCliente=" + cpfcnpjCliente + ", emailCliente=" + emailCliente + ", enderecoCliente="
				+ enderecoCliente + ", telefoneCliente=" + telefoneCliente + ", formaPgto=" + formaPgto + "]";
	}
	
		

}
