package 형변환;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {
	static JFrame f;
	
	public static void main(String[] args) {
		f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(618, 692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("빨간신호");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				신호등.show("red.jpg");
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(63, 25, 152, 53);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("노란신호");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				신호등.show("yellow.jpg");
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(231, 25, 152, 53);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("초록신호");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				신호등.show("green.jpg");
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2.setBounds(395, 25, 152, 53);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
	
	public static void show(String name) {
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon(name);
		img.setIcon(icon);
		f.getContentPane().add(img);
		f.setVisible(true);
	}
	
}
