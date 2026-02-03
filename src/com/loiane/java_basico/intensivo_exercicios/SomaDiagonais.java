package com.loiane.java_basico.intensivo_exercicios;

import java.util.Random;

public class SomaDiagonais {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		int diagonalPrincipal = 0;
		int diagonalSecundaria = 0;

		for(int i = 0; i < matriz.length; i++) {
			for (int j =  0; j < matriz[i].length; j++) {
				if (i == j) {
					diagonalPrincipal += matriz[i][j];
				}
				if (i + j == matriz.length - 1) {
					diagonalSecundaria += matriz[i][j];
					System.out.println(diagonalSecundaria);
				}
			}
		}
		
		System.out.println("Soma dos numeros na diagonal principal: " + diagonalPrincipal);
		System.out.println("Soma dos numeros na diagonal segundaria: "  + diagonalSecundaria);
		
	}

}
