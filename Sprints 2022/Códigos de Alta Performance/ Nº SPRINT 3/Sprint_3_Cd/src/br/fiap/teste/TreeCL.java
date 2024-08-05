package br.fiap.teste;



public class TreeCL {

	private class TreeCl{
		Cliente dado;
		TreeCl esq, dir;
	}
	
	public TreeCl root =  null;
	
	public TreeCl inserir(TreeCl i, Cliente info) {
		if(i == null) {
			i =  new TreeCl();
			i.dado = info;
			i.esq = null;
			i.dir = null;
		} else if (i.dado.getSaldo() > info.saldo)
			i.esq = inserir(i.esq, info);
		else 
			i.dir = inserir(i.dir, info);
		return i;
		
	}
	
	public void listarOrdem(TreeCl i) {
		if(i==null)
			return;
		listarOrdem(i.dir);
		System.out.println(i.dado);
		listarOrdem(i.esq);
	}
	
	public TreeCl listarSaldo(TreeCl i, double saldo, Conta tipo,TreeCl novaTree) {
		if(i!=null) {
			if(i.dir!=null)
				novaTree = listarSaldo(i.dir,saldo,tipo, novaTree);
			if(i.dado.getSaldo()>=saldo && i.dado.getConta() == tipo) 
				novaTree = inserir(novaTree, i.dado);
			if(i.esq!=null)
				novaTree = listarSaldo(i.esq,saldo, tipo,  novaTree);
		}
		return novaTree;
	}
	
	
	public Cliente ClienteConta(TreeCl i,  Conta tipo) {
		if(i!=null) {
			if(i.dir!=null)
				return ClienteConta(i.dir,tipo);
			if(tipo == i.dado.getConta())
				return i.dado;
		}
		return null;
	}
	
	public Cliente getSaldo(TreeCl i, double saldo, Conta tipo) {
		if(i!=null) {
			if(i.dado.getSaldo() == saldo)
				return i.dado;
			if(i.dado.getSaldo()>saldo) 
				return getSaldo(i.esq,saldo,tipo);
			return getSaldo(i.dir,saldo,tipo);
		}
		return null;
	}	
	
	public TreeCl delete(TreeCl i, double saldo, TreeCl antigP) {
		if(i==null)
			return i;
		if(i.dado.getSaldo() == saldo) {
			if(antigP.dir.dado.getSaldo() == saldo) {
				antigP.dir = null;
				return i;
			}
			else {
				antigP.esq=null;
				return i;
				}
			}
	
		if(i.dado.getSaldo()<saldo)
			return delete(i.esq, saldo,i);
		else
			return delete(i.dir, saldo,i);
			
			
		
	}
	
	public  TreeCl remover (TreeCl i, Cliente info) {
		if (i!=null){
		if(info == i.dado){
		if (i.esq == null && i.dir==null)   //n� a ser removido � n� folha
			return null;
		if (i.esq==null){ //se n�o h� sub-�rvore esquerda o ponteiro passa apontar para a sub-�rvore direita      
			return  i.dir;
		}
		else{
			if (i.dir==null){   //se n�o h� sub-�rvore direita  o ponteiro passa apontar para a sub-�rvore esquerda     
		return i.esq;      
			}
			else{  /*o n� a ser retirado possui sub-arvore esquerda e direita, ent�o o n� que  
		           ser� retirado deve-se encontrar o menor valor na sub-�rvore � direita */
				TreeCl aux, ref;
		ref = i.dir;
		aux = i.dir;
		while (aux.esq != null)
		    aux = aux.esq;
		aux.esq = i.esq;
		return ref;
		}
		}
		}
		else{   //procura dado a ser removido na ABB
		if(info.getSaldo()<i.dado.getSaldo())
			i.esq = remover(i.esq,info);
		else
			i.dir = remover(i.dir,info);
		}
		}
		return i;
		}
	
	



	
	
	
}

