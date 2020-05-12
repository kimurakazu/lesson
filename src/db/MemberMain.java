package db;

import java.util.ArrayList;

public class MemberMain {
	public static void main(String[] args) {
		
		//DAOの宣言
		MemberDAO mDao = new MemberDAO();
		
		//midと名前すべてを表示
		ArrayList<Member> mlist = mDao.findAll();
		System.out.println("[mid]   [名前]");
		for(Member m : mlist) {
			System.out.println("  " + m.getMid() + "      " + m.getName());
		}
		
		//改行
		System.out.println();
		
		//mid検索
		System.out.println("検索したいmidを入力してください：");
		Member m = mDao.findByMid(new java.util.Scanner(System.in).nextInt());
		System.out.println(m.getAdr());
		
		
	}
}
