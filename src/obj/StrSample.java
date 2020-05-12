package obj;

public class StrSample {

	public static void main(String[] args) {
		String s1 = "This is Java";
		String s2 = "java";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
		if(s1.isEmpty()) {
			System.out.println("空文字です");
		}
		
		if(s1.contains("Java")) {
			System.out.println("含まれてます");
		}
		
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0,4));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace("Java","C++"));
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("def");
		sb.append("ghi");
		
		String s = sb.toString();
		System.out.println(s);
	}

}
