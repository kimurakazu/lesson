package obj;

public class En implements Zukei {
	
	int n;
	
	public En(int n) {
		this.n = n;
	}
	
	public void menseki() {
		System.out.println("半径" + this.n + "の円の面積は" + this.n * this.n * 3.14);
	}
	
	public void enshu() {
		System.out.println("半径" + this.n + "の円周は" + 2 * this.n * 3.14);		
	}

	@Override
	public String toString() {
		return "半径=" + n;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(o instanceof En) {
			En e = (En)o;
			if(this.n == e.n) {
				return true;
			}
		}
		
		return false;
	}
}
