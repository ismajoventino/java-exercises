package com.loiane.java_basico.aula20.labs;

public class MatrizTridimencional {

	public static void main(String[] args) {
		
		int[][][] matrizTridimencional = new int[3][3][3];
		
		for(int i = 0; i < matrizTridimencional.length; i++) {
			for(int j = 0; j < matrizTridimencional[i].length; j++) {
				for(int k = 0; k < matrizTridimencional[i][j].length; k++) {
					matrizTridimencional[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for(int i = 0; i < matrizTridimencional.length; i++) {
			for(int j = 0; j < matrizTridimencional[i].length; j++) {
				for(int k = 0; k < matrizTridimencional[i][j].length; k++) {
					soma += matrizTridimencional[i][j][k];
				}
			}
		}

	}

}
