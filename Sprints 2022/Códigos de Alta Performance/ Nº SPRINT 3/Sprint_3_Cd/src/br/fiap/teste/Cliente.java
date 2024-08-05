package br.fiap.teste;



public class Cliente {
	
	String Nome, cpfCnpj;
	Conta conta;
	int numeroConta;
	double saldo;
	
	
	public Cliente() {}
	
	
	
	




	public Cliente(String nome, String cpfCnpj, Conta conta, int numeroConta,
			double saldo) {
		super();
		Nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.conta = conta;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}












	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", cpfCnpj=" + cpfCnpj + ", conta=" + conta + ", numeroConta=" + numeroConta
				+ ", saldo=" + saldo + "]";
	}








	public double getSaldo() {
		return saldo;
	}





	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}





	public String getNome() {
		return Nome;
	}





	public int getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}



	public void setNome(String nome) {
		this.Nome = nome;
	}





	public String getCpfCnpj() {
		return cpfCnpj;
	}





	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}








	public Conta getConta() {
		return conta;
	}








	public void setConta(Conta conta) {
		this.conta = conta;
	}










	
}



