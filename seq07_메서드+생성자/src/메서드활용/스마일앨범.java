package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스마일앨범 {
	public static int start = 2;

	public static void main(String[] args) {
		String[] title = { "크레이터", "1947보스톤", "30일", "거미집", "더넌2" };
		String[] img = { "1.jpeg", "2.jpeg", "3.jpeg", "4.jpeg", "5.jpeg" };
		double[] jumsu = { 7.2, 7.6, 7.8, 6.5, 6.7 };

		JFrame f = new JFrame("나의 스마일앨범");
		f.setSize(800, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.green);

		// 라벨 3개
		JLabel top = new JLabel(title[2]);
		ImageIcon icon = new ImageIcon(img[2]);
		JLabel center = new JLabel(icon);
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		// 버튼 2개
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");
		// 폰트
		Font font = new Font("궁서", Font.BOLD, 40);

		top.setFont(font);
		left.setFont(font);
		right.setFont(font);
		under.setFont(font);

		f.add(top, BorderLayout.NORTH); // 북
		f.add(left, BorderLayout.WEST); // 서
		f.add(center, BorderLayout.CENTER);// 가운데
		f.add(right, BorderLayout.EAST); // 동
		f.add(under, BorderLayout.SOUTH); // 남

		// 색 지정
		left.setBackground(Color.yellow);
		left.setForeground(Color.blue);
		right.setBackground(Color.yellow);
		right.setForeground(Color.blue);
		top.setForeground(Color.red);
		under.setForeground(Color.red);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (start <= 0) {
					JOptionPane.showMessageDialog(f, "마지막입니다.");

				} else {
					start--; // 1
					top.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
					under.setText(String.valueOf(jumsu[start]));
				}
			}
		});
		;

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (start >= 4) {
					JOptionPane.showMessageDialog(f, "마지막입니다.");

				} else {
					start++; // 3
					top.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
					under.setText(String.valueOf(jumsu[start]));
				}
			}
		});
		;

		f.setVisible(true);
	}

}
