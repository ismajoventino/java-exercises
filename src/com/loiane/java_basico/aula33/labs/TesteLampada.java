package com.loiane.java_basico.aula33.labs;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Marca:");
		String marca = scan.nextLine();
		
		System.out.println("Voltagem:");
		int voltagem = scan.nextInt();
		
		System.out.println("Cor: ");
		String cor = scan.next();
		
		System.out.println("Tipo: ");
		String tipo = scan.next();
		
		System.out.println("Preço: ");
		double preco = scan.nextDouble();
		
		Lampada lampada = new Lampada(marca, voltagem, cor, tipo, preco);
		
		lampada.desligarLampada();
		
		if (lampada.isLigada()) {
			System.out.println("Lampada ligada!");
		} else {
			System.out.println("Lampada desligada!");
		}
		
		

	}

}
