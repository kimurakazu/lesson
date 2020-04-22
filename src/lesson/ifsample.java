package lesson;

public class ifsample {

	public static void main(String[] args) {
		System.out.println("点数を入力してください：");
		int num = new java.util.Scanner(System.in).nextInt();
		if(num >= 80) {
			System.out.println("A");
		}else if(num >= 60) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}

}
