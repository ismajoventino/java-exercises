package com.ismael.practice.voltage;

public class Blender implements ElectronicDevice {

	@Override
	public void connect(int outletVoltage) throws WrongVoltageException {
		int voltage = 110;
		if(outletVoltage > voltage) {
			throw new WrongVoltageException("It burned out!");
		}
		System.out.println("It's working!");
		
	}

}
