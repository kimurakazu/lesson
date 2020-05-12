package sukkiri;

public class Main {

	public static void main(String[] args) {

		Sword s = new Sword("炎の剣", 10);

		Hero h = new Hero("ミナト");
		Hero h2 = new Hero("山田");
		//h.hp = 100;

		//Hero.money = 500;


		h.setSword(s);
		System.out.println("勇者"+h.getName()+"を生み出した");
		System.out.println("現在の武器は" + h.getSword().getName());


		h.setHp(-100);
		System.out.println(h.getHp());
//		h.die();

//		Wizard w = new Wizard();
//		w.name = "ルル";
//		w.hp = 100;
//		w.heal(h);
//
//
//		Matango m1 = new Matango();
//		Matango m2 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//		m2.hp = 48;
//		m2.suffix = 'B';
//
//		h.attack(m1);
//
//		h.slip();
//		m1.run();
//		m2.run();
//		h.run();

	}

}
