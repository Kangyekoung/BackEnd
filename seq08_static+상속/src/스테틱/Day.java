package 스테틱;

public class Day {
	public String doing;
	public int time;
	public String location;
	public static int count;
	public static int sum;
	//객체생성시 초기값을 자동으로 넣어주고 싶을 때
	//생성자 메서드
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
	}
	
	//객체생성후, 값들 출력하고 싶을 때
	//toString()
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
}
