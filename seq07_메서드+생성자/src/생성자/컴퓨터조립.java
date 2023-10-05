package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(1000000, "삼성", 1500);
		컴퓨터 com2 = new 컴퓨터(2000000, "LG", 1980);
		
		System.out.println(com1);
		System.out.println(com2);
	}

}
