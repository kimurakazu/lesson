package obj;

public class KukuMondai {
	int num1,num2;
	
	public KukuMondai() {
		num1 = new java.util.Random().nextInt(9) + 1;
		num2 = new java.util.Random().nextInt(9) + 1;
	}
	
	void show() {
		System.out.println(num1 + "*" + num2 + "=");
	}
	
	void check(int answer) {
		if(answer == num1 * num2) System.out.println("正解");
		else System.out.println("はずれ、正解は"+ num1*num2);
	}
}
