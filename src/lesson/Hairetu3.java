package lesson;

public class Hairetu3 {

	public static void main(String[] args) {
		//int型の配列 nums に 8,5,9,2,4 を入れる
		int[] nums = {8,5,9,2,4};
		
		//すべて表示
		for (int num : nums) {
			System.out.println(num);
		}
		System.out.println();
		
		//合計値を表示
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println("合計値=" + sum);
		
		
		//5以上の個数を表示
		int cnt = 0;
		for (int num : nums) {
			if(num >= 5) cnt++;
		}
		System.out.println("5以上の数値の個数=" + cnt);
		
		//すべての要素を2倍に書き換え
		for (int i=0; i < nums.length; i++ ) {
			nums[i] *= 2;
		}
		System.out.println("すべての要素を2倍に書き換えました");
		
		//最大値を求める
		int max = 0;
		for (int num : nums) {
			if(max < num) max = num;
		}
		System.out.println("最大値=" + max);

	}

}
