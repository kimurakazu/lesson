package obj;

public class Seito {
	private String name;
	private int kokugo,sansu,shakai;



	public Seito(String name, int kokugo, int sansu, int shakai) {
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
		this.shakai = shakai;
	}

	public String getName() {
		return name;
	}

	public int goukei(){
		return kokugo+sansu+shakai;
	}

	public double heikin() {
		return (goukei() / 3.0);
	}
	public void show() {
		System.out.println(this.name + " 国語" + this.kokugo + "点 算数" + this.sansu + "点 社会" + this.shakai + "点");

	}
}
