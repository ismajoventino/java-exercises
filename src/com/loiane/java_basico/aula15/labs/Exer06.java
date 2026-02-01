package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		int maiorValor;
		if (numero1 == numero2) {
			System.out.println("Os números são iguais!");
		} else if (numero1 > numero2) {
			System.out.println("O número " + numero1 + " é maior que o número " + numero2);
		} else {
			System.out.println("O número " + numero2 + " é maior que o número " + numero1);
		}

	}

}
