package lesson;

public class Menseki {

	public static void main(String[] args) {
		//1. メソッド enMenseki を作る
		//   引数 int hankei
		//   hankei*hankei*3.14を表示
		//   mainからの呼び出し半径10の円の面積
		
		System.out.println("半径10の円の面積は" + enMenseki(10) );
		System.out.println();
		
		//2.半径1から5の円面積を表示
		for(int i = 1; i <= 5; i++) {	
			System.out.println("半径"+ i +"の円の面積は" + enMenseki(i) ); 
		}
		System.out.println();
		
		//3.半径3 8 20 の円面積を表示
		int[] hankeis = {3,8,20};
		for(int hankei : hankeis) { 
			System.out.println("半径" + hankei +"の円の面積は" + enMenseki(hankei)); 
		}
		System.out.println();
		
		//三角形
		System.out.println("底辺：4 高さ：2の三角形の面積は"+ sankakuMenseki(4,2) );
		
	/*	//おまけ ユーザーに半径を入力させる
		for(;;) {
			System.out.println("半径を入力：");
			System.out.println("0で終了");
			int hankei = new java.util.Scanner(System.in).nextInt();
			if( hankei == 0) break;
			enMenseki(hankei);
			System.out.println();
		}*/

	}
	
	public static double enMenseki(int hankei) {
		//System.out.println("半径" + hankei + "の円の面積は" + (hankei*hankei*3.14));
		return (hankei* hankei * 3.14);
	}
	
	
	public static int sankakuMenseki(int x,int y) {
		return (x*y/2);
	}

}
