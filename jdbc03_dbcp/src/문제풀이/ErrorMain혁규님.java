package 문제풀이;

public class ErrorMain혁규님 {
	public static void main(String[] s) {
		try {
			Error e = new Error();
			e.arr(); //실행에러 
		}catch(Exception e) {
			System.out.println("배열 인덱스 에러가 발생함");
		}
		System.out.println("여기는 실행되어야만 해");
	}
}