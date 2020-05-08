package Event;

public class EventMain {

	public static void main(String[] args) {

		//イベントの作成
		Event e = new Event("春の人狼大会");

		//参加者の登録
		e.add(new Sankasha("田中",30));
		e.add(new Sankasha("山田",25));
		e.add(new Sankasha("山本",35));

		//詳細表示
		e.show();

	}

}
