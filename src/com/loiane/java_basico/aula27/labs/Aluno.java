package com.loiane.java_basico.aula27.labs;

public class Aluno {

	String nome;
	String curso;
	String disciplinas[] = new String[3];
	int matricula;
	double notas[][] = new double[3][4];
	
	
	
	public Aluno(String nome, String curso, int matricula) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}

	boolean verificarAprovado(String materia) {
		
		int materiaIndex;
		double somaNotas = 0;
		double media = 0;
		
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].equalsIgnoreCase(materia)) {
				
				materiaIndex = i;	
				for (int j = 0; j < notas[materiaIndex].length; j++) {
					somaNotas = notas[materiaIndex][j];
				}
				media = somaNotas / notas[materiaIndex].length;
				
			}
		}
		
		System.out.println("Matéria Inexistente!");
		
			if (media <= 7) {
			return true;
		} else {
			return false;
		}
	}
	
}
