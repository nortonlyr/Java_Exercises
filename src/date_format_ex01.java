import java.util.Date;
public class date_format_ex01 {
	public static void main(String[] args) {
		Date date = new Date();
		String str = String.format("%tF", date);
			System.out.println(str);
			System.out.println(date);
			
			String year = String.format("%tY", date);
			String month = String.format("%tB", date);
			String day = String.format("%td", date);
			
			System.out.println("This year is " + year);
			System.out.println("This month is " + month);
			System.out.println("Today is " + day);
			
			String hour = String.format("%tH", date);
			String minute = String.format("%tM", date);
			String second = String.format("%tS", date);
			
			System.out.println("Now the time is " + hour + ":" + minute + ":" + second);
//			System.out.println("This minute is " + minute);
//			System.out.println("This second is " + second);
			
			String str1 = String.format("%tF", date);
			System.out.println("tF format:" + str1);
			String str2 = String.format("%tD", date);
			System.out.println("tD format:" + str2);
			String str3 = String.format("%tc", date);
			System.out.println("tF format:" + str3);
			String str4 = String.format("%tr", date);
			System.out.println("tr format:" + str4);
	}
}

