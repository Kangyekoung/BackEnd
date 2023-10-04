package 배열기본;

public class 배열기초확인 {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		System.out.println(array.length);
		array[0] = 100;
		System.out.println(array[0]);
		
		array[2] = 500;
		
		array[array.length -1] = 200;
		
		for (int i : array) {
			System.out.println(i);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " : " + array[i]);
		}
	}

}
