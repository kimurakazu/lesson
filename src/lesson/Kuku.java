package lesson;

public class Kuku {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			
			int num1 =  new java.util.Random().nextInt(9) + 1;
			int num2 =  new java.util.Random().nextInt(9) + 1;
			int num3 = num1 * num2;
		
			System.out.println(num1 + "*" + num2 + "=");
			int answer = new java.util.Scanner(System.in).nextInt();
			
			if(answer == 0) {
				System.out.println("0が入力されたため強制終了します。\n");
				break;
			}
			
			if( num3 == answer ) {
			System.out.println("正解\n");
			count++;
			}else {
			System.out.println("間違い。正解は" + num3 + "\n");
			}
		}
		System.out.println(count + "/5正解！");

	}

}
