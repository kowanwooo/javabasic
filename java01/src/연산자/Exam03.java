package 연산자;

import javax.swing.JOptionPane;

public class Exam03 {
	public static void main(String[] args) {
		String telecom = JOptionPane.showInputDialog("통신사 입력 : ");
		String tel = JOptionPane.showInputDialog("전화번호 입력 : ");
		String name = JOptionPane.showInputDialog("가입자이름 입력 : ");
		
		String result = name + "님은 " + telecom + "에 " + tel;
		
		JOptionPane.showMessageDialog(null, "다이얼로그로 " + result + "로 가입되셨습니다.");
		
	}
}
