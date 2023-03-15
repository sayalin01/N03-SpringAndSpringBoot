package org.tnsif.literals;

public class SwiftEngine implements IEngine  {
	
	//1.DI in thr form of literls 
	private String company;
	private double cost;
	
	public double cost() {
		
		return cost;
	}
	
	
	public String display() {
		
		return "India";
	}
	
	// setters 
	
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}

//tostring 
	
	@Override
	public String toString() {
		return "Origin of company:" +company+ fuel;
	}


	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	

	
	
	
	
}
