package tt;

public class MerhodReference {
	
	
	public String simpleHello(String st) {
		System.out.println(st+"   Hellooo..");
		
		return "hahaha... "+st;
	}

	public static void main(String[] args) {
		
		MerhodReference merhodReference = new MerhodReference();
		
		LambdaInt lm = merhodReference::simpleHello;
		
		String rstr = lm.hello("hii....");
		System.out.println(rstr);

	}

}
