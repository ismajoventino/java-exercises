package com.loiane.java_basico.aula18.labs;

import java.util.Random;

public class Ex09 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[] numeros = new int[10];
		for(int i = 0; i < 10; i++) {
			numeros[i] = gerador.nextInt(100) + 1;
		}
		
		System.out.println("VALORES DO ARRAY: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i + 1) + ". " + numeros[i]);
		}
		
		int menorNumero = numeros[0];
		int menorIndice = 0;
		int maiorNumero = numeros[0];
		int maiorIndice = 0;
		
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				maiorIndice = i;
			}
			if ((numeros[i] < menorNumero)){
				menorNumero = numeros[i];
				menorIndice = i;
			}
		}
		
		System.out.println("MAIOR NÚMERO: " + maiorNumero + "; POSICÃO: " + maiorIndice);
		System.out.println("MENOR NÚMERO: " + menorNumero + "; POSIÇÃO: " + menorIndice);
		
		
	}

}
