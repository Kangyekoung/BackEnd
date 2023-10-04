package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {
		//랜덤하게 아무거나 만들어서 자동으로 배열에 여러개 넣어보자.
		Random r = new Random();
		int[] n2 = new int[1000];
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			n2[i] = r.nextInt(100); //0~99
			//System.out.println(n);
		}
		
		for (int x : n2) {
			sum = sum + x;
		}
		
		double avg = (double)sum / n2.length;
		
		System.out.println(Arrays.toString(n2));
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
