package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class 나의두번쨰윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(102, 204, 51));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(43, 48, 57, 21);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(168, 39, 262, 44);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(43, 131, 96, 54);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(168, 139, 262, 44);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(168, 237, 262, 44);
		f.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("주소");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(43, 229, 80, 54);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBounds(61, 342, 148, 54);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton_1.setBounds(261, 342, 148, 54);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
