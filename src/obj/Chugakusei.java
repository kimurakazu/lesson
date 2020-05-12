package obj;

public class Chugakusei extends Seito {
	private int English;

	public Chugakusei(String name, int kokugo, int sansu, int shakai, int english) {
		super(name, kokugo, sansu, shakai);
		English = english;
	}

	public int getEnglish() {
		return English;
	}

	public int goukei(){
		return super.goukei()+English;
	}

	public void goukeiShow() {
		System.out.println(this.getName() + " 合計"+ goukei() + "点");
	}


}
