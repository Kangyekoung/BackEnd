package 배열기본;

public class 배열만들기타입별로 {

	public static void main(String[] args) {
		// int, char, String, JButton,
		int[] age = { 200, 100, 50, 10 }; // 4개 고정!
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (int x : age) {
			System.out.print(x + " ");
		}
		System.out.println();

		double[] weight = { 99.9, 88.8, 77.7, 66.6 };
		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i] + " ");
		}
		System.out.println();
		for (double d : weight) {
			System.out.print(d + " ");
		}

		// 이름 ==> String[] name
		// 성별 ==> char[] gender
		// 아침여부 ==>boolean[] food
		String[] name = { "박진수", "강혜경", "박시우", "박시윤" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " ");
		}
		System.out.println();
		for (String string : name) {
			System.out.println(string);
		}
		System.out.println();
		// 성별 ==> char[] gender
		char[] gender = { '남', '여', '남', '남' };
		for (char c : gender) {
			System.out.println(c + " ");
		}
		System.out.println();
		//아침여부 ==> boolean 
		boolean[] food = { true, false, false, false };

	}

}
