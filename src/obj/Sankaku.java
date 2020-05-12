package obj;

public class Sankaku implements Zukei{
	private int x,y;


	public Sankaku(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getTeihen() {
		return x;
	}

	public void setTeihen(int x) {
		this.x = x;
	}
	
	public int getTakasa() {
		return y;
	}
	
	public void setTakasa(int y) {
		this.y = y;
	}


	public void menseki() {
		System.out.println("底辺" + this.x + "高さ" + this.y + "の三角形の面積は" + (this.x * this.y / 2));
	}



	@Override
	public String toString() {
		return "底辺=" + x + ", 高さ=" + y;
	}
	
	
}
