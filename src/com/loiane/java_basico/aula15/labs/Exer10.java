package com.loiane.java_basico.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o seu salário atual:");
		double salarioAtual = scan.nextDouble();
		
		double novoSalario;
		double valorAumento;
		if (salarioAtual <= 280) {
			novoSalario = (salarioAtual * 1.2);
			valorAumento = (novoSalario - salarioAtual);
			
			System.out.println("SALARIO ANTERIOR: " + salarioAtual);
			System.out.println("AUMENTO: 20%");
			System.out.println("VALOR DO AUMENTO: " + valorAumento);
			System.out.println("NOVO SALÁRIO: " + novoSalario);
		} else if (salarioAtual > 280 && salarioAtual < 700) {
			novoSalario = (salarioAtual * 1.15);
			valorAumento = (novoSalario - salarioAtual);
			
			System.out.println("SALARIO ANTERIOR: " + salarioAtual);
			System.out.println("AUMENTO: 15%");
			System.out.println("VALOR DO AUMENTO: " + valorAumento);
			System.out.println("NOVO SALÁRIO: " + novoSalario);
		} else if (salarioAtual >= 700 && salarioAtual < 1500) {
			novoSalario = (salarioAtual * 1.1);
			valorAumento = (novoSalario - salarioAtual);
			
			System.out.println("SALARIO ANTERIOR: " + salarioAtual);
			System.out.println("AUMENTO: 10%");
			System.out.println("VALOR DO AUMENTO: " + valorAumento);
			System.out.println("NOVO SALÁRIO: " + novoSalario);
		} else {
			novoSalario = (salarioAtual * 1.05);
			valorAumento = (novoSalario - salarioAtual);
			
			System.out.println("SALARIO ANTERIOR: " + salarioAtual);
			System.out.println("AUMENTO: 05%");
			System.out.println("VALOR DO AUMENTO: " + valorAumento);
			System.out.println("NOVO SALÁRIO: " + novoSalario);
		}
		
	}

}
