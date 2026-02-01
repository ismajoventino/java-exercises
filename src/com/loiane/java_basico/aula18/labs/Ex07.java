package com.loiane.java_basico.aula18.labs;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		for(int i = 0; i < A.length; i++) {
			A[i] = i+1;
		}
		
		int soma = 0;
		for(int i = 0; i < A.length; i++) {
			if (A[i] % 5 == 0) {
				soma += A[i];
			};
		}
		
		System.out.println("RESULTADO: " + soma);
		
	}

}
