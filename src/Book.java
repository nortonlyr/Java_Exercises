
public class Book {
String name = "Î÷ÓÎ¼Ç";
public String getName() {
	return name;
}

public static void main(String[] args) {
	Book b = new Book();
	System.out.println(b.getName());
	System.out.println(new Book().getName());
}
}
