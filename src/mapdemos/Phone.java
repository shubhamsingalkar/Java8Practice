package mapdemos;

public class Phone {

	int num;
	int cost;
	
	public Phone(int num, int cost) {
		super();
		this.num = num;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Phone [num=" + num + ", cost=" + cost + "]";
	}
	
}
