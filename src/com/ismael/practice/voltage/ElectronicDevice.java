package com.ismael.practice.voltage;

public interface ElectronicDevice {

	void connect (int outletVoltage) throws WrongVoltageException;
	
}
