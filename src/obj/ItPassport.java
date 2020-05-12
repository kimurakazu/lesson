package obj;

public class ItPassport extends Shiken {
	int tensu;

	public ItPassport(int tensu) {
		super("ITパスポート");
		this.tensu= tensu;
	}
	
	public void showGokaku() {
		if(tensu >= 70) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}
	
}
