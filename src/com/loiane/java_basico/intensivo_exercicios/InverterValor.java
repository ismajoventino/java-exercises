package com.loiane.java_basico.intensivo_exercicios;

public class InverterValor {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 60};
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("------------------");
		
		for (int i = 0; i < array.length / 2; i++) {
			int valorTemp = array[i];
			int indiceDoFim = (array.length - 1) - i;
			
			array[i] = array[indiceDoFim];
			array[indiceDoFim] = valorTemp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
