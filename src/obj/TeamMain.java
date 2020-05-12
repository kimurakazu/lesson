package obj;

public class TeamMain {

	public static void main(String[] args) {
		Team t = new Team("ロアッソ熊本",5,2);
		
		System.out.println(t.getName() + " " + t.getWin() + "勝 " + t.getLose() + "敗");

	}

}
