package keisho;

public class Hero extends Character{

	public Hero() {
		
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("マタンゴ" + m.suffix + "に"+"5ダメージ！");
		m.hp -= 5;
		System.out.println("マタンゴ" + m.suffix + "の残りHPは" + m.hp);
	}
	
	public String toString() {
		return "名前:" + this.name;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if( this.name.equals(h.name) ) {
				return true;
			}
		}
		
		return false;
	}

}
