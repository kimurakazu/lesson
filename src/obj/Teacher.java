package obj;

public class Teacher {
	String name;
	int nen,kumi;
	
	public Teacher(String name,int n,int k) {
		this.name = name;
		nen = n;
		kumi = k;
				
	}
	
	
	
	public Teacher(String name) {
		this(name,0,0);
	}



	public void show () {
		if(nen == 0 || kumi == 0) System.out.println(name + " 担任なし");
		else System.out.println( name + nen + "年" + kumi + "組担任");
	}
}
