package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		int fatorialResultado = numero;
		//int resultadoDois = 1;
		
		for(int i = numero - 1; i >= 1; i--) {
			fatorialResultado = fatorialResultado * i;
		}
		
		/*for(int i = 1; i < numero; i++) {
			resultadoDois = resultadoDois * (i + 1);	
		}*/
		
		System.out.println(fatorialResultado);
		//System.out.println(resultadoDois);
		
	}
}
