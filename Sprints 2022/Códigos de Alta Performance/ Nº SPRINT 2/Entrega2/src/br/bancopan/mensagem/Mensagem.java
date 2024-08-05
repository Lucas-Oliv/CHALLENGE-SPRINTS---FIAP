package br.bancopan.mensagem;

import br.bancopan.cliente.Cliente;

public class Mensagem {
Cliente clientes;
	String mensagem;
	public Mensagem(Cliente clientes, String mensagem) {
		super();
		this.clientes = clientes;
		this.mensagem = mensagem;
	}
	public Cliente getClientes() {
		return clientes;
	}
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMsg() {
		
		return mensagem;
	}
	@Override
	public String toString() {
		return "" + getClientes() ;
	}
	

	


}
