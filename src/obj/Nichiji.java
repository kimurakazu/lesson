package obj;

public class Nichiji extends Hizuke{
	int ji,hun;
	
	public Nichiji(int tuki,int hi,int ji,int hun) {
		super(tuki,hi);
		this.ji = ji;
		this.hun = hun;
	}
	
	void showJikan() {
		System.out.println(ji + "時" + hun + "分");
	}
	
	public void show() {
		super.show();
		this.showJikan();
	}

}
