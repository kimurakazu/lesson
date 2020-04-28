package obj;

public class Chugakusei extends Seito {
	int English;

	public Chugakusei(String name, int kokugo, int sansu, int shakai, int english) {
		super(name, kokugo, sansu, shakai);
		English = english;
	};
	
	public int goukei(){
		return kokugo+sansu+shakai+English;
	}
	
	public void goukeiShow() {
		System.out.println(name + " 合計"+ goukei() + "点");	
	}
	

}
