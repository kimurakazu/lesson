package obj;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		for(String c : colors) {
			System.out.println(c);
		}

	}

}
