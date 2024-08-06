package tt;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test8 {

	public static void main(String[] args) {
		
		//find count of duplicats in int array
		List<Integer> listInt= Arrays.asList(2,3,3,4,5,5,6);
		listInt.stream().filter(i->Collections.frequency(listInt, i)>1).collect(Collectors.toSet())
		.stream().forEach(System.out::println);
		
		System.out.println("==============+++++++");
		listInt.stream().filter(i->Collections.frequency(listInt, i)>1).collect(Collectors.toSet())
		.stream().forEach((n)->{if(n==3);int x= n;System.out.println(x);});
		System.out.println("==============+++++++");
		
		List<Integer> listIntUni = listInt.stream().distinct().collect(Collectors.toList());
		
		System.out.println(listIntUni);
		
		//find count of duplicats in String array
		System.out.println("Duplicate elements in array:::");
		List<String> listStr= Arrays.asList("xxx","xxx","aaa","bbb","ccc","ccc");
		listStr.stream().filter(i->Collections.frequency(listStr, i)>1).collect(Collectors.toSet())
		.stream().forEach(System.out::println);
		System.out.println("                                  ");
		System.out.println("Unique elements in array:::");
		listStr.stream().map(i->i).collect(Collectors.toSet())
		.stream().forEach(System.out::println);
		System.out.println("                                  ");
		
		Map<String,Long> mapstr = listStr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		mapstr.forEach((k,v)->System.out.println(k+"  "+v));
		
		List<String> maps = listStr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).collect(Collectors.toList());
		System.out.println("Fing non duplicated value: ");
		maps.forEach(System.out::println);
		
		
		Map<Integer,Long> mapint = listInt.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		mapint.forEach((k,v)->System.out.println(k+"  "+v));
		
		
		//revers a string
		String name="hello";
		StringBuilder strbuilder = new StringBuilder(name);
		strbuilder.reverse();
		System.out.println(strbuilder);

		StringBuilder strbuilder2 = new StringBuilder(name);
		String charStr = "";
		char[] charArr = name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			strbuilder2.append(charArr[i]);
			//charStr = charStr + charArr[i];
		}
		System.out.println(strbuilder2);
		
		// To sort Hashmap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("John", 23);
		hm.put("Alex", 18);
		hm.put("Tim", 16);
		hm.put("Bob", 22);
		hm.put("Jack", 35);
		System.out.println("Before Sorting: ");
		System.out.println(hm);
		
		
		Map<String,Integer> hmsort1 =hm.entrySet().stream().sorted(Entry.comparingByValue()).
		collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)->e1, LinkedHashMap :: new));
		System.out.println("After Sorting by Value natural order: ");
		System.out.println(hmsort1);
		
		Map<String,Integer> hmsort2 = hm.entrySet().stream().sorted(Entry.comparingByValue(Collections.reverseOrder())).
		collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)-> e1, LinkedHashMap:: new));
		System.out.println("After Sorting by Value reverse order: ");
		System.out.println(hmsort2);
		
		Map<String,Integer> hmsort3 = hm.entrySet().stream().sorted(Entry.comparingByKey()).
		collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)->e1,LinkedHashMap :: new));
		System.out.println("After Sorting by Key natural order: ");
		System.out.println(hmsort3);
		
		Map<String,Integer> hmsort4 = hm.entrySet().stream().sorted(Entry.comparingByKey(Collections.reverseOrder())).
		collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
		System.out.println("After Sorting by Key reverse order: ");
		System.out.println(hmsort4);
		
		
		
		
	
		
		
		
		
		
		

	}

}
