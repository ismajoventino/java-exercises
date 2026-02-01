package com.loiane.java_basico.aula35;

public class Calculadora {

static double resultado;
	
	public static double somar(double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	public static double subtrair(double num1, double num2) {
		resultado = num1 - num2;
		return resultado;
	}
	
	public static double multiplicar(double num1, double num2) {
		resultado = num1 * num2;
		return resultado;
	}

	public static double dividir(double num1, double num2) {
		resultado = num1 / num2;
		return resultado;
	}
	
	public static double potencia(double num1, double num2) {
		resultado = Math.pow(num1, num2);
		return resultado;
	}
	
	public static double fatorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * fatorial(num - 1);
	}
	
}
