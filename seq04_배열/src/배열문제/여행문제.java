package 배열문제;

public class 여행문제 {

	public static void main(String[] args) {
		String[] last = {"제주도", "양양", "속초"};
		String[] year = {"제주도", "부산", "울산"};
		
		int same = 0; int diff = 0;
		//비교하는데, String비교 == (x), equals(o) 
		
		for (int i = 0; i < last.length; i++) {
			if(last[i].equals(year[i])) {
				same++;
				System.out.println(year[i]);
			}else {
				diff++;
			}
		}
		//1.작년과 올해에도 가고 싶은 장소가 동일한 것은 몇 개인가?
		System.out.println(same);
		//2.작년과 올해에 가고 싶은 장소가 달라진 것은 몇 개인가?(우선순위가 바뀌거나 없는 것)
		System.out.println(diff);
		//1-2)작년과 올해에도 가고 싶은 장소가 동일한 곳은 "어디인가"?
		
		
		
		

	}

}
