package obj;
import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> kuku = new ArrayList<KukuMondai>();
		
		for(int i=0;i<5;i++) {
			kuku.add(new KukuMondai());
		}
		
		for(KukuMondai k : kuku) {
			k.show();
			k.check(new java.util.Scanner(System.in).nextInt());
		}
		
	}

}
