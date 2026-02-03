package com.loiane.java_basico.intensivo_exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdvinheNumero {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int numeroComp = rand.nextInt(100);
		int numeroUser = 0;
		boolean jogadorGanhou = false;
		
		System.out.println("-------------------------------");
		System.out.println("O computador já fez sua jogada!");
		
		do {
			
			System.out.println("Digite a sua aposta: ");
			numeroUser = scan.nextInt();
			
			if(numeroComp == numeroUser) {
				jogadorGanhou = true;
				System.out.println("GAME OVER! Voce acertou o valor do computador!");
				System.out.println("-------------------------------");
			} else if (numeroUser > numeroComp){
				System.out.println("Tente um numero menor");
			} else {
			System.out.println("Tente um numero maior");
			}
			
		} while (!jogadorGanhou);
		
		System.out.println("Valor do computador: " + numeroComp);
	
	}
}
