package com.loiane.java_basico.aula18.labs;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] A = new int[10];
		for(int i = 0; i < A.length; i++) {
			A[i] = i+1;
		}
		
		int[] B = new int[A.length];
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i] * i;
		}
		
		System.out.println("ARRAY B: ");
		for(int i = 0; i < A.length; i++) {
			System.out.println((i+1) + "." + B[i]);
		}
		
		
		

	}

}
