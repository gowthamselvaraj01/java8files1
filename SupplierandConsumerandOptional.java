package tt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierandConsumerandOptional {

	public static void addList(List<Integer> list) {

		list.forEach(n-> System.out.println(n));
	}

	public static void main(String[] args) {

		//does not take any input and return value of <T> using get method
		Supplier<String> supplier = ()-> String.valueOf(Math.random());
		System.out.println(supplier.get());


		//takes argument of <T> does not returns anything, accept method is void
		Consumer<String> consumer = (x)-> {
			System.out.println("Hello "+x);
		};

		consumer.accept("Gowtham");

		Consumer<List<Integer>> listconsumer = SupplierandConsumerandOptional :: addList;

		List<Integer> list = new ArrayList<Integer>();  
		list.add(10);  
		list.add(20);  
		list.add(30);  
		list.add(40); 

		listconsumer.accept(list);

		boolean ispresent = Optional.ofNullable(list)
				.orElse(new ArrayList<Integer>())
				.stream()
				.filter(n->n==22)
				.findFirst()
				.isPresent();

		System.out.println(ispresent);

		Optional.ofNullable(list)
		.orElse(new ArrayList<Integer>())
		.stream()
		.filter(n->n==20)
		.findFirst()
		.ifPresent(i->System.out.println(i));




	}

}
