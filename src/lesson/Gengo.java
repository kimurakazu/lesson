package lesson;

public class Gengo {

	public static void main(String[] args) {
		int gengou;
		
		System.out.println("元号西暦変換");
		System.out.println("1:昭和 2:平成 3:令和");
		for(;;) {
			gengou = new java.util.Scanner(System.in).nextInt();
			if(gengou >= 1 && gengou <= 3) break;
			System.out.println("1～3以外の数値が入力されました。入力しなおしてください。");
		}
		System.out.println("年を入力");
		int nen = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(getGengouName(gengou) + nen +"年は西暦" + getSeireki(gengou,nen) + "年");
		
	}

	public static int getSeireki (int gengou,int nen) {
		if(gengou == 1) return 1925 + nen;
		if(gengou == 2) return 1988 + nen;
		if(gengou == 3) return 2018 + nen;
		return 0;
	}
	public static String getGengouName (int gengou) {
		if(gengou == 1) return "昭和";
		if(gengou == 2) return "平成";
		if(gengou == 3) return "令和";
		return "エラー";
	}
}
