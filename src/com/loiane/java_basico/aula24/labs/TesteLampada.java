package com.loiane.java_basico.aula24.labs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampadaCara = new Lampada();
		
		lampadaCara.marca = "New Home";
		lampadaCara.tipo = "Led";
		lampadaCara.cor = "RGB (Todas as cores)";
		lampadaCara.voltagem = 127;
		lampadaCara.preco = 28.5;
		
		System.out.println(lampadaCara.cor);
		System.out.println(lampadaCara.marca);
		System.out.println(lampadaCara.preco);
		System.out.println(lampadaCara.voltagem);
		
		Lampada lampadaBarata = new Lampada();
		
		lampadaBarata.marca = "New Home";
		lampadaBarata.tipo = "Led";
		lampadaBarata.cor = "Amarelo";
		lampadaBarata.voltagem = 227;
		lampadaBarata.preco = 10;
		
		System.out.println(lampadaBarata.cor);
		System.out.println(lampadaBarata.marca);
		System.out.println(lampadaBarata.preco);
		System.out.println(lampadaBarata.voltagem);

	}

}
