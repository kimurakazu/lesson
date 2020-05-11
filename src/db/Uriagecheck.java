package db;

import java.util.ArrayList;

public class Uriagecheck {

	public static void main(String[] args) {
		
		//DAOの宣言
		UriageDAO dao = new UriageDAO();

		//どの売り上げが見たいか
		System.out.println("どの売り上げが見たいですか？");
		int sid = new java.util.Scanner(System.in).nextInt();
		System.out.println();
		
		//Listの宣言
		ArrayList<Uriage> list = dao.findBySid(sid);
		
		//日付、個数の表示
		System.out.println("   日付     " +  "個数");
		for(Uriage u :list) {
			System.out.println(u.getHi() + "   " + u.getKosu());
		}

	}

}
