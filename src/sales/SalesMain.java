package sales;

import java.util.ArrayList;

public class SalesMain {

	public static void main(String[] args) {
		
		//リストの作成
		ArrayList<Sales> slist = new ArrayList<>();
		
		//リストの追加
		slist.add(new Sales("田中",1500));
		slist.add(new Sales("山田",3000));
		slist.add(new MemberSales("鈴木",1000));
		
		//合計を入れる変数を用意
		int sum = 0;
		
		//表示
		for(Sales s : slist) {
			sum += s.getTotal();
			System.out.println(s.toString());
		}
		System.out.println("合計：" + sum + "円");
		

	}

}
