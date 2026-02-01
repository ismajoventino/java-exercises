package com.loiane.java_basico.aula24.labs;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.titulo = "As I Lay Dying";
		livro.autor = "William Faulkner";
		livro.editora = "Companhia das Letras";
		livro.ano = 2015;
		livro.numeroPaginas = 200;
		livro.ISBN = 234213;
		livro.formato = "Pocket";
		
		System.out.println(livro.ano);
		System.out.println(livro.autor);
		System.out.println(livro.editora);
		System.out.println(livro.titulo);
		System.out.println(livro.ISBN);
		System.out.println(livro.numeroPaginas);

	}

}
