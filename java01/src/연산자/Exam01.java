package 연산자;

import javax.swing.JOptionPane;

public class Exam01 {
	public static void main(String[] args) {
		String width = JOptionPane.showInputDialog("width 입력");
		String height = JOptionPane.showInputDialog("height 입력");
		int width2 = Integer.parseInt(width);
		int height2 = Integer.parseInt(height);
		int Square = width2 * height2;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + Square);
		
	}
}
