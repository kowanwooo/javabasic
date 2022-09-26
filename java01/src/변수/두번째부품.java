package 변수;

import javax.swing.JOptionPane;

public class 두번째부품 {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 나이는 " + age + "이시군요!");
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 취미은 " + hobby + "이시군요!");
		String name = JOptionPane.showInputDialog("당신의 이름를 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이시군요!");
		

	}

}
