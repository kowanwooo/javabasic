package 클래스사용하기;

import 클래스만들기.계산기;

public class 내가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int result = cal.add(200, 100);
		System.out.println(result);
		double result2 = cal.add(200, 100);
		System.out.println(result2);
		double result3 = cal.add(200, 100.2);
		System.out.println(result3);
		String result4 = cal.add("ok", 100);
		System.out.println(result4);
		int result5 = cal.minti(5, 5);
		System.out.println(result5);
		double result6 = cal.div(32.5, 4);
		System.out.println(result6);
	}

}
