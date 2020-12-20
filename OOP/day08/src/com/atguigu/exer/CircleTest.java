package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		//對應方法1
//		double area = c1.findArea();
//		System.out.println(area);
		
		//對應方法2：
		c1.findArea();
	}
}

class Circle{
	
	//屬性
	double radius;
	
	//求圓的面積
	//方法1：
//	public double findArea(){
//		double area = Math.PI * radius * radius;
//		return area;
//	}
	
	//方法2：
	public void findArea(){
		double area = Math.PI * radius * radius;
		System.out.println("面積為： " + area);
	}
	
}
