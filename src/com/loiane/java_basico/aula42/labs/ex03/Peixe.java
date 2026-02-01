package com.loiane.java_basico.aula42.labs.ex03;

public class Peixe extends Animal {
	
	private String caracteristicas;

	public Peixe() {
		super();
		setNumPatas(0);
		setAmbiente("Mar");
		setCor("Cinzento");
		this.caracteristicas = "Barbatana e Cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracterísticas: " + caracteristicas;
		return s;
	}

}
