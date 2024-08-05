package Main;

import java.util.Scanner;

import Arvores.ABBint;
import Arvores.AVLint;
import java.lang.Double;

public class main {

	public static void main(String[] args) {

		AVLint tree = new AVLint();
		ABBint abb = new ABBint();
		Scanner le = new Scanner(System.in);

		int opcao;

		do {
			System.out.println(" 1 - Inserir");
			System.out.println(" 2 - Mostra FB");
			System.out.println(" 3 - Apresenta valores");
			System.out.println(" 4 - Consultar");
			System.out.println(" 5 - Consultar quantidade de nos na AVL");
			System.out.println(" 6 - Consultar quantidade de nos na ABB");
			System.out.println(" 0 - Sair");
			opcao = le.nextInt();
			switch (opcao) {

			case 0:
				System.out.println("Programa finalizado");
				break;

			case 1:
				System.out.print("Numero da conta inserido: ");
				int Random1 = (int) Math.floor(Math.random() * 1000);
				int info = Random1;
				tree.root = tree.inserirAVL(tree.root, info);
				abb.raiz = abb.inserir(abb.raiz, info);
				System.out.println(Random1 + "\n");

				System.out.print("Saldo inserido: ");
				double Random2 = Math.floor(Math.random() * 1000000);
				System.out.println(Random2 + "\n");

				System.out.println("Inserir Cpf");
				int info1 = le.nextInt();
				tree.root = tree.inserirAVL(tree.root, info1);
				abb.raiz = abb.inserir(abb.raiz, info1);
				break;

			case 2:
				System.out.print("Mostra FB" + "\n");
				tree.mostraFB(tree.root);
				break;
			case 3:
				System.out.println(" Elementos presentes na ABB");
				abb.raiz = abb.listaEmOrdem(abb.raiz);
				System.out.println();
				break;

			case 4:
				System.out.print(" Informe valor a ser pesquisado: ");
				info = le.nextInt();
				System.out.println(
						"Numero de comparacoes realizadas: " + abb.contaConsulta(abb.raiz, info, 0) + " (ABB)");
				System.out.println(
						"Numero de comparacoes realizadas: " + tree.contaConsulta(tree.root, info, 0) + " (AVL)");

				break;
			case 5:
				System.out.println(" A quantidade de nos na AVL= " + tree.contaNos(tree.root, 0));
				break;
			case 6:
				System.out.println(" A quantidade de nos na ABB= " + abb.contaNos(abb.raiz, 0));
				break;

			}
		} while (opcao != 0);
		le.close();

	}

}
