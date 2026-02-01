package com.loiane.java_basico.aula34.labs;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ESCOLHA:");
		System.out.println("1. SOMA");
		System.out.println("2. SUBTRAÇÃO");
		System.out.println("3. DIVISÃO");
		System.out.println("4. MULTIPLICAÇÃO");
		System.out.println("5. EXPOENTE");
		System.out.println("6. FATORIAL");
		
		int escolha = scan.nextInt();
		int num1;
		int num2;
		
	    switch(escolha) {
	    case 1: 
	    	System.out.println("Numero 1: ");
	    	num1 = scan.nextInt();
	    	System.out.println("Numero 2: ");
	    	num2 = scan.nextInt();
	    	
	    	System.out.println("RESULTADO: " + Calculadora.somar(num1, num2));
	    	
	    	break;
	    	
	    case 2: 
	    	System.out.println("Numero 1: ");
	    	num1 = scan.nextInt();
	    	System.out.println("Numero 2: ");
	    	num2 = scan.nextInt();

	    	System.out.println("RESULTADO: " + Calculadora.subtrair(num1, num2));
	    	
	    	break;
	    	
	    case 3: 
	    	System.out.println("Numero 1: ");
	    	num1 = scan.nextInt();
	    	System.out.println("Numero 2: ");
	    	num2 = scan.nextInt();
	    	
	    	System.out.println("RESULTADO: " + Calculadora.dividir(num1, num2));
	    	
	    	break;
	    	
	    case 4: 
	    	System.out.println("Numero 1: ");
	    	num1 = scan.nextInt();
	    	System.out.println("Numero 2: ");
	    	num2 = scan.nextInt();
	    	
	    	System.out.println("RESULTADO: " + Calculadora.multiplicar(num1, num2));
	    	
	    	break;
	    	
	    case 5: 
	    	System.out.println("Numero 1: ");
	    	num1 = scan.nextInt();
	    	System.out.println("Numero 2: ");
	    	num2 = scan.nextInt();
	    	
	    	System.out.println("RESULTADO: " + Calculadora.potencia(num1, num2));
	    	
	    	break;
	    
	    case 6:
	    	System.out.println("Numero: ");
	    	num1 = scan.nextInt();
	    	
	    	Calculadora.fatorial(num1);
	    	
	    	System.out.println("RESULTADO: " + Calculadora.fatorial(num1));
	    	
	    	break;
	    	
	    default:
	    	System.out.println("Opção Inválida!");
	    }
		

	}

}
