package com.loiane.java_basico.aula40;

public class Teste {
	
	public static void main (String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num1");
		aluno.setEndereco("Rua 2, num2");
		professor.setEndereco("Rua 3, num3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
	}

}
