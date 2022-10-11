package 추상클래스인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 인터페이스그래픽 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,600);
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("나도 눌러요.");
		JButton b2 = new JButton("나도 눌러요.");
		
		버튼1처리클래스 act1 = new 버튼1처리클래스();
		버튼2처리클래스 act2 = new 버튼2처리클래스();
		
		b1.addActionListener(act1);
		b2.addActionListener(act2);
		
		f.add(b1);
		f.add(b2);
				
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		TextArea area = new TextArea(6, 13);
		area.setFont(font);
		f.add(area);
		
		f.setVisible(true);
	}
}
