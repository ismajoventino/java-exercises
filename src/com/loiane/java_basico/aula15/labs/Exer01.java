package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com outro número");
		int numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " é o maior número");
		} else {
			System.out.println(numero2 + " é o maior número");
		}
	}

}
