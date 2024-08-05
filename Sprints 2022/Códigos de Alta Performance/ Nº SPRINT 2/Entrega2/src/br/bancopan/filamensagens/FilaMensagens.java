package br.bancopan.filamensagens;

import br.bancopan.mensagem.Mensagem;

public class FilaMensagens {

	
	public final int N=3;
Mensagem[] dados = new Mensagem[N];
	int ini, fim, cont;
	
	public void init() {
		ini = fim = cont = 0;
	}
	public boolean isEmpty() {
		if (cont == 0)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (cont == N)
			return true;
		else
			return false;
	}
	public void enqueue(Mensagem m){
		if (isFull())
			System.out.println("Fila Cheia");
		else {
			dados[fim] = m;
			fim = (fim+1) % N;
			cont++;
		}	
	}
	public Mensagem dequeue() {
		Mensagem m = dados[ini];
		ini = (ini+1) % N;
		cont--;
		return m;
	}
	
	public Mensagem first() {
		return (dados[ini]);
	}
	
	
	
	
}
