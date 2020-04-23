package lesson;

public class LoopSample {

	public static void main(String[] args) {
	
		//数を入力
		//1からその数まで表示
		System.out.println("数値を入力：");
		int num = new java.util.Scanner(System.in).nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		/*while(true) {
			System.out.println("数値を入力：");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == 0) {
				break;
			}
			System.out.println(num + "*2=" + num * 2);
		}*/
		
		/*int num = 0;
		do {
			System.out.println("数値を入力：");
			num = new java.util.Scanner(System.in).nextInt();
			System.out.println(num + "*2=" + num * 2 + "\n");
		} while(num != 0);*/
		
		/*for (int i = 0; i < 10; i++) {
			if(i % 2 == 1)
			System.out.println(i);
		}*/
		
		/*for (int i = 1; i < 10; i++) {
			for(int j = 1; j < 10;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}*/
		
		/*for (int i=1; i<10; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}*/
	}

}
