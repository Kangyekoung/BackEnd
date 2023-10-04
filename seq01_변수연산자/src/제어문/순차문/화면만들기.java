package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 화면만들기 {

	public static void main(String[] args) {
		// JFrame f
		JFrame f = new JFrame(); //마우스위로 올라가서 f2
		f.setSize(500, 500);// 사이즈 지정
	
		//배치해주는 부품을 따로 설정하지 않으면 다 가운데로 들어가버림.!
		//물흐르듯이 순서대로 배치해주는 부품을 써야함
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// JButton b
		JButton b = new JButton();
		b.setText("나의 정보 확인");
		
		f.add(b); //f에 b를 올려라.!
		
		// JTextField t1, t2, t3
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.setVisible(true); //화면 보이기
		
		

	}

}
