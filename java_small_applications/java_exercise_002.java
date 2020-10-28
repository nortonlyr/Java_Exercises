//题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少
//https://www.cnblogs.com/jssj/p/11222351.html
public class java_exercise_002 {
	public static void main(String[] args) {
		squareNum();
	}
	
	public static void squareNum() {
		int i = 1;
		while(true) {
			int tmp = i*i;
			int z = 1;
			while(true) {
				if(z*z - tmp >= 168) {
					break;
				}
				z++;
			}
			if (z*z - i*i == 168 && (z*z - 168 - 100)>= 0) {
				System.out.println("一個整數，它加上100后是一個完全平方數， 再加上168又是一個完全平方數，則該數為: " + (z*z - 168 - 100));
				break;
			} else {
				i++;
			}	
		}
	}
}
