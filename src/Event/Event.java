package Event;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

	private String name;
	private Date hi = new Date();
	private List<Sankasha> sanka = new ArrayList<>();

	//イベントのコンストラクト イベントの設定、日付の設定
	public Event(String name) {
		this.name = name;

//		//日付の設定 ここを消すと今日の日付になる
//		Calendar c = Calendar.getInstance();
//		c.set(2020,5-1,8);
//		hi = c.getTime();
	}

	//参加者登録のメソッド
	public void add(Sankasha s) {
		sanka.add(s);
	}

	//詳細表示のメソッド
	public void show() {
		//イベントの名前表示
		System.out.println(this.name);

		//日付の表示
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(hi));

		//参加者の表示
		for(Sankasha s : sanka) {
			System.out.println(s.getName() + " " + s.getAge() + "歳");
		}
	}


}
