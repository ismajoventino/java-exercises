package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class TabuadaMatriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[10][10];
		
		System.out.println("Entre com um valor");
		int valor = scan.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (valor * (j + 1));
			}
			valor++;
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
