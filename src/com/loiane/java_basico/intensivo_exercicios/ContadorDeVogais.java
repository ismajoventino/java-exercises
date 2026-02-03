package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class ContadorDeVogais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma palavra: ");
		String fraseUser = scan.nextLine();
		
		String frase = fraseUser.toLowerCase();
		
		int contadorVogais = 0;
		
		for(int i = 0; i < fraseUser.length(); i++) {
			
			if (frase.charAt(i) == 'a') {
				contadorVogais++;
			} else if (frase.charAt(i) == 'e') {
				contadorVogais++;
			} else if (frase.charAt(i) == 'i') {
				contadorVogais++;
			} else if (frase.charAt(i) == 'o') {
				contadorVogais++;
			} else if (frase.charAt(i) == 'u') {
				contadorVogais++;
			}
		}
		
		System.out.println("A frase digitada tem " + contadorVogais + " vogais! ");
		

	}
}
