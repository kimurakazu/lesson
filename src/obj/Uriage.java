package obj;

public class Uriage {
	int num;
	Shouhin s;
	public void show(){
		System.out.println(this.s.name + "は" + this.num + "個売れた");
	}
	
	public void showUriage() {
		System.out.println(this.num * this.s.price + "円の売り上げ");
	}
	
}
