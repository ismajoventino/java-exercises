package com.loiane.java_basico.aula18.labs;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] A = new int[5];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		System.out.println("Valores Vetor B:");
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
		
	}

}
