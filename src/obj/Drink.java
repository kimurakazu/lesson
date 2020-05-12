package obj;

public class Drink {
	private String name;
	private int amount;
	
	public Drink(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	void show() {
		System.out.println(this.name + " " + this.amount + "ml");
	}
	
}
