package obj;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> kuku = new ArrayList<KukuMondai>();
		
		for(int i=0;i<5;i++) {
			kuku.add(new KukuMondai());
		}
		
		for(KukuMondai k : kuku) {
			k.show();
			try {
				k.check(new java.util.Scanner(System.in).nextInt());
			}catch(InputMismatchException e) {
				System.out.println("数字以外が入力されました。");
			}
			System.out.println();
		}
		
	}

}
