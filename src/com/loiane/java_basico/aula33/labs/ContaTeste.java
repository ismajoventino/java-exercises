package com.loiane.java_basico.aula33.labs;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Conta conta = new Conta("12322", "0012", true, 500, 1000);
		
		System.out.println("BEM VINDO AO BANCO X");
		System.out.println();
		
		int escolhaUser = 0;
		do {
			System.out.println("MENU:");
			System.out.println("1. Deposito");
			System.out.println("2. Saque");
			System.out.println("3. Saldo");
			System.out.println("4. Cheque Especial");
			System.out.println("5. Detalhes da Conta");
			System.out.println("6. Sair");

			escolhaUser = scan.nextInt();
			
			switch (escolhaUser) {
				case 1: 
					System.out.println("Digite o valor do deposito: ");
					double valorDeposito = scan.nextInt();
					
					conta.depositarDinheiro(valorDeposito);
					
					System.out.println("Depósito feito com sucesso. Aguarde seu comprovante");
					System.out.println();
					break;
					
				case 2: 
					System.out.println("Digite o valor do saque:");
					double valorSaque = scan.nextDouble();
					
					if (conta.realizarSaque(valorSaque)) {
						System.out.println("Saque efetuado com sucesso. Aguarde seu dinheiro.");
						System.out.println();
					} else {
						System.out.println("ERRO: Saldo Insuficiente");
						System.out.println();
					}
					break;
					
				case 3: 
					double saldo = conta.getSaldo();
					
					System.out.println("Saldo atual da conta: R$" + saldo);
					System.out.println();
					break;
					
				case 4:
					double valorCheque = conta.getSaldoTotal();
					
					System.out.println("Valor do cheque especial: R$" + valorCheque);
					System.out.println();
					break;

				case 5: 
					System.out.println("CONTA: " + conta.getNumero());
					System.out.println("AGENCIA: " + conta.getAgencia());
					System.out.print("POSSUI CHEQUE: ");
					if (conta.isEspecial()) {
						System.out.println("Sim");
					} else {
						System.out.println("Não");
					}
					System.out.println();
					break;
					
				default:
					System.out.println("Opção Inválida! ");
					System.out.println();
					break;
			}
			
		} while (escolhaUser != 6);
		
		System.out.println("Obrigado por ultilizar o banco X! :)");
		
	}

}
