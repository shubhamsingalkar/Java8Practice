package filterdemos;

import java.util.ArrayList;

class Laptop{
	
	int id;
	String name;
	int price;
	
	public Laptop(int id, String name, int price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class Filterdemo4 {

	public static void main(String[] args) {
	
		ArrayList<Laptop> laptops=new ArrayList<Laptop>();
		laptops.add(new Laptop(10,"Sony",90000));
		laptops.add(new Laptop(12, "Apple", 100000));
		laptops.add(new Laptop(8,"Lenovo", 75000));
		laptops.add(new Laptop(9, "Samsung", 60000));
		
		laptops.stream().filter(p->p.price>75000) //filtering
		        .forEach(p->System.out.println(p)); //iterating
    
	}

}
