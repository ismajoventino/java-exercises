package com.loiane.java_basico.aula33.labs;

import java.util.Scanner;

public class TesteArCondicionado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArCondicionado ar = new ArCondicionado();
		
		System.out.println("ESCOLHA UMA TEMPERATURA: ");
		int temperatura = scan.nextInt();
		
		if (ar.setTemperatura(temperatura)) {
			System.out.println("TEMPERATURA: " + ar.getTemperatura());
		} else {
			System.out.println("ERRO!");
		}
		
	}

}
