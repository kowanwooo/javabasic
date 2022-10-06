package 상속활용;

public class 멀티스레드사용 {
	public static void main(String[] args) {
		멀티스레드1 멀티1 = new 멀티스레드1();
		멀티스레드2 멀티2 = new 멀티스레드2();
		
		멀티1.start();
		멀티2.start();
	}
}
