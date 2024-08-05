package Arvores;

public class ABBint {
	private class ARVORE {
		int dado;
		ARVORE esq, dir;
	}

	public ARVORE raiz = null;

	public ARVORE inserir(ARVORE h, int info) {
		// insere elemento em uma ABB
		if (h == null) {
			h = new ARVORE();
			h.dado = info;
			h.esq = null;
			h.dir = null;
		} else if (info < h.dado)
			h.esq = inserir(h.esq, info);
		else
			h.dir = inserir(h.dir, info);
		return h;
	}

	public ARVORE listaEmOrdem(ARVORE h) {
		if (h != null) {
			listaEmOrdem(h.esq);
			System.out.print("\t" + h.dado);
			listaEmOrdem(h.dir);
		}
		return h;
	}

	public int contaNos(ARVORE h, int cont) {
		if (h != null) {
			cont++;
			cont = contaNos(h.esq, cont);
			cont = contaNos(h.dir, cont);
		}
		return cont;
	}

	public boolean consulta(ARVORE h, int info) {
		if (h == null)
			return false;
		else {
			if (h.dado == info)
				return true;
			else {
				if (info < h.dado)
					return (consulta(h.esq, info));
				else
					return (consulta(h.dir, info));
			}
		}
	}

	public int contaConsulta(ARVORE h, int info, int cont) {
		if (h==null)
			return cont;
		else {
			cont++;
			if (h.dado == info)
				return cont;
			else {
				if (info<h.dado)
					return (contaConsulta(h.esq, info,cont));
				else
					return (contaConsulta(h.dir, info,cont));
			}
		}
	}
		

	
}
