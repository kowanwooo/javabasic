package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {

	static int start = 2;

	public static void main(String[] args) {
		String[] title = { "공조2", "헌트", "아바타", "늑대사냥", "명량" };
		String[] img = { "공조.jpg", "/헌트.jpg", "아바타.jpg", "늑대사냥.jpg", "명량.jpg" };
		double[] jumsu = { 7.9, 8.0, 9.0, 8.7, 10.0 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(397, 399);

		JLabel top = new JLabel("아바타");
		top.setBackground(Color.ORANGE);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java03\\img\\" + img[2]));
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("9.0");
		under.setBackground(Color.ORANGE);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(start > 0) {
					start = start - 1;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java03\\img\\" + img[start]));
				}else {
					JOptionPane.showMessageDialog(f, "왼쪽끝");
				}

			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(start < 4 ) {
					start = start + 1;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					center.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\javabasic\\java03\\img\\" + img[start]));
				}else {
					JOptionPane.showMessageDialog(f, "오른쪽끝");
				}
				
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);

	}
}
