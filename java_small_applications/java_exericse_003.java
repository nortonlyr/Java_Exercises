//题目：输入某年某月某日，判断这一天是这一年的第几天？
public class java_exericse_003 {
	public static void main(String[] args) {
		dayNum("2018-03-08");
		dayNum("1988-01-03");
		dayNum("1986-01-16");
		dayNum("2088-03-23");
		dayNum("1978-10-18");
	}
	
	public static void dayNum(String date) {
		String[] dateStr = date.split("-");
		int dayNum = 0;
		if(leapYear(dateStr[0])) {
			dayNum = month(dateStr[1], "1") + Integer.parseInt(dateStr[2]);
		} else {
			dayNum = month(dateStr[1], "0") + Integer.parseInt(dateStr[2]);
		}
		System.out.println("輸入日期為該 (" + dateStr[0] + ")年的第" + dayNum + "天");
	}

//根據年份判斷閏年還是普通年

	public static boolean leapYear(String year) {
		int years = Integer.parseInt(year);
		if((years%4 == 0 && years%100 !=0) || years % 400 == 0) {
			return true;
			}
		return false;
	}
	
	public static int month(String month, String flag) {
		int dayNum = 0;
		switch (month) {
		case "01": dayNum = 0; break;
		case "02": dayNum = month("01", flag) + 31; break;
		case "03": 
			if ("0".equals(flag)) {
				dayNum = month("02", flag) + 28;
			} else {
				dayNum = month("02", flag) + 29;
			}
		}
	}

