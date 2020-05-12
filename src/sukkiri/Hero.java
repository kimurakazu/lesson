package sukkiri;

public class Hero {
	private String name;
	private int hp;
	private Sword sword;
	public static final int money = 100;


	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this("ダミー");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if(hp <= 0) {
		System.out.println("HPはマイナスにできません。");
		}else {
			this.hp = hp;
		}
	}

	public void setSword(Sword s) {
		this.sword = s;
	}

	public Sword getSword() {
		return sword;
	}

	public static void setRandomMoney() {
		//Hero.money = (int)Math.random()*1000;
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("マタンゴ" + m.suffix + "に"+sword.getDamage()+"ダメージ！");
		m.hp -= sword.getDamage();
		System.out.println("マタンゴ" + m.suffix + "の残りHPは" + m.hp);

		System.out.println("反撃を受けた");
		this.hp -= 2;
		if(this.hp <= 0) {
			this.die();
		}
	}

	private void die() {
		System.out.println(this.name + "は死亡してしまった");
	}

	public void Sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った！");
		System.out.println("HPが"+ sec +"ポイント回復した！");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}

}
