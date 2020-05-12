package Event;

public class EventMain {

	public static void main(String[] args) {

		//イベントの作成
		Event e = new Event("春の人狼大会");

		//参加者の登録
		try {
			e.add(new Sankasha("田中",30));
			e.add(new Sankasha("",25));
			e.add(new Sankasha("山本",35));
		}catch(SankashaException ex) {
			System.out.println("エラー：" + ex.getMessage());
		}
		//詳細表示
		e.show();

	}

}
