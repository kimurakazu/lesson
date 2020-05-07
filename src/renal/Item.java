package renal;

public abstract class Item {
	String name;
	int days;
	
	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}

	public abstract int getPrice();

	@Override
	public String toString() {
		return "名前：" + name + "   日数：" + days + "日   料金：" + getPrice() + "円";
	}
	
}
