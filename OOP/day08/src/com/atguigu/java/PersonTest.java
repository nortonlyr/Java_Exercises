package com.atguigu.java;


//测试类
//创建类的对象 = 累得实例化 = 实例化类
/*
类和对象的使用（面向对象思想落地的实现），
1. 创建类，设计类的成员
2. 创建类的对象
3. 通过“对象.属性“或者"对象.方法"调用对象的结构

创建了一个类的多个对象， 则每个对象都独立的拥有一套类的属性 （非static的）
 意味着，如果我们修改一个对象的属性a, 则不影响另外一个对象属性a的值
*/
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
		p1.talk("Chinese");
		
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);
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
