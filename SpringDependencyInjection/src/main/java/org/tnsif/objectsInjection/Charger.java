package org.tnsif.objectsInjection;

public class Charger {
	
	private  String brand;
	private int voltage;
	private String type;
	
	
	//DI using setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void power()
	{
		System.out.println("Details Related to charger: ");
		System.out.println(brand+" "+" voltage: "+voltage+ " charger-type: "+type);
	}
	
	//to string
	
	
	
	
	

}
