package com.javatraining.deloitte.assessment1;

public  class Sphere extends Shape {
	double r=0;
	public Sphere () {
	}
	public Sphere(double r ) {
		this.r=r;
		
	}
	
	
	public double volume() {
		return ((4/3)*3.14*r*r*r);
	}
	

	public double area() {
		return (4*3.14*r*r);
	}
	@Override
	public String toString() {
		return "Sphere [radius=" + r + ", volume()=" + volume() + ", area()=" + area() + "]";
	}

}
