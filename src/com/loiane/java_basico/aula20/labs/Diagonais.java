package com.loiane.java_basico.aula20.labs;

import java.util.Random;

public class Diagonais {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[][] numeros = new int[5][5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println();
			for(int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = gerador.nextInt(50);
				
				System.out.print(numeros[i][j] + " | ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		
		for(int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + " | ");
				}
			}
		}
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		
		for(int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (i + j == numeros.length - 1) {
					System.out.print(numeros[i][j] + " | ");
				}
			}
		}

	}

}
