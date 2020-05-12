package obj;

import java.util.ArrayList;

public class KujiMain {

	public static void main(String[] args) {
		ArrayList<Kuji> kList = new ArrayList<Kuji>();
		
		kList.add(new Kuji(123456));
		kList.add(new Kuji(101012));
		kList.add(new Kuji(654321));
		KujiChecker ch = new KujiChecker();

		for(Kuji k : kList) {
		ch.check(k);
		k.show();
		}

		System.out.println("合計" + ch.en + "円");

	}

}
