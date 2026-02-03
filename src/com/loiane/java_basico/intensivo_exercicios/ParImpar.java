package com.loiane.java_basico.intensivo_exercicios;

import java.util.Random;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		int vitoriasUsuario = 0;
		boolean jogoAtivo = true;
		
		System.out.println("-------------------");
		
		while (jogoAtivo){
			
			System.out.println("Escolha Impar ou Par: ");
			String escolhaUsuario = scan.next();
			
			System.out.println("Digite um número: ");
			int numeroUsuario = scan.nextInt();
			
			int numeroComputador = rand.nextInt(5);
			System.out.println("Numero do openente: " + numeroComputador);
			
			int soma = numeroUsuario + numeroComputador;
			
			if (escolhaUsuario.equals("Par") && soma % 2 == 0) {
				vitoriasUsuario += 1;
				System.out.println("Usuário Ganhou!");
				System.out.println();
				System.out.println("-------------------");
				System.out.println();
				
			} else if (escolhaUsuario.equals("Impar") && soma % 2 != 0){
				vitoriasUsuario += 1;
				System.out.println("Usuário Ganhou!");
				System.out.println();
				System.out.println("-------------------");
				System.out.println();
				
			} else {
				System.out.println("Usuário Perdeu!");
				System.out.println();
				System.out.println("-------------------");
				System.out.println();
				jogoAtivo = false;
				
			}
		};
		
		System.out.println("TOTAL DE VITORIAS: " + vitoriasUsuario);
		
	}

}
