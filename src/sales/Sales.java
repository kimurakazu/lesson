package sales;

public class Sales {
	//変数宣言
	private int kingaku;
	private String name;
	
	//コンストラクタ
	public Sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}

	//ゲッター
	public int getKingaku() {
		return kingaku;
	}

	public String getName() {
		return name;
	}
	
	//送料を求める
	public int getSouryou() {
		if(this.kingaku >= 3000) {
			return 0;
		}
		return 500;
	}
	
	//合計を求める
	public int getTotal() {
		return this.kingaku + this.getSouryou();
	}
	
	//詳細表示(toStringをオーバーライド)
	public String toString() {
		return "名前：" + this.name + "  金額：" + this.kingaku + "円  送料：" + this.getSouryou() + "円";
	}
	
	
}
