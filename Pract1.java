package tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> s1 = () -> String.valueOf(Math.random());
		System.out.println(s1.get());
		
		Consumer<String> c1 = (x)-> {
			System.out.println("Hello "+x);
		};
		
		c1.accept("boy");
		
		List<Integer> list = new ArrayList<Integer>();  
		list.add(10);  
		list.add(20);  
		list.add(30);  
		list.add(40); 
		
		boolean isPresent = Optional.ofNullable(list).isPresent();
		System.out.println(isPresent);
		
		
		List<Integer> listInt = Arrays.asList(20,111,8,1, 2, 3, 4, 5);
		
		int sum = listInt.stream().mapToInt(Integer::intValue).sum();
		long cnt = listInt.stream().filter(o->o>5).collect(Collectors.toList()).stream().count();
		
		

	}

}
