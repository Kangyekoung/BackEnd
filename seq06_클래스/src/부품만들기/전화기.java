package 부품만들기;

public class 전화기 {
	//멤버변수 + 멤버메서드
	public int size;
	public String speaker;
	
	public void 인터넷하다() {
		System.out.println("크롬으로 하다.");
	}
	
	//상속받은 메서드가 8개 있음
	//눈에 안보임.
	//상속받은 메서드를 재정해서 마음대로 고쳐쓸 수 있음.

	@Override
	public String toString() {
		return "사이즈는 " + size + "이고, 회사는 =" + speaker;
	}
}
