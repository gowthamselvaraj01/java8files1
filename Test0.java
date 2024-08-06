package tt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test0{
	
	  public static void main(String args[]) {
		  
		  
		  Car o1 = new Car("Hyndai", "black",34);
		  Car o2 = new Car("Hyndai", "white",55);
		  Car o3 = new Car("Suzuki", "black",12);
		  Car o4 = new Car("Suzuki", "grey",44);
		  Car o5 = new Car("Tata", "grey",77);
		  Car o6 = new Car("Tata", "red",120);
		  Car o7 = new Car("Tata", "white",56);
		  
		  List<Car> listCar = new ArrayList<Car>();
		  listCar.add(o1);
		  listCar.add(o2);
		  listCar.add(o3);
		  listCar.add(o4);
		  listCar.add(o5);
		  listCar.add(o6);
		  listCar.add(o7);
		  
		  //Map<String,List<Car>> carByBrand = new HashMap<>();
		  
			 listCar.stream().collect(Collectors.groupingBy(n->n.getBrand())).
					forEach((k,v)-> {
						System.out.println("Brand: "+k+"  "+v.stream().mapToInt(l->l.getPrice()).max());
					});
					
					
					
			
			//List<List<Car>> listcar = carByBrand.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
			
			
		 // Collections.sort(listCar);
		  //listCar.forEach(n->{System.out.println(n.getPrice());});
			 
			 
			 Collections.sort(listCar, new Comparator<Car>() {

				@Override
				public int compare(Car o1, Car o2) {
					// TODO Auto-generated method stub
					return o1.getColor().compareTo(o2.getBrand());
				}
				 
				 
			});
		  
//		  Collections.sort(listCar, new Comparator<Car>() {
//
//			@Override
//			public int compare(Car o1, Car o2) {
//				return o1.getBrand().compareTo(o2.getBrand());
//			}
//			  
//		});
		  
		  listCar.forEach(n->{System.out.println(n.getBrand());});
		  
		  
		  
		  listCar.forEach(n->{System.out.println(n.getColor());});
		  System.out.println("=======================");
		  
		  
		  //listCar.forEach(l -> System.out::println);
		  
		  String color= "black";
		  listCar.stream().filter(n->n.getColor().equalsIgnoreCase(color)).collect(Collectors.toList()).
		  stream().map(y->y.getBrand()).forEach(o->{System.out.println(o);});
		  
		  System.out.println("...............");
		  listCar.stream().filter(i->i.getColor().equalsIgnoreCase("grey")).collect(Collectors.toList())
		  .stream().map(y->y.getBrand()).forEach(System.out::println);
		  
		  
		  System.out.println("=======================");
		  
		  String brand= "Suzuki";
		  listCar.stream().filter(n->n.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList()).
		  stream().map(x->x.getColor()).forEach(System.out::println);
		  
		  System.out.println("=======================");
		 /////////////////////////////////////////////
		  Singleton sobj = Singleton.getInstance();
		  Singleton sobj2 = Singleton.getInstance();
		  if(sobj==sobj2) {
			  System.out.println("Singleton true");
		  }

		  Immutable im = new Immutable("Hi Imms..");
		  im.getCllName();
		  
		  Immutable im2 = new Immutable("Hi Imms222..");
		  im.getCllName();
		  
		  
		  if(im!=im2) {
			  System.out.println("Differnt immutable object...");
		  }
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
	
}



  




