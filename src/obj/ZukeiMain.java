package obj;

import java.util.ArrayList;

public class ZukeiMain {

	public static void main(String[] args) {
		ArrayList<Zukei> zlist = new ArrayList<Zukei>();
		zlist.add(new Shikaku(10,5));
		zlist.add(new En(5));
		zlist.add(new Sankaku(10,5));

		for(Zukei z:zlist) {
			//z.menseki();
			System.out.println(z);
			if(z instanceof En) {
				((En) z).enshu();
			}

		}
//		Zukei sh = new Shikaku(10,5);
//		sh.menseki();
//
//		Zukei e = new En(5);
//		e.menseki();
//
//		Zukei san = new Sankaku(10,5);
//		san.menseki();

	}

}
