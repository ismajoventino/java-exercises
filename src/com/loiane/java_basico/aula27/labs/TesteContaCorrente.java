package com.loiane.java_basico.aula27.labs;

import java.util.Scanner;



public class TesteContaCorrente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.agencia = "1175";
		conta.numero = "00293829";
		conta.especial = true;
		conta.limiteEspecial = 1000;
		conta.saldo = 3000;
		
		System.out.println("BEM VINDO AO BANCO X");
		System.out.println();
		
		int opcao = 0;
		do {
			System.out.println("MENU:");
			System.out.println("1. Deposito");
			System.out.println("2. Saque");
			System.out.println("3. Saldo");
			System.out.println("4. Cheque Especial");
			System.out.println("5. Sair");
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o valor do deposito: ");
				double valorDeposito = scan.nextInt();
				
				conta.depositarDinheiro(valorDeposito);
				
				System.out.println("Depósito feito com sucesso. Aguarde seu comprovante");
				System.out.println();
				
			} else if (opcao == 2) {
				System.out.println("Digite o valor do saque:");
				double valorSaque = scan.nextDouble();
				
				if (conta.realizarSaque(valorSaque)) {
					System.out.println("Saque efetuado com sucesso. Aguarde seu dinheiro.");
					System.out.println();
				} else {
					System.out.println("ERRO: Saldo Insuficiente");
					System.out.println();
				}
			} else if (opcao == 3) {
				double saldo = conta.verificarSaldo();
				
				System.out.println("Saldo atual da conta: R$" + saldo);
				System.out.println();
			} else if (opcao == 4) {
				double valorCheque = conta.verificarCheque();
				
				System.out.println("Valor do cheque especial: R$" + valorCheque);
				System.out.println();
			} else if (opcao > 5 || opcao <= 0) {
				System.out.println("Opção Inválida! ");
				System.out.println();
			}
			
		} while(opcao != 5);
		
		System.out.println("Obrigado por ultilizar o banco X! :)");
	

	}

}
