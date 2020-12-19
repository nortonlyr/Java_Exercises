package com.atguigu.java;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.eat();
	}
}

class Customer{
	
	//屬性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客戶吃飯");
	}
	
	public void sleep(int hour){
		System.out.println("休息了" + hour + "個小時");
	}
	
	public String getName(){
		return name;
	}
	
	public String getNation(String nation){
		String info = "我的國籍是： " + nation;
		return info;
	}
}
