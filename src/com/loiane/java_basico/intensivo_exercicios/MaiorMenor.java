package com.loiane.java_basico.intensivo_exercicios;

import java.util.Random;

public class MaiorMenor {

	public static void main(String[] args) {
		
		//int[][] matriz = {{1, 6, 5}, {3, 2, 9},{0, 7, 8}};
		
		Random rand = new Random();
		
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
		}
		
		int linhaMaior = 0;
		int linhaMenor = 0;
		int colunaMaior = 0;
		int colunaMenor = 0;
		int valorMaior = matriz[0][0];
		int valorMenor = matriz[0][0];
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > valorMaior) {
					valorMaior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				} else if (matriz[i][j] < valorMenor) {
					valorMenor = matriz[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}
		
		System.out.println("MAIOR VALOR: " + valorMaior + "; POSIÇÃO: " + linhaMaior + ", " + colunaMaior);
		System.out.println("MENOR VALOR: " + valorMenor + "; POSIÇÃO: " + linhaMenor + ", " + colunaMenor);

	}
}
