package lesson;

public class Hairetu {

	public static void main(String[] args) {
		int[] prices = {100,200,150};
		//System.out.println(prices.length);

		/*
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		System.out.println();*/
		
		/*String[] names = {"コーラ","コーヒー","水"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}*/
		
		/*int[] points = {80,90,60,70,50};
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < points.length; i++) {
			sum += points[i];
			if(points[i] >= 70) {
				cnt++;
			}
		}
		System.out.println("数値の合計=" + sum);
		System.out.println("70以上の数値の個数=" + cnt);*/
		
		int[] seq = {0,1,3,2,1,0,2,3};
		char[] base = {'A','T','G','C'};
		
		for(int i=0; i < seq.length; i++) {
			System.out.print(base[ seq[i] ]);
		}
		
		String str = "あいう";
		System.out.println(str.length());
	}

}
