package 생성자;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	static int count;
	static int 짬뽕count;
	static int 우동count;
	static int 짜장count;
	static final int PRICE = 5000;
	
	private static JTextField t1;
	private static JTextField result;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 음식 주문 프로그램");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 25));
		t1.setBounds(280, 20, 95, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel = new JLabel("개수 :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(225, 22, 57, 47);
		f.getContentPane().add(lblNewLabel);
		
		result = new JTextField();
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setText("결제금액 : ");
		result.setForeground(Color.RED);
		result.setBackground(Color.GREEN);
		result.setBounds(56, 294, 297, 57);
		f.getContentPane().add(result);
		result.setColumns(10);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java06\\짬뽕jpg.jpg"));
		center.setBounds(62, 79, 259, 194);
		f.getContentPane().add(center);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				짬뽕count++;
				f.setTitle("짬뽕 : " + 짬뽕count + " 우동 : " + 우동count + " 짜장 : " + 짜장count);
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java06\\짬뽕jpg.jpg"));
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton.setBounds(12, 23, 69, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				우동count++;
				f.setTitle("짬뽕 : " + 짬뽕count + " 우동 : " + 우동count + " 짜장 : " + 짜장count);
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java06\\우동jpg.jpg"));
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_1.setBounds(82, 23, 69, 47);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장count++;
				f.setTitle("짬뽕 : " + 짬뽕count + " 우동 : " + 우동count + " 짜장 : " + 짜장count);
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java06\\짜장면jpg.jpg"));
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_2.setBounds(151, 23, 69, 47);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
