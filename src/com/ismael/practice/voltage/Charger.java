package com.ismael.practice.voltage;

public class Charger implements ElectronicDevice {

private int voltage;
	
	@Override
	public void connect(int outletVoltage) throws WrongVoltageException {
		System.out.println("Charging....");

	}

}
