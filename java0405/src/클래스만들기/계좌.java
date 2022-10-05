package 클래스만들기;

public class 계좌 {

	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	public void 입금() {
		System.out.println(이름 + "이" + 금액 + "원을 입금");
	}
	public void 출금() {
		System.out.println(이름 + "이" + 계좌이름 + "에서 출금");
	}
	
}
