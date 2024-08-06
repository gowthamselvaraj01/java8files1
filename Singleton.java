package tt;

public class Singleton {
	
	
	private static Singleton sobj = null;
	
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(sobj==null) {
			sobj = new Singleton();
		}
		return sobj;
	}
	
}
