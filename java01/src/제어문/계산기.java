package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {
	private static JTextField num1;
	private static JTextField num2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(new Color(0, 0, 204));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 39));
		lblNewLabel.setBounds(65, 190, 122, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(new Color(0, 0, 204));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 39));
		lblNewLabel_1.setBounds(65, 250, 122, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		num1 = new JTextField();
		num1.setBounds(189, 190, 212, 50);
		f.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(189, 250, 212, 50);
		f.getContentPane().add(num2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java01\\img\\red.png"));
		btnNewButton.setBounds(0, 0, 484, 180);
		f.getContentPane().add(btnNewButton);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = num1.getText();
				String n2 = num2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				JOptionPane.showMessageDialog(f, n11*n22);
			}
		});
		mul.setFont(new Font("굴림", Font.BOLD, 25));
		mul.setBounds(250, 339, 101, 67);
		f.getContentPane().add(mul);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = num1.getText();
				String n2 = num2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
//				JOptionPane.showMessageDialog(f, n11+n22);
				f.setTitle("더한 결과 : " + (n11 + n22));
				num1.setText(" ");
				num2.setText(" ");
//				num1.setBackground(Color.blue);
//				num2.setBackground(Color.blue);
			}
		});
		plus.setFont(new Font("굴림", Font.BOLD, 25));
		plus.setBounds(32, 339, 101, 67);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = num1.getText();
				String n2 = num2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				JOptionPane.showMessageDialog(f, n11-n22);
				
			}
		});
		minus.setFont(new Font("굴림", Font.BOLD, 25));
		minus.setBounds(145, 339, 101, 67);
		f.getContentPane().add(minus);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = num1.getText();
				String n2 = num2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				JOptionPane.showMessageDialog(f, n11/n22);
			}
		});
		div.setFont(new Font("굴림", Font.BOLD, 25));
		div.setBounds(363, 339, 101, 67);
		f.getContentPane().add(div);
		f.setVisible(true);
	}
}
