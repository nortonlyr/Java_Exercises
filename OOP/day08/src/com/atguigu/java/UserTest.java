package com.atguigu.java;

public class UserTest {
	
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
	}
}

class User{
	//局部變量
	String name;
	int age;
	boolean isMale;
	
	public void talk(String language){
		System.out.println("我們使用" + language + "進行交流");
	}
	
	public void eat(){
		String food = "烙餅";
		System.out.println("北方人喜歡吃，" + food);
	}
	
}
