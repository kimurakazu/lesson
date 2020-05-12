package sales;

public class MemberSales extends Sales{
	
	//コンストラクタ
	public MemberSales(String name, int kingaku) {
		super(name, kingaku);
	}
	
	//送料を求める(オーバーライド)
	public int getSouryou() {
		return 0;
	}
}
