package obj;

public class Main {

	public static void main(String[] args) { 
		
//		Teacher t = new Teacher("田中");
//		t.show();
//		
//		Seito s = new Seito();
//		s.name = "田中";
//		s.kokugo = 80;
//		s.sansu = 70;
//		s.shakai = 50;
//		s.show();
//		System.out.println("合計：" + s.goukei() + "点 平均：" + s.heikin() + "点");
		
//		Sankaku s = new Sankaku();
//
//		s.menseki();
//		
//		Shouhin sh = new Shouhin("りんご",100);
//		Uriage u = new Uriage();
//		u.s = sh;
//		u.num = 5;
//		sh.show();
//		sh.showTax();
//		u.show();
//		u.showUriage();
//		System.out.println();
//		
//		Shouhin sh2 = new Shouhin("みかん",150);
//		Uriage u2 = new Uriage();
//		u2.s = sh2;
//		u2.num = 3;
//		u2.show();
//		u2.showUriage();
//		
//		
//		En e = new En();
//		e.n = 3;
//		e.menseki();
//		e.enshu();
		
		DnsiMoney dm = new DnsiMoney(0,0);
		dm.charge(1000);	
		dm.buy(500);
		System.out.println("残高=" + dm.getKingaku());
		System.out.println("ポイント=" + dm.getPoint());
		System.out.println();
		dm.change();
		System.out.println("残高=" + dm.getKingaku());
		System.out.println("ポイント=" + dm.getPoint());
		
//		Hizuke toDay = new Hizuke();
//		toDay.hi = 27;
//		toDay.tuki = 4;
//		toDay.show();
////		
//		Hizuke day = new Hizuke();
//		day.hi = 7;
//		day.tuki = 5;
//		day.show();
		
//		Nichiji n = new Nichiji();
//		n.tuki = 4;
//		n.hi = 28;
//		n.ji = 13;
//		n.hun = 30;
//		n.show();
		//n.showJikan();
		
//		Book b = new Book("それから",500,"夏目漱石");
//		
//		Uriage uri = new Uriage();
//		uri.num = 5;
//		
//		b.show();
		
//		Nichiji n = new Nichiji(4,28,15,5);
//		n.show();
		
//		SeiSankaku ss = new SeiSankaku(6);
//		ss.menseki();
		
//		En e1 = new En(5);
//		En e2 = new En(5);
//		
//		if(e1.equals(e2)) {
//			System.out.println("同じ");
//		}else {
//			System.out.println("違う");
//		}

	}

}
