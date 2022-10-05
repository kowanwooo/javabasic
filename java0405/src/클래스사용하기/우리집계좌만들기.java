package 클래스사용하기;

import 클래스만들기.계좌;

public class 우리집계좌만들기 {
	public static void main(String[] args) {
		계좌 dad = new 계좌();
		dad.이름 = "홍길동";
		dad.계좌이름 = "튼튼적금";
		dad.금액 = 1000;
		
		dad.입금();
		dad.출금();
	}
}
