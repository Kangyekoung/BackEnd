package 배열응용;

public class 여러개배열사용 {

	public static void main(String[] args) {
		String[] 식구 =  {"아버지","어머니","형","나","동생"};
		int[] 나이 = {100, 99, 88, 77, 55};
		double[] 키 = {199.9, 189.9, 179.9, 169.9, 159.9};
		
//		System.out.println(식구[0] + " " + 나이[0] + " " + 키[0]);
//		System.out.println(식구[4] + " " + 나이[4] + " " + 키[4]);
		
		System.out.println("==================");
		System.out.println("===우리집 식구 정리===");
		System.out.println("==================");
		
		
		//반복문 이용하면 우리가족 프린트!
		for (int i = 0; i < 키.length; i++) {			
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
		}
		
		//우리가족 내년 나이 +1
		for (int i = 0; i < 키.length; i++) {
			//나이[i] = 나이[i] + 1;
			나이[i]++;
		}
		//동생만 키가 5cm가 컸음.
		키[4] = 키[4]+ 5;
		//1. 동생이 어디 있는지 알고 있으면 바로 5더해서 저장.(**index 4에 있음)
		//2. 동생이 어디 있는지 모르면 위치를 찾아서 5더해서 저장
		System.out.println(키[4]+ 5);
		
		for (int i = 0; i < 키.length; i++) {
			if(식구[i].equals("동생")) {
				
			}
		}
		
	
	}

}
