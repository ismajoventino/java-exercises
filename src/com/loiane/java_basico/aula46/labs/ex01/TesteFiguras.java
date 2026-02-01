package com.loiane.java_basico.aula46.labs.ex01;

public class TesteFiguras {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo(5, "Cilindro", "Azul");
		Quadrado quadrado = new Quadrado(6, "Quadrado", "Preto");
		Triangulo triangulo = new Triangulo("Triangulo", "Verde", 5, 10);
		Cubo cubo = new Cubo("Cubo", "Amarelo", 5, 3);
		Cilindro cilindro = new Cilindro("Cilindro", "Vermelho", 10, 5);
		Piramide piramide = new Piramide("Piramide", "Roxa", 5, 10);
		
		FiguraGeometrica[] arrayFiguras = new FiguraGeometrica[6];
		
		arrayFiguras[0] = circulo;
		arrayFiguras[1] = quadrado;
		arrayFiguras[2] = triangulo;
		arrayFiguras[3] = cubo;
		arrayFiguras[4] = cilindro;
		arrayFiguras[5] = piramide;
		
		System.out.println("--------------------");
		
		for (FiguraGeometrica f : arrayFiguras) {
			if(f instanceof DimencaoSuperficial) {
				DimencaoSuperficial figArea = (DimencaoSuperficial) f;
		        System.out.println("Área: " + figArea.calcularArea());
			} 
			
			if (f instanceof DimensaoVolumetrica) {
		        DimensaoVolumetrica figVolume = (DimensaoVolumetrica) f;
		        System.out.println("Volume: " + figVolume.calcularVolume());
		    }
			
			System.out.println("--------------------");
			
		}
	
		

	}

}
