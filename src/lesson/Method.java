package lesson;

public class Method {

	public static void main(String[] args) {
		//計算を呼び出す
		//int ans = keisan(21,40);
		//System.out.println(ans);
		//System.out.println(goukei(50));
		//show("田中",30);
		
		/*for(int i = 10; i<=20; i++) {
		jijo(i);
		}*/
		
		/*String[] names = {"山本","佐藤","鈴木"};
		for (String name : names) {
			hello(name);
		}*/
		
		//偶数かどうか調べる
//		if(isGuusu(new java.util.Scanner(System.in).nextInt())) {
//			System.out.println("偶数");
//		}else {
//			System.out.println("奇数");
//		}
		
		//System.out.println(getTimeName(new java.util.Scanner(System.in).nextInt()));
		
		int[] nums = {5,8,9,2};
		//printArray(nums);
		
//		String data = "apple.orange.lemon";
//		String[] fruits = data.split(".");
		
		//配列の最後の値
		System.out.println(getLast(nums));
		

	}
	
	public static int getLast (int[] array) {
		return array[array.length - 1];
	}
	
	public static void printArray(int[] array) {
		for(int num:array) {
			System.out.println(num);
		}
	}
	
	public static String getTimeName(int hour) {
		if(0 <= hour && hour <= 11 ) {
			return "午前";
		}
		if(12 <= hour && hour <= 23) {
			return "午後";
		}
		return "エラー";
	}
	
	public static boolean isGuusu(int num) {
		return (num % 2 == 0);
	}
	
	public static void jijo (int num) {
		System.out.println(num + "の二乗は" + num * num);
	}
	
	public static void jijo (double num) {
		System.out.println(num + "の二乗は" + num * num);
	}
	
	public static void hello(String name) {
		System.out.println(name + "さんこんにちは");
	}
	
	public static int keisan(int num1 ,int num2) {
		//System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		return (num1+num2);
	}

	public static int goukei(int num) {
		int sum = 0;
		for (int i=1;i<=num;i++) {
			sum+=i;
		}
		return sum;
		//System.out.println(num1 + "から" + num2 + "までの合計は" + sum);
	}
	
	public static void show (String name,int age) {
		System.out.println(name + "さんは" + age + "歳です。");
	}

}
