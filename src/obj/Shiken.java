package obj;

public abstract class Shiken {
	String name;

	public Shiken(String name) {
		this.name = name;
	}
	
	abstract void showGokaku();
	void show() {
		System.out.println(this.name);
		showGokaku();
	}
}
