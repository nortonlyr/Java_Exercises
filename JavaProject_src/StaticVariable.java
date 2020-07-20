
public class StaticVariable {
	static int x;
	int y;

	public StaticVariable(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		StaticVariable a=new StaticVariable(1, 2);
		StaticVariable b=new StaticVariable(13, 17);
		System.out.println("a.x的值是=" + a.x);  //静态a,会被新的b覆盖
		System.out.println("a.y的值是=" + a.y);
		
		System.out.println("b.x的值是=" + b.x);
		System.out.println("b.y的值是=" + b.y);
	}
}
