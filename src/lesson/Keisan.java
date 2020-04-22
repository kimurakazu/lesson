package lesson;

public class Keisan {

	public static void main(String[] args) {
		System.out.println("整数1を入力してください：");
		int num1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("整数2を入力してください");
		int num2 = new java.util.Scanner(System.in).nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

	}

}
