package com.loiane.java_basico.intensivo_exercicios;

public class Asteriscos {

	public static void main(String[] args) {
		
		int[] dados = {3, 7, 2, 5, 1};
		char asterisco = '*';
		
		for(int i = 0; i < dados.length; i++) {
			System.out.println("Valor: " + dados[i]);
			for(int j = 0; j < dados[i]; j++) {
				System.out.print(asterisco);
			}
			System.out.println();
		}
	}

}
