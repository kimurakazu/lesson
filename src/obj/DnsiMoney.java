package obj;

public class DnsiMoney {
	private int kingaku,point;
	
	
	public DnsiMoney(int kingaku, int point) {
		this.kingaku = kingaku;
		this.point = point;
	}

	public int getKingaku() {
		return kingaku;
	}

	public int getPoint() {
		return point;
	}

	public void charge(int m) {
		this.kingaku += m;
	}
	
	public void buy(int m) {
		if(this.kingaku >= m) {
			this.kingaku -= m;
			this.point += m * 0.05;
		}
		else {
			System.out.println("残高が足りません。");
		}
	}
	public void change() {
		this.kingaku += this.point;
		this.point = 0;
	}
	
}
