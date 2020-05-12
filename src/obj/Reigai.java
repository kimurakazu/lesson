package obj;

import java.io.FileWriter;
import java.io.IOException;

public class Reigai {
	public static void main(String[] args) {
//		try (FileWriter fw = new FileWriter("data.txt");){
//			fw.write("Hello");
//		} catch (IOException e) {
//			System.out.println("エラー：" + e.getMessage());
//		}
		try {
			sub();
		} catch (IOException e) {
			System.out.println("エラー：" + e.getMessage());
		}

	}


	public static void sub() throws IOException {
			subsub();
	}

	public static void subsub() throws IOException {
		FileWriter fw = new FileWriter("*data.txt");
	}

}