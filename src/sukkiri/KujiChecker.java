package sukkiri;

public class KujiChecker {
	int en;
	
	public void check(Kuji k) {
		if(k.number == 123456) {
			en += 100000;
			k.result = "1等";
		} else if (k.number % 100 == 12) {
			en += 1000;
			k.result = "2等";
		} else {
			k.result = "はずれ";
		}
		
 	}
}
