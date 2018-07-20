package com.javatraining.deloitte.assessment1;

public class Cube extends Shape {
	double l;
	
	public Cube () {
	}
	public  Cube(double l) {
		this.l=l;
		
	}
	
	
	public double volume() {
		return (l*l*l);
	}
	
	
	public double area() {
		return (6*l*l);
	}
	@Override
	public String toString() {
		return "Cube [length=" + l + ", volume()=" + volume() + ", area()=" + area() + "]";
	}
	
}
