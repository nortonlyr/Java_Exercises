
public class Pool {
	static public int water=0;
	public void outlet() {
		if (water >=2 ) {
			water = water - 2;
		}else{
			water = 0; 
		}
	}
	
	public void inlet() {
		water = water + 3;
	}
	
	public static void main(String[] args) {
		Pool out=new Pool();
		Pool in= new Pool();
		System.out.println("水池中的水量" + Pool.water);
		
		System.out.println("向水池里面注水两次 ");
		in.inlet();
		in.inlet();
		System.out.println("水池中的水量" + Pool.water);
		System.out.println("水池放水一次");
		out.outlet();
		System.out.println("水池中的水量" + Pool.water);
	}
}

