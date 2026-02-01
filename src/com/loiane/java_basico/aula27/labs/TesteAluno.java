package com.loiane.java_basico.aula27.labs;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno(null, null, 0);

		System.out.println("Digite o nome do aluno: ");
		aluno1.nome = scan.nextLine();
		
		System.out.println("Digite o nome do curso:");
		aluno1.curso = scan.nextLine();
		
		System.out.println("Digite o numero de matrícula do aluno: ");
		aluno1.matricula = scan.nextInt();
		
		for (int i = 0; i < aluno1.disciplinas.length; i++) {
			scan.nextLine();
			
			System.out.println("Digite o nome da " + (i + 1) + "a disciplina: ");
			aluno1.disciplinas[i] = scan.nextLine();
			
			for (int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Nota " +(j + 1)+ ": ");
				aluno1.notas[i][j] = scan.nextDouble();
			}
			
		}
		
		scan.nextLine();
		System.out.println("Obrigado pelas informações!");
		System.out.println("As notas de qual matéria voce deseja acessar?: ");
		String materia = scan.nextLine();
		
		
		
	}

}
