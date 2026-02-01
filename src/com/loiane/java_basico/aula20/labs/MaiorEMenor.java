package com.loiane.java_basico.aula20.labs;

import java.util.Random;

public class MaiorEMenor {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[][] numeros = new int[3][3];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("--------------------");
			
			for(int j = 0; j < numeros[i].length; j++) {
				
				numeros[i][j] = gerador.nextInt(50);
				System.out.println(numeros[i][j]);
				
			}
			
		}
		
		int maiorLinha = 0;
		int menorLinha = 0;
		int maiorColuna = 0;
		int menorColuna = 0;
		int maiorValor = 0;
		int menorValor = numeros[0][0];
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j] > maiorValor) {
					maiorValor = numeros[i][j];
					maiorLinha = i;
					maiorColuna = j;
				}
				
				if (numeros[i][j] < menorValor) {
					menorValor = numeros[i][j];
					menorLinha = i;
					menorColuna = j;
				}
			}
		}
		
		System.out.println("--------------------");
		System.out.println("MAIOR VALOR: " + maiorValor);
		System.out.println("POSIÇÃO: L = " + maiorLinha + "; C = " + maiorColuna + "; ");
		System.out.println();
		System.out.println("MENOR VALOR: " + menorValor);
		System.out.println("POSIÇÃO: L = " + menorLinha + "; C = " + menorColuna + "; ");
		

	}

}
