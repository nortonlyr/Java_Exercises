
public class EggCake {
	int eggCount;
	
	public EggCake(int eggCount) {
		this.eggCount = eggCount;
		System.out.println("������" + eggCount + "������");
	}
	
	public EggCake() {
//		eggCount=1;
//		System.out.println("������" + eggCount + "������!");
		this(2);
	}
	public static void main(String[] args) {
		EggCake e=new EggCake();
		EggCake e2=new EggCake(5);
	}
}
