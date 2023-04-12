package org.tnsif.autowireexample;

public class Camera {
	
	lense l;
	
	public void setL(lense l) {
		this.l=l;
	}
	
	
	public void accept()
	{
		l.company();
	}


	public lense getL() {
		return l;
	}


	public Camera(lense l) {
		super();
		this.l = l;
	}

	
	
}
