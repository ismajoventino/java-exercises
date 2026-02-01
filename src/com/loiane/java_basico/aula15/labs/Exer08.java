package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int numero3 = scan.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			if (numero2 <= numero3) {
				System.out.println("ORDEM DESCRESCENTE: " + numero3 + ", " + numero2 + ", "  + numero1 + ". " );
			} else {
				System.out.println("ORDEM DESCRESCENTE: " + numero2 + ", " + numero3 + ", "  + numero1 + ". " );
			}
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			if (numero1 <= numero3) {
				System.out.println("ORDEM DESCRESCENTE: " + numero3 + ", " + numero1 + ", "  + numero2 + ". " );
			} else {
				System.out.println("ORDEM DESCRESCENTE: " + numero1 + ", " + numero3 + ", "  + numero2 + ". " );
			}
		} else if (numero3 <= numero2 && numero3 <= numero1) {
			if (numero2 <= numero1) {
				System.out.println("ORDEM DESCRESCENTE: " + numero1 + ", " + numero2 + ", "  + numero3 + ". " );
			} else {
				System.out.println("ORDEM DESCRESCENTE: " + numero2 + ", " + numero1 + ", "  + numero3 + ". " );
			}

		}
		
	}

}
