package Event;

public class EventMain {

	public static void main(String[] args) {
		
		Event e = new Event("春の人狼大会");
		e.add(new Sankasha("田中",30));
		e.add(new Sankasha("山田",25));
		e.add(new Sankasha("山本",35));
		
		e.show();

	}

}
