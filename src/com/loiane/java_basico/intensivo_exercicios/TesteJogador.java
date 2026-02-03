package com.loiane.java_basico.intensivo_exercicios;

import java.util.Scanner;

public class TesteJogador {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Time time = new Time(3);
		
		System.out.println("Nome do time:");
		time.setNome(scan.nextLine());
		
		for(int i = 0; i < time.getElenco().length; i++) {
			Jogador jogador = new Jogador();
			
			System.out.println("JOGADOR " + (i + 1));
			
			System.out.println("Nome: ");
			jogador.setNome(scan.nextLine());
			
			System.out.println("Camisa: ");
			jogador.setCamisa(scan.nextInt());
			
			System.out.println("Quantidade de gols: ");
			jogador.setGolsMarcados(scan.nextInt());
			scan.nextLine();
			
			time.adicionarJogador(jogador);
		}

		Jogador craque = time.getArtilheiro();
		
		System.out.println("O artilheiro é o " + craque.getNome() + " com " + craque.getGolsMarcados() + " gols.");
		
	}

}
