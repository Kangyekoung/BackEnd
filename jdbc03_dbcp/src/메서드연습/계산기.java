package 메서드연습;

import java.util.ArrayList;

public class 계산기 {
	//1. 데이터 입력
	//2. 처리 
	//3. 결과
	public void add(int x, int y) { 
		//void 리턴이 없다.
		int sum = x + y;
		System.out.println("계산결과는" + sum + "원");
	}
	
	public int add2(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	public int mul(int x, int y) {
		int sum = x * y;
		return sum;
	}
	
	public int[] array() {
		int[] arr = {1,2,3};
		return arr; //참조형변수(주소), 100
	}
	
	public double[] arr2() {
		double[] arr2 = {11.1, 22.2};
		return arr2;
	}
	
	public int result() {
		int result = 0;
		return result;
	} 
	
	public void get1() {
		MemberVO bag = new MemberVO();
		bag.setId("win");	//힙영역에 있는 id변수에 win을 넣으.
		bag.setPw("1234");
		bag.setName("win");
		bag.setTel("010");
		
		System.out.println(bag);
		
	}
	
	//입력값 가지고 가방에 넣어주자
	public MemberVO get2(String id,String pw, String name, String tel) {
		MemberVO bag = new MemberVO();
		bag.setId(id);	//힙영역에 있는 id변수에 win을 넣으.
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		return bag;
		
	}
	
	public ArrayList get3(String name, int age) {
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(age);
		return list;
	}

	public String get4(String name, int age) {
		String s = "제 이름은 " + name + "이고 나이는 " + age;
		return s;
	}

}
