package 크롤링;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
public class 주식크롤링 {
	private static JTextField t1;
	public static JTextArea t2;
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBounds(120, 209, 166, 65);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(56, 270, 282, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextArea();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("Monospaced", Font.BOLD, 30));
		t2.setBounds(49, 397, 289, 229);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uD06C\uB864\uB9C1 \uC2DC\uC791");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = t1.getText();
				주식크롤링.use(s);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(56, 330, 284, 44);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0BC\uC131\uC804\uC790");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				주식크롤링.use("005930");
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(47, 25, 284, 44);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("모나미");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				주식크롤링.use("005360");
			}
		});
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1_1.setBounds(49, 93, 284, 44);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("셀트리온");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				주식크롤링.use("068270");
			}
		});
		btnNewButton_1_1_1.setBackground(Color.PINK);
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1_1_1.setBounds(49, 155, 284, 44);
		f.getContentPane().add(btnNewButton_1_1_1);
		f.setSize(400, 700);
		f.setVisible(true);
	}
	public static void use(String code) {
		크롤링연습6 cr = new 크롤링연습6();
		String result = cr.naver(code);
		t2.setText(result);
	}
}