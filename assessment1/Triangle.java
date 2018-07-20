package com.javatraining.deloitte.assessment1;

public  class Triangle extends Shape {
	double b;
	double h;
	public Triangle () {
	}
	public  Triangle(double b, double h ) {
		this.b=b;
		this.h=h;
	}
	
	
	public double volume() {
		return -1;
	}
	
	
	public double area() {
		return (0.5*b*h);
	}
	@Override
	public String toString() {
		return "Triangle [base=" + b + ", height=" + h + ", volume()=" + volume() + ", area()=" + area() + "]";
	}

}
