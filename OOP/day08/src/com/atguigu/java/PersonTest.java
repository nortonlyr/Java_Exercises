package com.atguigu.java;


//测试类
public class PersonTest {
	public static void main(String[] args) {
		//创建Person类的对象
		Person p1 = new Person();
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
