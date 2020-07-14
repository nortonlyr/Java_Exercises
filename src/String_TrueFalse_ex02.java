
public class String_TrueFalse_ex02 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("ABC");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
