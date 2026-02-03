package com.loiane.java_basico.intensivo_exercicios;

public class MatrizIdentidade {

	public static void main(String[] args) {
		
		int[][] matriz = new int[5][5];
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		
		//matriz[0][1] = 3;
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		boolean ehIdentidade = true;
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if(i == j && matriz[i][j] != 1) {
					ehIdentidade = false;
					break;
				}
				if(i != j && matriz[i][j] != 0) {
					ehIdentidade = false;
					break;
				}
			}
		}
		
		if (ehIdentidade) {
			System.out.println("A matriz é uma matriz identidade");
		} else {
			System.out.println("A matriz não é uma matriz identidade");
		}
		
		

	}

}
