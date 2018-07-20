package com.javatraining.deloitte.assessment1;

public class Rectangle extends Shape {
	double l=0;
	double b=0;
	public Rectangle()
	{    
   }
	public Rectangle (double l, double b)
	{
		this.l=l;
		this.b=b;
	}
	public double Area()
	{
		return l*b;
}
	public double Volume()
	{
		return -1;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + l + ", breadth=" + b + ", Area()=" + Area() 
				+ "]";
	}
	
}
