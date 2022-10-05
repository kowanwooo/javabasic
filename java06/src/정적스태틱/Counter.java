package 정적스태틱;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel center = new JLabel("0");
		center.setFont(new Font("굴림", Font.PLAIN, 39));
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setBounds(140, 136, 207, 210);
		f.getContentPane().add(center);
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				center.setText(count + "");
			}
		});
		btnNewButton.setBounds(12, 29, 151, 46);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0으로 초기화");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				center.setText("0");
			}
		});
		btnNewButton_1.setBounds(175, 29, 151, 46);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1빼기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				center.setText(count + "");
			}
		});
		btnNewButton_2.setBounds(333, 29, 151, 46);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
