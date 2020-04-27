package sukkiri;

public class KujiMain {

	public static void main(String[] args) {
		
		Kuji num1 = new Kuji();
		Kuji num2 = new Kuji();
		Kuji num3 = new Kuji();
		
		num1.number = 123456;
		num2.number = 101012;
		num3.number = 654321;
		
		KujiChecker ch = new KujiChecker();
		
		ch.check(num1);
		ch.check(num2);
		ch.check(num3);
		
		num1.show();
		num2.show();
		num3.show();
		
		System.out.println("合計" + ch.en + "円");

	}

}
