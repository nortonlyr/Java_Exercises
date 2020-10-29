//题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
public class Java_exercise_006 {
	public static void main(String[] args) {
		double sumNum = sum(20);
		System.out.println("前20規律數之和為: " + sumNum);
	}
	
	//前num的數的和
	public static double sum(int num) {
		if (num == 1) {
			return 2.0/1.0;
		} else {
			double a = getMolecule(num);
			double b = getMolecule(num-1);
			return sum(num-1) + a/b;
		}
	}
	
	//獲取分子
	public static double getMolecule(int num) {
		if (num ==1) {
			return 2.0;
		} else if (num == 2) {
			return 3.0;
		} else {
			return getMolecule(num-1) + getMolecule(num-2);
		}
	}
}
