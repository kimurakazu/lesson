package lesson;

public class ifsample {

	public static void main(String[] args) {
		//入力した数が5以上10以下ならあたり　それ以外ははずれ
		System.out.println("数を入力してください：");
		int num = new java.util.Scanner(System.in).nextInt();
		if(num >= 5 && num <= 10) {
			System.out.println("あたり");
		}else {
			System.out.println("はずれ");
		}

	}

}
