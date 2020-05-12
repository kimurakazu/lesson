package lesson;

public class Hairetu2 {
	
	public static void showKion (double kion) {
		System.out.println(kion + "度");
	}

	public static void main(String[] args) {
		
		;
		
		double[] kions = {15.5,20.1,18.3};
		
		
		for (double kion : kions) {
			showKion(kion);
		}
			
		/*int[] prices = {100,200,150};
		for (int value:prices) {
			System.out.println(value);
		}
		System.out.println();*/
		
		/*String[] names = {"コーラ","コーヒー","水"};
		for (String n : names) {
			System.out.println(n + "は" + n.length() + "文字");
		}
		System.out.println();*/
		
		/*int[] points = {80,90,60,70,50};
		int sum = 0;
		int cnt = 0;
		for(int p : points) {
			sum += p;
			if(p >= 70) {
				cnt++;
			}
		}
		System.out.println("数値の合計=" + sum);
		System.out.println("70以上の数値の個数=" + cnt);*/
		
		/*int[] num1 = {1,2,3};
		int[] num2;
		num2 = num1;
		num2[0] = 100;
		System.out.println(num1[0]);*/
		
		
	}
	


}
