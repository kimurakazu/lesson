package lesson;

public class Jihanki {

	public static void main(String[] args) {
		
		String[] base = {"コーヒー","お茶","サイダー"};
		System.out.println("何番ですか？");
		System.out.println("0:コーヒー　1:お茶　2:サイダー");
		int num =new java.util.Scanner(System.in).nextInt();
		System.out.println(base[num]+"を購入しました。");
		

	}

}
