package com.atguigu.java;


//测试类
public class PersonTest {
	public static void main(String[] args) {
		//创建Person类的对象
		Person p1 = new Person();
		
		//调用对象的结构，属性，方法
		//调用属性，“对象，属性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat();
		p1.sleep();
	}
}

class Person{
	
	//属性
	String name;
	int age = 1;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("人可以吃饭");
	}
	
	public void sleep(){
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language){
		System.out.println("人可以说话，使用的是：" + language);
	}
}
