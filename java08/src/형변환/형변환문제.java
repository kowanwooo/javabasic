package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 형변환문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add("남");
		
		System.out.println(me);
		
		int money = (int)me.get(0);
		money += 1000; 
		System.out.println(money);
		
		double tall = (double)me.get(1);
		tall += 10;
		System.out.println(tall);
		
		boolean food = (boolean)me.get(2);
		if (food) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		String gender = (String)me.get(3);
		if (gender.equals("남")) {
			System.out.println("주민번호는 1, 3이예요.");
		} else {
			System.out.println("주민번호는 2, 4이예요.");
		}
		
		
		
	}
}
