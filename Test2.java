package tt;

public class Test2 {

	public static void main(String[] args) {
		
		Child childObj = new Child();
		Parent parentObj = new Parent();
		childObj.childMethod();
		childObj.parentMethod();
		
		parentObj.parentMethod();
		
		Parent childObjnew = new Child();
		childObjnew.parentMethod();
		
		
		int a =5;
		int b=6;
		 b= a+b; 
		 System.out.println(b);
		 a= b-a;
		System.out.println(a);
		b=b-a;
		System.out.println(b);

		

	}

}
