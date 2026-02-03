package com.loiane.java_basico.intensivo_exercicios;

public class Intercalado {

	public static void main(String[] args) {
		
		int[] vetorA = {10, 20, 30, 40, 50};
		int[] vetorB = {1, 2, 3, 4, 5};
		int[] vetorC = new int[10];
		
		int posicaoC = 0;
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[posicaoC] = vetorA[i];
			posicaoC++;
			
			vetorC[posicaoC] = vetorB[i];
			posicaoC++;

		}
		
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
		

	}

}
