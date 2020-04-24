package lesson;

public class Menseki {

	public static void main(String[] args) {
		//1. メソッド enMenseki を作る
		//   引数 int hankei
		//   hankei*hankei*3.14を表示
		//   mainからの呼び出し半径10の円の面積
		enMenseki(10);
		System.out.println();
		
		//2.半径1から5の円面積を表示
		for(int i = 1; i <= 5; i++) {
			enMenseki(i);
		}
		System.out.println();
		
		//3.半径3 8 20 の円面積を表示
		int[] hankeis = {3,8,20};
		for(int hankei : hankeis) {
			enMenseki(hankei);
		}

	}
	
	public static void enMenseki(int hankei) {
		System.out.println("半径" + hankei + "の円の面積は" + (hankei*hankei*3.14));
	}

}
