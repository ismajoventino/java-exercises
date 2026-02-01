package com.loiane.java_basico.aula20.labs;

public class AlunosMedias {

	public static void main(String[] args) {
		
		double[][] notas = new double[5][4];
		
		notas[0][0] = 8.5;
		notas[0][1] = 9.0;
		notas[0][2] = 8.5;
		notas[0][3] = 8.3;

		notas[1][0] = 8.5;
		notas[1][1] = 7.0;
		notas[1][2] = 8.8;
		notas[1][3] = 8.7;

		notas[2][0] = 8.0;
		notas[2][1] = 7.5;
		notas[2][2] = 7.0;
		notas[2][3] = 8.3;
		
		notas[3][0] = 8.8;
		notas[3][1] = 7.0;
		notas[3][2] = 7.6;
		notas[3][3] = 6.3;
		
		notas[4][0] = 6.0;
		notas[4][1] = 7.5;
		notas[4][2] = 7.2;
		notas[4][3] = 8.8;
	
		
		for(int i = 0; i < notas.length; i++) {
			double somaDasNotas = 0;
		
			for(int j = 0; j < notas[i].length; j++) {
				somaDasNotas += notas[i][j];
				
			}
			System.out.println("MÉDIA FINAL - ALUNO " + (i + 1) + ": " + (somaDasNotas / notas[i].length));
			System.out.println();
			System.out.println("-----------------------");
		}
		
	}

}
