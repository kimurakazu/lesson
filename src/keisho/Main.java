package keisho;

public class Main {

	public static void main(String[] args) {

		Hero h1 = new Hero();
		h1.name = "湊";
		h1.hp = 100;
		System.out.println(h1);
		
		Hero h2 = new Hero();
		h2.name = "湊";
		h2.hp = 100;
		System.out.println(h2);
		
		if(h1.equals(h2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
	
				

//		Matango m1 = new Matango();
//
//		ArrayList<Character> party = new ArrayList<Character>();
//		party.add(new SuperHero());
//		party.add(new Dancer());
//		party.add(new Hero());
//
//		for (Character ch : party) {
//			ch.attack(m1);
//		}
//		
//		Character c = new SuperHero();
//		if(c instanceof SuperHero) {
//			SuperHero sh = (SuperHero)c;
//		}

	}

}
