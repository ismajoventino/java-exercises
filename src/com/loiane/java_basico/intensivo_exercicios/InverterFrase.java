package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class InverterFrase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva uma frase: ");
		String fraseUsuario = scan.nextLine();
		
		String[] frase = fraseUsuario.split(" ");
		
		for (int i = 0; i < frase.length; i++) {
			System.out.println(frase[i]);
		}
		
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		
		for (int i = 0; i < frase.length / 2; i++) {
			int valorFinal = (frase.length - 1) - i;
			String aux = frase[i];
			
			frase[i] = frase[valorFinal];
			frase[valorFinal] = aux;
		}
		
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i] + " ");
		}
		

	}

}
