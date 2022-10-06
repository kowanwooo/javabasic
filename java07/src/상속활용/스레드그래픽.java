package 상속활용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, day;
	
	카운터스레드2 count2;
	시각스레드2 day2;
	이미지스레드2 image2;
	
	public 스레드그래픽() {
		setSize(800, 300);
		count = new JLabel("카운터");
		image = new JLabel("이미지");
		day = new JLabel("시각");

		Font font = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		day.setFont(font);
		image.setFont(font);

		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);

		setVisible(true);
		
		count2 = new 카운터스레드2();
		day2 = new 시각스레드2();
		image2 = new 이미지스레드2();
		
		image2.start();
		day2.start();
		count2.start();
	}

	public static void main(String[] args) {

		스레드그래픽 name = new 스레드그래픽();
	}

	public class 시각스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				day.setText("카운트 >> " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public class 이미지스레드2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };

			for (int i = 0; i < list.length; i++) {
				image.setText("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public class 카운터스레드2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				count.setText("카운트 >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실부탁드립니다.");
					image2.stop();
				}
			}

		}
	}
}
