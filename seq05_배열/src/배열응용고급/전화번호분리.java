package 배열응용고급;

import java.util.Scanner;

public class 전화번호분리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		
		number = number.trim();
		
		String[] result = number.split("-");
		String res = "";
		
		if(result[0].equals("011")) {
			res = "SK";
		}else if(result.equals("019")) {
			res = "LG";
		}else {
			res = "Apple";
		}
		
		if(result[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
	}

}
