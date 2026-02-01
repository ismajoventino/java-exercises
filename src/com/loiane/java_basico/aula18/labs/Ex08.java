package com.loiane.java_basico.aula18.labs;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[] A = new int[10];
		for(int i = 0; i < A.length; i++) {
			A[i] = gerador.nextInt(50) + 1;
		}
		
		int qntdPessoas = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] > 35){
				qntdPessoas += 1;
			}
		}
		
		System.out.println("QUANTIDADE DE PESSOAS 35+: " + qntdPessoas);
		
		
	}

}
