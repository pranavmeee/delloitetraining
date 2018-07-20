package com.javatraining.deloitte.assessment1;
public abstract class Shape {
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(5,15);
		Cube c=new Cube(4);
		Triangle t= new Triangle(3,4);
		Sphere s= new Sphere(4);
		System.out.println(r);
		System.out.println(c);
		System.out.println(t);
		System.out.println(s);
	}

}

