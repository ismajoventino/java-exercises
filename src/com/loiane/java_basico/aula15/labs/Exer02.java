package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Entre com um número: ");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("O numero digitado é um número negativo.");
		} else {
			System.out.println("O número digitado é um númer positivo");
		}
		
	}

}
