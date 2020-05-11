package db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UriageDAO {
	// 定数宣言
	static final String URL =  "jdbc:mysql://localhost/hanbai?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	//findAll
	public ArrayList<Uriage> findAll(){
		ArrayList<Uriage> list = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){
			String sql = "select * from uriage";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()){
				int uid = rs.getInt("uid");
				int sid = rs.getInt("sid");
				int kosu = rs.getInt("kosu");
				Date hi = rs.getDate("hi");

				Uriage u = new Uriage(uid,sid,kosu,hi);
				list.add(u);

			}

			stmt.close();


		}catch(SQLException e){
			System.out.println("findAllエラー" + e.getMessage());
		}


		return list;
	}

	//find
	public Uriage findByUid(int uid) {
			Uriage u = null;
			try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

				String sql = "select * from Uriage where sid = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, uid);

				ResultSet rs = stmt.executeQuery();

				if(rs.next()){
					int sid = rs.getInt("sid");
					int kosu = rs.getInt("kosu");
					Date hi = rs.getDate("hi");
					u = new Uriage(uid,sid,kosu,hi);
				}

				stmt.close();

			} catch (SQLException e) {
				System.out.println("findByUidエラー" + e.getMessage());
			}
			return u;
		}

	//Insert
	public void insert(Uriage u) {
		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

			String sql = "INSERT INTO uriage (sid,kosu,hi) VALUES(?,?,curdate())";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,u.getSid());
			stmt.setInt(2, u.getKosu());
//			stmt.setDate(3, u.getHi());

			stmt.execute();

			stmt.close();

		} catch (SQLException e) {
			System.out.println("insert" + e.getMessage());
		}
	}
}
