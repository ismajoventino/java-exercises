package com.loiane.java_basico.aula33.labs;

public class Aluno {

	private String nome;
	private String curso;
	private String disciplinas[] = new String[3];
	private int matricula;
	private double notas[][] = new double[3][4];
	
	public Aluno(String nome, String curso, int matricula) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String nomeDisciplinas, int posicao) {
		this.disciplinas[posicao] = nomeDisciplinas;
	}


	public double[][] getNotas() {
		return this.notas;
	}

	public void setNotas(int posicaoDisciplina, int posicaoNota, double valor) {
		this.notas[posicaoDisciplina][posicaoNota] = valor;
	}



	public String getNome() {
		return nome;
	}


	public int getMatricula() {
		return matricula;
	}
	
	public String getCurso() {
		return curso;
	}


	public boolean isAprovado(String materia) {
		
		int materiaIndex;
		double somaNotas = 0;
		double media = 0;
		
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].equalsIgnoreCase(materia)) {
				materiaIndex = i;	
				for (int j = 0; j < notas[materiaIndex].length; j++) {
					somaNotas += notas[materiaIndex][j];
				}
				
				media = somaNotas / notas[materiaIndex].length;
				
			}
		}
		
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

	
	public double[] getListaNotas(String materia) {
		
		int indiceMateria = 0;
		
		for (int i = 0; i < disciplinas.length; i++) {
			if (disciplinas[i].equalsIgnoreCase(materia)) {
				indiceMateria = i;
				break;
			}
		}
		
		double[] notas = new double[this.notas[indiceMateria].length];
		
		for (int i = 0; i < this.notas[indiceMateria].length; i++) {
			notas[i] = this.notas[indiceMateria][i];
		}

		return notas;
		
	}
	
}
