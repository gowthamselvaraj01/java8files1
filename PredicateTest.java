package tt;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.*;

public class PredicateTest {

	public static void main(String[] args) {
		
		int intarr[] = new int[] {20,10,16,19,25};
		
		Integer intarr2[] = new Integer[] {20,10,16,19,26};
		
		Predicate<Integer> predInta = i-> i>18;
		Predicate<Integer> predIntb = i-> i>20;
		
		IntPredicate predInt2 = x-> x>18;
		
		//System.out.println(predInta.test(19));
		
		System.out.println(predInta.and(predIntb).test(19));
		
		Arrays.stream(intarr).filter(predInt2).forEach(System.out::println);
		
		int sum = Arrays.asList(intarr2).stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of integer: "+sum);
		
		OptionalInt sumOpt = Arrays.asList(intarr2).stream().mapToInt(Integer::intValue).max();
		
		System.out.println(sumOpt.getAsInt());
		
	}

}
