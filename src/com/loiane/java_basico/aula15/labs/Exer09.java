package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite o período de estudo: (M - Manhã, T - Tarde, N - Noite): ");
		String periodo = scan.next();
		
		switch(periodo) {
		case "m": System.out.println("Bom dia!"); break;
		case "t": System.out.println("Boa tarde!"); break;
		case "n": System.out.println("Boa noite!"); break;
		case "M": System.out.println("Bom dia!"); break;
		case "T": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido.");
		}
	}

}
