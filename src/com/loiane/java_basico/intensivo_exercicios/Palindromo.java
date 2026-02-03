package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scan.next();
		String palavraMaiuscula = palavra.toUpperCase();	
		
		char[] letras = palavraMaiuscula.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		System.out.println("----------------------------------------");
		
		boolean polindromo = true;
		
		for(int i = 0; i < letras.length; i++) {
			int posicaoDoFim = (letras.length - 1) - i;
			if(letras[i] != letras[posicaoDoFim]) {
				polindromo = false;
				break;
			}
		}
		
		if (polindromo) {
			System.out.println("A Palavra é um Polindromo");
		} else {
			System.out.println("A Palavra não é um Polindromo");
		}

	}

}
