package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
	
		if (media >= 7 && media < 10) {
			System.out.println("STUATUS: APROVADO");
		} else if (media < 7) {
			System.out.println("STATUS: REPROVADO");
		} else if (media == 10) {
			System.out.println("STATUS: APROVADO COM DISTINÇÃO");
		}

	}

}
