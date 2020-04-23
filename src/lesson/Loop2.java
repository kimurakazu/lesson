package lesson;

public class Loop2 {

	public static void main(String[] args) {
		//1. こんにちはと5回表示
		for(int i = 0; i < 5; i++) {
			System.out.println("こんにちは");
		}
		System.out.println();
		
		//2. 1 2 3 4 5と表示
		for (int i = 1;i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//3. numに数を入れて0からnumまで表示
		System.out.println("数値を入力：");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i <= num; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//4. 10以下の偶数を表示
		for (int i = 1; i <= 10; i++) {
			if( i%2 == 0 ) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		//5. 5 4 3 2 1と表示
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

	}

}
