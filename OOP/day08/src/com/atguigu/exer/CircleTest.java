package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		double area = c1.findArea();
		System.out.println(area);
	}
}

class Circle{
	
	//屬性
	double radius;
	
	//求圓的面積
	public double findArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
	
}
