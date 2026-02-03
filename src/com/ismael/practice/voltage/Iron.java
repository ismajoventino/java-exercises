package com.ismael.practice.voltage;

public class Iron implements ElectronicDevice {

	@Override
	public void connect(int outletVoltage) throws WrongVoltageException {
		int voltage = 220;
		if(outletVoltage < voltage) {
			System.out.println("Low Voltage!");
		} else {
			System.out.println("It's Working!");
		}

	}

}
