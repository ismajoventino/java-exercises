package com.loiane.java_basico.intensivo_exercicios;

public class Ordem {

	public static void main(String[] args) {
		
		int[] numeros = {2, 2, 3};
		
		boolean naOrdem = true;
		
		for(int i = 0; i < numeros.length - 1; i++) {
			int proximoNumero = i + 1;
			
			if (numeros[i] > numeros[proximoNumero]) {
				naOrdem = false;
				break;
			}
		}
		
		if (!naOrdem) {
			System.out.println("Não está em ordem crescente!");
		} else {
			System.out.println("Está em ordem crescente!");
		}
		
		
	}

}
