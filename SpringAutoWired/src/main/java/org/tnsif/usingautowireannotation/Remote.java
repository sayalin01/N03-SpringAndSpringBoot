package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	private Cell cell;
	
	//DI using setters 

	@Autowired
	//to acheive autowiring using setters , use @Autowired annotation 
	
	@Qualifier("c1")
	//when you have created multiple bean then if you want to access particular one then @Qualifier use
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	public Remote() 
	{
		System.out.println("Defult constructor for Remote ");
		
	}
	
	//injecting the object of cell class 
	
	public void remote() {
		cell.power();
	}
	
	
	
	

}
