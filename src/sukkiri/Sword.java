package sukkiri;

public class Sword {
	private String name;
	private int damage;
	
	public String getName() {
		return this.name;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public Sword(String n,int d) {
		name = n;
		damage = d;
	}
}
