package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인제대로 {
	public static void main(String[] args) {
		String id = "root";
		String pw = "pass";
		
		String id2 = JOptionPane.showInputDialog("로그인 id");
		String pw2 = JOptionPane.showInputDialog("로그인 pw");
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
