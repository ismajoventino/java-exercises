package com.loiane.java_basico.aula47;

public class Excessao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception.");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso.");
		} catch (ArrayIndexOutOfBoundsException exception) {
			
			System.out.println("Erro ao acessar um indice inexistente.");
			
		}
		
		System.out.println("Esse texto será impresso após a exception.");

	}

}
