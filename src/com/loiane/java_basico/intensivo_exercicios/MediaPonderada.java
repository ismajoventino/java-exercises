package com.loiane.java_basico.intensivo_exercicios;

public class MediaPonderada {

	public static void main(String[] args) {
		
		double[] notas = {7.0, 5.0, 9.0};
		double[] pesos = {2, 3, 5};
		
		double somaMultiplicacoes = 0;
		double somaPesos = 0;
		
		for (int i = 0; i < notas.length; i++) {
			somaMultiplicacoes += (notas[i] * pesos[i]);
			somaPesos += pesos[i];
		}
		
		double media = somaMultiplicacoes / somaPesos;
		
		System.out.println("A Média ponderada é de: " + media);
		

	}
}
