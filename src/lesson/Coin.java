package lesson;

public class Coin {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		
		int sum = 0;
		for(int coin : coins ) {;
			System.out.println(coin + "円玉は何枚？：");
			int num = new java.util.Scanner(System.in).nextInt();
			sum += num * coin;
		}
		System.out.println("合計は" + sum + "円");

	}

}
