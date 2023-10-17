package com.agenciatur.model;

public class Destino {
	
	private int idDestino;
	private String fornecedorDestino;
	private String vagasDestino;
	private int  valorDestino;
	private String transporteDestino;	
	private String enderecoDestino;
	private String nomeDestino;
	private Cliente cliente;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getFornecedorDestino() {
		return fornecedorDestino;
	}
	public void setFornecedorDestino(String fornecedorDestino) {
		this.fornecedorDestino = fornecedorDestino;
	}
	public String getVagasDestino() {
		return vagasDestino;
	}
	public void setVagasDestino(String vagasDestino) {
		this.vagasDestino = vagasDestino;
	}
	public int getValorDestino() {
		return valorDestino;
	}
	public void setValorDestino(int valorDestino) {
		this.valorDestino = valorDestino;
	}
	public String getTransporteDestino() {
		return transporteDestino;
	}
	public void setTransporteDestino(String transporteDestino) {
		this.transporteDestino = transporteDestino;
	}
	public String getEnderecoDestino() {
		return enderecoDestino;
	}
	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	public String getNomeDestino() {
		return nomeDestino;
	}
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	
	
	@Override
	public String toString() {
		return "Destino [idDestino=" + idDestino + ", fornecedorDestino=" + fornecedorDestino + ", vagasDestino="
				+ vagasDestino + ", valorDestino=" + valorDestino + ", transporteDestino=" + transporteDestino
				+ ", enderecoDestino=" + enderecoDestino + ", nomeDestino=" + nomeDestino + ", cliente=" + cliente
				+ "]";
	}
	
	

}
