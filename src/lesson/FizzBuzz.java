package lesson;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i<=30; i++) {
			System.out.println(getFizzBuzz(i));
		}

	}
	
	public static String getFizzBuzz (int num) {
		if(num % 15 == 0) {
			return "FizzBuzz";
		}else if (num % 3 == 0){
			return "Fizz";
		}else if (num % 5 == 0) {
			return "Buzz";
		}else {
			return String.valueOf(num);
		}
	}
}
