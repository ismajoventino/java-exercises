package com.loiane.java_basico.aula18.labs;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] A = new int[15];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		A[8] = 9;
		A[9] = 10;
		A[10] = 11;
		A[11] = 12;
		A[12] = 13;
		A[13] = 14;
		A[14] = 15;
		
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++){
			B[i] = A[i] *  A[i];
		}
		
		System.out.println("Valores Vetor B:");
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
		
	}


}

