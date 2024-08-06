package tt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		
		List<Integer> listInt = Arrays.asList(20,111,8,1, 2, 3, 4, 5);
		List<String> listIntStr = Arrays.asList("1", "2", "3", "4", "5");
		List<String> listStr = Arrays.asList("hello", "how", "are", "you", "all","okay");
		
		listInt.stream().sorted().filter(x->x%2==0).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("=============");
		//even numbers
		listInt.stream().filter(n->n%2==0).collect(Collectors.toList())
		.forEach(System.out:: println);
		
		//sum of integers in list
		int sum = listInt.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum value: "+sum);
		
		//max of integers in list
		int max = listInt.stream().mapToInt(n->n).max().getAsInt();
		System.out.println("Max value: "+max);
		
		//check value passed present in list
		boolean ispresent = listInt.stream().anyMatch(n->n==20);
		System.out.println("Is present: "+ispresent);
		
		String liststrConcat = listIntStr.stream().collect(Collectors.joining()); 
		System.out.println("Concated string: "+liststrConcat);
		
		double averageVal = listStr.stream().mapToInt(String::length).average().orElse(0.0);
		System.out.println("Average val: "+ averageVal);
		
		long cv = listInt.stream().filter(n->n>4).collect(Collectors.toList()).stream().count();
		System.out.println("elements greater than given value: "+cv);

	}

}
