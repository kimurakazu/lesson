package obj;
import java.util.ArrayList;

public class SeitoMain {

	public static void main(String[] args) {
		ArrayList<Chugakusei> cg = new ArrayList<Chugakusei>();

		cg.add(new Chugakusei("田中",50,40,70,80));
		cg.add(new Chugakusei("湊",70,60,40,50));
		cg.add(new Chugakusei("朝香",80,60,90,70));

		int sum=0;
		for(Chugakusei c:cg) {
			c.goukei();
			sum += c.goukei();
			c.goukeiShow();

		}
		System.out.println("全員の合計点は" + sum);

	}

}
