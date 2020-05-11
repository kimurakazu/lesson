package db;

import java.sql.Date;
import java.util.ArrayList;

public class dbsample {

	//Main
	public static void main(String[] args) {

//		----------------------------------------商品-------------------------------------
//
//		ShouhinDAO dao = new ShouhinDAO();
//
//		Shouhin s = new Shouhin(0,"バナナ",110);
//		dao.update(s);
//		dao.insert(s);
//
//		insert("なし",90);
//		update(7,"かき",100);
//		find(3);
//		select();
//		Shouhin s = dao.findBySid(3);
//		System.out.println(s.getName());
//		ArrayList<Shouhin> list = dao.findAll();
//		for(Shouhin s:list) {
//			System.out.println(s.getName());
//		}
//		dao.delete(9);
//		-------------------------------------商品ここまで----------------------------


//		-------------------------------------売り上げ---------------------------------

		//DAOの宣言
		UriageDAO dao = new UriageDAO();

		//すべての表示
		ArrayList<Uriage> list = dao.findAll();
		System.out.println("sid 個数    日付");
		for(Uriage u : list) {
			System.out.println(" "  + u.getSid() + "    " + u.getKosu() + "   " + u.getHi());
		}

		//改行
		System.out.println();

		//uid[3]の表示
		Uriage u = dao.findByUid(3);
		System.out.println("sid[" + u.getSid() + "]は" + u.getHi() + "に" + u.getKosu() + "個売れました。");

		//Insert文
		Date d = new Date(2020,5,11);
		Uriage u2 = new Uriage(6,2,7,d);
		dao.insert(u2);

//		--------------------------------売り上げここまで----------------------------------
	}


}
