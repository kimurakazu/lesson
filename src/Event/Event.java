package Event;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Event {

	private String name;
	private Date hi = new Date();
	private List<Sankasha> sanka = new ArrayList<>();

	public Event(String name) {
		this.name = name;
		Calendar c = Calendar.getInstance();
		c.set(2020,5-1,8);
		hi = c.getTime();
	}

	public void add(Sankasha s) {
		sanka.add(s);
	}

	public void show() {
		System.out.println(this.name);
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(hi));
		for(Sankasha s : sanka) {
			System.out.println(s.getName() + " " + s.getAge());
		}
	}


}
