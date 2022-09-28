package 조건문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		int no = 0;
		int count = 0; 
		while (true) {
			String data = JOptionPane.showInputDialog("숫자입력");
			int data2 = Integer.parseInt(data);
			count++;
			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다.");
				break;
			} else {
				no++;
				System.out.println("정답이 아닙니다.!!");
				if (data2 > target) {
					System.out.println("너무 커요");
				} else {
					System.out.println("너무 작아요");
				}
			}
		}
		System.out.println("전체 시도 횟수: " + count + "회");
		System.out.println("틀린 시도 횟수: " + no + "회");
	}//main

}//class
