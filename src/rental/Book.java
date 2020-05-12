package rental;

public class Book extends Item {

	public Book(String name, int days) {
		super(name,days);
	}

	public int getPrice() {
		return this.getDays() * 50;
	}

}
