package rental;

public class RentalMain {

	public static void main(String[] args) {
		
		Rental ren = new Rental();
		
		ren.add(new Book("ワンピース",7));
		ren.add(new CD("パプリカ",3));
		ren.add(new CD("Lemon",1));
	
		ren.show();
		System.out.println("合計 " + ren.getGoukei() + "円");

	}
	
	
}
