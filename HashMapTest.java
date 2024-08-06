package tt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapTest {
	
	
	public static void main(String[] args) {
		
		HashMap<String,Car> hm = new HashMap<String,Car>();
		hm.put("1", new Car("Hyndai", "black",45));
		hm.put("2", new Car("Honda", "black",66));
		hm.put("3", new Car("Suzuki", "black",88));
		hm.put("4", new Car("Tata", "black",32));
		
		//1st way
		for(Map.Entry<String,Car> entry: hm.entrySet()) {
			
			System.out.println("Key: "+entry.getKey());
			System.out.println("Key: "+entry.getValue().getBrand());
			
		}
		//2nd way
		hm.forEach((k,v)->System.out.println("Key: "+k+" "+"Value: "+v.getColor()));
		
		ArrayList<Integer> numbersList
		= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 9));
		 
		Map<Integer, Long> elementCountMap = numbersList.stream()
		.collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
		
		
		System.out.println(numbersList.stream().mapToInt(Integer::intValue).sum()); 
		System.out.println(numbersList.stream().mapToInt(Integer::intValue).max().getAsInt()); 
		 
		//System.out.println(elementCountMap);
		
		
	}
	

}
