package 메서드연습;

public class 내가게 {

	public static void main(String[] args) {
		int coffeePrice = 5000;
		int coffeeCount = 15;
		
		//커피계싼가격이 5만원이상이면
		//5000원을 할인해주려고 한다.
		
		계산기 cal = new 계산기();
		int result = cal.mul(coffeePrice, coffeeCount);
		
		if (result >= 50000) {
			System.out.println("최종 계산금액 " + (result - 5000));
		} else {
			System.out.println("최종 계산금액 " + result);
		}
		
		//1. arry()를 호출하여 결과를 받아온 후, 
		//배열의 첫번째 값에 100을 더해 프린트
		int[] arrResult = cal.array();
		System.out.println(arrResult[0] + 100);
		
		//2. get2("win2", "1234", "win2", "010")을 호출하여
		//결과를 받아온 후,
		//비밀번호를 111로 수정 후
		//전체 멤버정보 프린트
		MemberVO vo = cal.get2("win2", "1234", "win2", "010");
		vo.setPw("1111");
		System.out.println(vo);
		
		
		//3. get4("홍길동", 100)을 호출하여
		//결과를 받아온 후,
		//맨 뒤에 "입니다.환영해주세요"를 붙여서
		//프린트
		String strResult = cal.get4("홍길동", 100);
		System.out.println(strResult + "입니다. 환영해주세요.");
	}
}
