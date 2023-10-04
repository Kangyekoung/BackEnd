package 연산자;

public class 연사자주의점 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 4;
		
		int sum = n1 + n2;
		//자바의 연산시 정수와 정수 연산은 무조건 정수!!!
		int avg = sum / 2; //4!
		
		//자바의 연산시 하나라도 실수이면 무조건 실수!!!
		
		System.out.println(avg);
		
		System.out.println("-----------");
		
		// double avg2 = sum / 2.0;
		double avg2 = (double)sum / 2.0; //강제형변환(casting, 캐스팅, 기본데이터타입만)
		System.out.println(avg2);
		
	}

}
