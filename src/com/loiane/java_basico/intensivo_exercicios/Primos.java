package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um valor: ");
		int valor = scan.nextInt();
		
		boolean ehPrimo = true;
		
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				ehPrimo = false;
				break;
			}
		}
		
		if (ehPrimo) {
			System.out.println("O número " + valor + " é primo");
		} else {
				System.out.println("O número " + valor + " não é primo");
		}
		
	}

}
