package lesson;

public class Fukushu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
		int sum = 0;
		int cnt = 0;
		
		//拡張for
		for(int tensu : tensus) {
			//全部表示する
			System.out.println(tensu);
			
			//合計を求める
			sum += tensu;
			
			//70点以上は何人かを求める
			if(tensu>=70) cnt++;
		}
		
		System.out.println("合計=" + sum);
		System.out.println("70点以上の人数=" + cnt);
		
	
		
	}

}
