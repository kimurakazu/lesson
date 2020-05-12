package db;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;


public class dbsample {

	//Main
	public static void main(String[] args) {

		ShouhinDAO dao = new ShouhinDAO();

		//すべて検索
		ArrayList<Shouhin> slist = dao.findAll();


		//１つだけ検索
		Shouhin s = dao.findBySid(2);
		System.out.println(s.getName());

		//追加
//		Shouhin s1 = new Shouhin(0,"バナナ",110);
//		dao.insert(s1);
//
//		//変更
//		Shouhin s2 = new Shouhin(4,"メロン",600);
//		dao.update(s2);
//
//		//削除
//		dao.delete(5);

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

//		//DAOの宣言
		UriageDAO uDao = new UriageDAO();
//
//		//すべての表示
		ArrayList<Uriage> list = uDao.findAll();
		System.out.println("sid 個数    日付");
		for(Uriage u : list) {
			System.out.println(" "  + u.getSid() + "    " + u.getKosu() + "   " + u.getHi());
		}

		//改行
//		System.out.println();

//		//uid[3]の表示
//		Uriage u = dao.findByUid(3);
//		System.out.println("sid[" + u.getSid() + "]は" + u.getHi() + "に" + u.getKosu() + "個売れました。");

		//Insert文
		Calendar c = Calendar.getInstance();
		c.set(2020,5-1,12);
		Date d = new Date(c.getTimeInMillis());
//		Uriage u2 = new Uriage(0,2,7,d);
//		uDao.insert(u2);
//
//		//update文
//		Uriage u3 = new Uriage(5,3,2,d);
//		uDao.update(u3);
//
//		//delete文
//		uDao.delete(5);

		System.out.println();
		//uidでの検索
		Uriage u4 = uDao.findByUid(2);
		System.out.println(" "  + u4.getSid() + "    " + u4.getKosu() + "   " + u4.getHi());


		System.out.println();
		//sidでの検索
		ArrayList<Uriage> ulist2 = uDao.findBySid(1);
		for(Uriage u : ulist2) {
			System.out.println(" "  + u.getSid() + "    " + u.getKosu() + "   " + u.getHi());
		}

//		--------------------------------売り上げここまで----------------------------------
	}


}
