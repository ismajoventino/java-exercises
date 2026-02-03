package com.ismael.practice.voltage;

public class Main {

	public static void main(String[] args) {
		
		int kitchenOutlet = 110;
		int roomOutlet = 220;
		
		Blender blender = new Blender();
		Iron iron = new Iron();
		Charger charger = new Charger();

		try {
			iron.connect(roomOutlet);
			blender.connect(roomOutlet);
		} catch (WrongVoltageException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		
	}

}
