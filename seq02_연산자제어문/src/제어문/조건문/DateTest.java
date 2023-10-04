package 제어문.조건문;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		//deprecated 앞으로 사용 안할꺼다. 권장하지 않는다.
		
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
	
		int year = date.getYear() + 1900;//1900 + 123
		int month = date.getMonth() + 1; //음력 기준 -> 양력
		int today = date.getDate();
		System.out.println(year + " " + month + " " + today);
		
		//요일
		int day = date.getDay();//요일 0~6, 0이 일요일
		System.out.println(day); 
		
	}

}
