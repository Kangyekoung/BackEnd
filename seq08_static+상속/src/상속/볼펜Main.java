package 상속;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		
		pen.price = 2000;
		pen.company = "모나미";
		pen.thick= "0.3mm";
		
		pen.buy();;
		pen.write();
	}

}
