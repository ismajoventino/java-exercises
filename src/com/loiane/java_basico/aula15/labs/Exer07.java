package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o preço do produto 1:");
		double produto1 = scan.nextDouble();
		System.out.println("Digite o preço do produto 2:");
		double produto2 = scan.nextDouble();
		System.out.println("Digite o preço do produto 3:");
		double produto3 = scan.nextDouble();
		
		if (produto1 <= produto2 && produto1 <= produto3   ) {
			System.out.println("Compre o produto 1! É mais barato.");
		} else if (produto2 <= produto3 && produto2 <= produto1   ) {
			System.out.println("Compre o produto 2! É mais barato.");
		} else if (produto3 <= produto2 && produto3 <= produto1   ) {
			System.out.println("Compre o produto 1! É mais barato.");
		} 
	}

}
