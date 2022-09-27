package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 조건문확인문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 204, 0));
		f.setBackground(new Color(0, 204, 0));
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(27, 46, 155, 53);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("수학점수");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 382, 155, 53);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("당신의 나이는");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(27, 167, 155, 53);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("국어점수");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(27, 319, 155, 53);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String food = t1.getText();
				if(food.equals("국밥")) {
					JOptionPane.showMessageDialog(f, "국밥집으로..");
				}else {
					JOptionPane.showMessageDialog(f, "알아서 찾아가세요..");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(27, 110, 414, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String age = t2.getText();
				int age1 = Integer.parseInt(age);
				JOptionPane.showMessageDialog(f, "내년 나이 : " + (age1 + 1));
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBounds(27, 238, 414, 47);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String score1 = t3.getText();
				String score2 = t4.getText();
				double score11 = Integer.parseInt(score1);
				double score22 = Integer.parseInt(score2);
				double result = (score11 + score22) / 2;
				JOptionPane.showMessageDialog(f, "평균 : " + result);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_2.setBounds(27, 445, 414, 47);
		f.getContentPane().add(btnNewButton_2);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBackground(new Color(255, 255, 153));
		t1.setBounds(223, 46, 203, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setBackground(new Color(255, 153, 204));
		t2.setColumns(10);
		t2.setBounds(223, 167, 203, 53);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setBackground(new Color(0, 153, 255));
		t3.setColumns(10);
		t3.setBounds(223, 321, 203, 53);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("굴림", Font.PLAIN, 20));
		t4.setBackground(new Color(0, 153, 255));
		t4.setColumns(10);
		t4.setBounds(223, 382, 203, 53);
		f.getContentPane().add(t4);
		f.setVisible(true);
	}
}
