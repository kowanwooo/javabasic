package 연산자;

import javax.swing.JOptionPane;

public class Exam02 {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키 입력");
		double height2 = Double.parseDouble(height);
		double height3 = (height2 - 100) * 0.9;
		
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + height3);
		
	}
}
