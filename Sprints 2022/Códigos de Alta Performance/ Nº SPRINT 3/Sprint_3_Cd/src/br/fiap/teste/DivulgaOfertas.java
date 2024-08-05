package br.fiap.teste;

import java.util.Scanner;



public class DivulgaOfertas {
		
			public static void main(String[] args) {
			Scanner le = new Scanner(System.in);
			//Tree arvPF = new Tree();
			//TreeJD arvJD = new TreeJD();
			
			TreeCL clienteNO = new TreeCL();
			TreeCL clienteof = new TreeCL();
			Cliente clienteinfo = new Cliente();
			
			
			//List<String> PessoaFS = new ArrayList<>();
			//List<String> PessoaJD = new ArrayList<>();
			
			
			/*
			* Cria a uma árvore de busca binária para cada tipo de conta
			* (pessoa física ou jurídica)
			*/
			int opcao, op, numeroConta = 0;
			String nome, cpfCnpj;
			Conta tipoConta = null;
			double saldo;
			
			do {
			System.out.println(" 0- Encerrar o programa");
			System.out.println(" 1- Inscrição cliente");
			System.out.println(" 2- Oferta de novo serviço e/ou aplicação");
			opcao = le.nextInt();
			
			switch (opcao) {
			case 1:
			System.out.print("Digite nome: ");
			nome = le.next();
			System.out.print("Digite cpf: ");
			cpfCnpj = le.next();
			System.out.print("Digite número da conta: ");
			numeroConta = le.nextInt();
						
			do {
			System.out.print("Digite 1- Pessoa Física 2- Pessoa Jurídica: ");
			op = le.nextInt();
			
			switch (op) {
			case 1:
			tipoConta = Conta.FISICA;
			break;
			case 2:
			tipoConta = Conta.JURIDICA;		
			break;
			
			default:
			System.out.println("Opção inválida ");
			op = -1;
			}
			} while (op == -1);
			System.out.print("Informe saldo em aplica��es R$: ");
			
			saldo = le.nextDouble();
			
			clienteinfo = new Cliente( nome, cpfCnpj, tipoConta, numeroConta, saldo);
			clienteNO.root = clienteNO.inserir(clienteNO.root, clienteinfo);
			
		      break;
		      
			/*
			* Intancia um objeto da classe Cliente e insere na ABB correspondente a tipo de conta
			*/
			
			case 2:
			System.out.print("Qual tipo de conta a oferta se destina? ");
			do {
			System.out.print("Digite 1- Pessoa Física 2- Pessoa Jurídica: ");
			op = le.nextInt();
			switch (op) { 
			case 1:
					tipoConta = Conta.FISICA;
				break;				
				case 2:
					tipoConta = Conta.JURIDICA;
				break;
				default:
				System.out.println("Opção inválida "); op = -1;
				}
				} while (op == -1);
				System.out.print("Qual o valor de saldo mínimo exigido: R$ ");
				saldo = le.nextDouble();
				System.out.println("Clientes apitos a oferta: ");
				
				
				clienteof.root = clienteNO.listarSaldo(clienteNO.root, saldo, tipoConta, clienteof.root);
				clienteNO.listarOrdem(clienteof.root);
				clienteinfo = clienteNO.ClienteConta(clienteNO.root, tipoConta);
				
				
				while(clienteinfo!=null) {
				
					
					
					
					if(op == 1) {
						
						clienteNO.root = clienteNO.remover(clienteNO.root, clienteinfo);
						clienteof.root = clienteNO.remover(clienteof.root, clienteinfo);
						
						
						
					}else 
						clienteof.root = clienteNO.remover(clienteof.root, clienteinfo);
						clienteinfo = clienteNO.ClienteConta(clienteof.root,tipoConta);
						
							
			
				
				}
				break;
				}
				
				
				} while (opcao != 0);
				System.out.println("Clientes que não aceitaram ou não estavam adequados para a oferta" );
				
				
				/*
				* Fazendo uso de um método da classe ABB, desenvolvido para este problema, uma
				lista de clientes
				* aptos para a oferta é gerada.
				* Nesse trecho de programa que tentar fazer o contato com todos os clientes presente na
				lista.
				*/
				
				/*
				* Esvazia as ABBs apresentando todos os clientes que aguardam nova oportunidade
				*/
				clienteNO.listarOrdem(clienteNO.root);
				
				le.close();
			}
 }

