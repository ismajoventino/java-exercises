package com.loiane.java_basico.intensivo_exercicios;

public class MatrizTransposta {

	public static void main(String[] args) {
		
		int[][] matriz = {{1, 2 , 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] transposta = new int[3][3];
		//00, 01, 10, 11
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				transposta[i][j] = matriz[j][i];
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
		}
		
		
		
		
		

	}

}
