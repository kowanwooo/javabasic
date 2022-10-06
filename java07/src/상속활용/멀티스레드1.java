package 상속활용;

import javax.swing.JOptionPane;

public class 멀티스레드1 extends Thread {
	@Override
	public void run() {
		for (int i = 30; i >= 0; i--) {
			System.out.println("멀티스레드1 >> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "멀티스레드가 끝났습니다.");
			}
		}

	}
}
