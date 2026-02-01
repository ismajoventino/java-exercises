package com.loiane.java_basico.aula36.labs;

import java.util.Scanner;

public class TesteAlunos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Curso curso1 = new Curso();
		
		Aluno[] alunos = new Aluno[2];
		double[] notas = new double[3];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno " + (i+1));
			Aluno aluno = new Aluno();
		
			System.out.println("Nome:");
			aluno.setNome(scan.nextLine());
		
			System.out.println("Matricula");
			aluno.setMatricula(scan.next());
			
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j + 1) + ": ");
				notas[i] = scan.nextDouble();
				scan.nextLine();
				
			}
			aluno.setNotas(notas);
		}
		
		curso1.getAlunos()[0].calcularMedia(notas);
		
		
		

	}

}
