package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {

		ArrayList<Drink> dList = new ArrayList<Drink>();
		dList.add(new Drink("コーラ",500));
		dList.add(new Drink("サイダー",350));
		dList.add(new Drink("コーヒー",200));
		dList.add(new Sake("ビール",500,0.05));
		int sum = 0;
		
		for(Drink d:dList) {
			d.show();
			sum += d.getAmount();
		}
		System.out.println("合計 " + sum + "ml");
		
//		Sake s = new Sake("ビール",500,0.05);
//		s.show();

	}

}
