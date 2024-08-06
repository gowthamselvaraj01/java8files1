package tt;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureExample1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,9,14);  
		
		list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num))).
		map(CompletableFuture->CompletableFuture.thenApply(n->n*n)).
		map(t->t.join()).forEach(System.out::println);

	}
	
	
	
	private static int getNumber(int a)  
	{  
	return a*a;  
	}  

}
