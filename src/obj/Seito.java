package obj;

public class Seito {
	String name;
	int kokugo,sansu,shakai;
	
	public int goukei(){
		return kokugo+sansu+shakai;
	}
	
	public double heikin() {
		return (goukei() / 3.0);
	}
	public void show() {
		System.out.println(this.name + " 国語" + this.kokugo + "点 算数" + this.sansu + "点 社会" + this.shakai + "点");
		System.out.println("合計：" + this.goukei() + "点 平均：" + this.heikin() + "点");
	}
}
