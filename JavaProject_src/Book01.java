

public class Book01 {
	String name = "abc";
	
	protected void showName(String name) {		// try private, protected to replace public
		System.out.println(this.name);  // use this to print "abc"
	}
	public static void main(String[] args) {
		Book01 b = new Book01();
		b.showName("123");
	}
}
