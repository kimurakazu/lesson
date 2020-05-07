package renal;

import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {
		
		ArrayList<Item> ilist = new ArrayList<Item>();
		ilist.add(new Book("ワンピース",7));
		ilist.add(new CD("パプリカ",3));
		ilist.add(new CD("Lemon",1));
		
		int sum = 0;
		
		for(Item i :ilist) {
			System.out.println(i);
			sum += i.getPrice();
		}
		System.out.println("合計 " + sum + "円");

	}

}
