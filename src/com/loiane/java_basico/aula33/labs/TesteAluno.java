package com.loiane.java_basico.aula33.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno("Ismael", "Ciências da Computação", 20265213);
		
		for (int i = 0; i < aluno1.getDisciplinas().length; i++) {
			System.out.println("Digite o nome da disciplina " + (i + 1) + ": ");
			String disciplina = scan.nextLine();
			aluno1.setDisciplinas(disciplina, i);
		}
		
		for (int i = 0; i < aluno1.getNotas().length; i++) {
			for (int j = 0; j < aluno1.getNotas()[i].length; j++) {
				System.out.println("Digite a nota " + (j + 1) + " da disciplina " + aluno1.getDisciplinas()[i] + ": ");
				double nota = scan.nextDouble();
				scan.nextLine();
				aluno1.setNotas(i, j, nota);
			}
		}
		
		/*for (int i = 0; i < aluno1.getNotas().length; i++) {
			System.out.println("Notas em " + aluno1.getDisciplinas()[i] + ": ");
			for (int j = 0; j < aluno1.getNotas()[i].length; j++) {
				System.out.println("Nota " + (j + 1) + ": " + aluno1.getNotas()[i][j]);
				
			}
		}*/
		
		
		System.out.println("Digite a matéria que quer consultar a aprovação: ");
		String materia = scan.nextLine();
		
 		
		double[] notasRecebidas = aluno1.getListaNotas(materia);

		if (notasRecebidas != null) {

		    for (int i = 0; i < notasRecebidas.length; i++) {
		        System.out.println("Nota " + (i + 1) + ": " + notasRecebidas[i]);
		    }

		} else {
		    System.out.println("Matéria não encontrada!");
		}
		
		if (aluno1.isAprovado(materia)) {
			System.out.println("Aluno aprovado na matéria");
		} else {
			System.out.println("Aluno reprovado na matéria!");
		}
		
		/*int indiceMateria = 0;
		
		for (int i = 0; i < aluno1.getDisciplinas().length; i++) {
			if (materia.equalsIgnoreCase(aluno1.getDisciplinas()[i])) {
				indiceMateria = i;
				break;
			} 
		}*/
		
		/*System.out.println("Notas em " + aluno1.getDisciplinas()[indiceMateria] + ": ");
		
		for (int i = 0; i < aluno1.getNotas()[indiceMateria].length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + aluno1.getNotas()[indiceMateria][i]);
			
		}*/
		
		
		
	}

}
