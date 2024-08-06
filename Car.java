package tt;

public class Car implements Comparable<Car>{
	
	
    private String brand;
    private String color;
    private int price;
    
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Car obj) {
		if (price == obj.price){
			return 0;
		}else if(price>obj.price){
			return 1;
		}
		else return -1;
	}
	

}
