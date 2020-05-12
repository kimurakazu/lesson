package obj;

public class Shouhin {
	
	String name;
	int price;
	public static final double tax=0.1;
	
	public Shouhin(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.name + " " + this.price + "円");
	}
	
	public void showTax() {
		System.out.println("10% = " + this.price * 0.1 + "円");
	}
}
