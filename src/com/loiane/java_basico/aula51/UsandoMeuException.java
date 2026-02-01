package com.loiane.java_basico.aula51;

public class UsandoMeuException {

	public static void main(String[] args) throws Exception {
		
		int[] numeros = {4, 8, 5, 16, 22, 21, 128, 42};
		int[] denominadores = {2, 0, 4, 8, 0, 2, 4};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					throw new Exception("Número ímpar, divisão não exata!");
				}
				System.out.println(numeros[i] + "/" + denominadores[i] + ": " + numeros[i] / denominadores[i]);
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Erro.");
			}
		}

	}

}
