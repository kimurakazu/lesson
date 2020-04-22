package lesson;

public class main {

	public static void main(String[] args) {
		int tuki =4,hi = 22;
		System.out.println("今日は" + tuki + "月" + hi + "日");
		
		double p = 3.14;
		System.out.println("円周率は" + p + "です。");
		 
		int a = 20 ,b;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);
		System.out.println("今日は\"四月\"です");
		System.out.println("\\100\n");

		System.out.println("C:に\"フォルダ\"を作成\n");
		
		int num = 10,amari= num % 3;
		System.out.println(num + "/3の余りは" + amari + "\n");
		
		double d = 3;
		int n = (int)3.2;
		String s= "ベスト" + 3;
		
		int kokugo = 70;
		int sansu = 75;
		double avg = (kokugo + sansu) / 2.0; //自動型変換
		
		System.out.println("平均点は" + (double)(kokugo + sansu) / 2); //キャスト変換
		System.out.println("平均点は" + avg + "\n");
		
		
		int num1 = 3,num2 = 5;
		System.out.println("足し算の結果は" + (num1 + num2)+"\n");
		
		System.out.print("私は");
		System.out.print("きむら");
		System.out.println("です");
		
		int m = Math.max(10,20);
		System.out.println(m);
		
		String age = "31";
		int nAge = Integer.parseInt(age);
		System.out.println(age+1);
		
		int r = new java.util.Random().nextInt(99);
		System.out.println(r + "\n");
		
		//サイコロ
		int dice = ( new java.util.Random().nextInt(6) ) + 1;
		System.out.println("サイコロの出目は" + dice);
	}

}
