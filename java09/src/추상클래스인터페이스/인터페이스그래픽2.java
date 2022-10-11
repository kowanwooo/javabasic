package 추상클래스인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 인터페이스그래픽2 implements ActionListener{
	static JButton b1, b2;
	static TextArea area;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,600);
		f.setLayout(new FlowLayout());
		
		b1 = new JButton("나도 눌러요.");
		b2 = new JButton("나도 눌러요.");
		
		인터페이스그래픽2 act3 = new 인터페이스그래픽2();
		
		b1.addActionListener(act3);
		b2.addActionListener(act3);
		
		f.add(b1);
		f.add(b2);
				
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		area = new TextArea(6, 13);
		area.setFont(font);
		f.add(area);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			area.append("b1클릭함. \n");
			System.out.println("b1클릭함.");
		} else {
			area.append("b2클릭함. \n");
			System.out.println("b2클릭함.");
		}
	}
}
