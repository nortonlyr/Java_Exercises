package com.atguigu.java;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.eat();
		
		cust1.sleep(8);
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
		
		if(age > 18){
			return name;
		}else{
		return "Tom";
	}
}
	
	public String getNation(String nation){
		String info = "我的國籍是： " + nation;
		return info;
	}
	
	//體會形參是否需要設置的問題
	public void info(){

			
		}
	}
}
