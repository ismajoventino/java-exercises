package com.loiane.java_basico.aula33.labs;

import java.util.Scanner;

public class TesteLivro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual será o preço do livro?");
		double precoLivro = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Digite o titulo do livro: ");
		String nomeLivro = scan.nextLine();
		
		System.out.println("Digite o autor do livro: ");
		String nomeAutor = scan.nextLine();
		
		Livro livro1 = new Livro(nomeLivro, nomeAutor);
	
		livro1.setPreco(precoLivro);
		
		System.out.println("O livro '" + livro1.getTitulo() + "' custa R$" + livro1.getPreco());

	}

}
