
public class for_ex02 {
	public static void main(String[] args) {
		int cock, hen, chick;
		for (cock=1; cock<=20; cock++) {
			for(hen=1; hen<=33; hen++) {
				for(chick=3; chick<=99; chick+=3) {
					if(cock*5+hen*3+chick/3==100) {
						if(cock+hen+chick==100) {
							System.out.println("cock: " + cock + " hen: "+ hen + " chick: " + chick);
						}
					}
				}
			}
		}
	}
}
