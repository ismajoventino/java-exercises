package com.loiane.java_basico.aula20.labs;

import java.util.Random;

public class Escadinha {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] array = new int[8][];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new int[i + 1];
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println();
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
		}
		

	}

}
