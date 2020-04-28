package obj;

public class Drink {
	String name;
	int amount;
	
	public Drink(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	
	void show() {
		System.out.println(this.name + " " + this.amount + "ml");
	}
	
}
