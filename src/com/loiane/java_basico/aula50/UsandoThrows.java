package com.loiane.java_basico.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um numero decimal");
		try {
			double num = leNumero();
			System.out.println("Voce digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida.");
			e.printStackTrace();
		}

	}
	
	public static double leNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		return numero;
	}

}
